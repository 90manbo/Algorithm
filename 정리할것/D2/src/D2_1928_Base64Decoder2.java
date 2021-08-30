import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D2_1928_Base64Decoder2 {

	static HashMap<Character, Integer> table = new HashMap<Character, Integer>();

	public static void makeTable() {
		// �빮�� �ֱ�
		for (int i = 0; i < 26; i++) {
			table.put((char) ('A' + i), i);
		}
		// �ҹ��� �ֱ�
		for (int i = 0; i < 26; i++) {
			table.put((char) ('a' + i), 26 + i);
		}
		// ���� �ֱ�
		for (int i = 0; i < 10; i++) {
			table.put((char) ('0' + i), 52 + i);
		}
		table.put('+', 62);
		table.put('/', 63);
	}

	// ���� ���ڸ� ���̺��� ã�� ���ڷ� �ٲ� ������ ����Ʈ�� ��ȯ�ؼ� �Ѱ��ش�.
	public static byte charToByte(char c) {
		// System.out.println((byte)(table.get(c) & 0xFF));
		return (byte) (table.get(c) & 0xFF);
	}

	public static int[] byteToBits(byte b) {
		// System.out.println(b);
		int bit_arr[] = new int[6];
		for (int k = 5; k > -1; k--) {
			if ((b & (1 << k)) != 0) {
				bit_arr[5 - k] = 1;
			} else
				bit_arr[5 - k] = 0;
		}
		return bit_arr;
	}

	// 8���� ����
	public static char bitsToChar(int bits[]) {
		int sum = 0;
		// System.out.println(Arrays.toString(bits));
		for (int i = 0; i < 8; i++) {
			if (bits[i] == 1) {
				sum += Math.pow(2, 7 - i);
			}
		}
		// System.out.println(sum);
		return (char) sum;
	}

	public static void main(String[] args) {
		// ���̺� ����� �α�: key: ���ڵ� ����, value: �� ������ ���ڰ�
		makeTable();

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			String e_str = sc.next();
			char e_char[] = e_str.toCharArray();
			StringBuilder d_str = new StringBuilder();
			int cnt = 0;

			for (int i = 0; i < e_str.length() / 4; i++) {
				ArrayList<Integer> de_bits = new ArrayList<Integer>();
				byte byte_temp[] = new byte[4];
				// 4���� ���� �б�
				for (int j = 0; j < 4; j++) {
					byte_temp[j] = charToByte(e_char[cnt++]);

					// ���� 19�� �������� �ű⼭ 6��Ʈ�� �ʿ��ϴ�.
					int bits[] = byteToBits(byte_temp[j]);
					for (int k = 0; k < bits.length; k++) {
						de_bits.add(bits[k]);
					}
				}

				// de_bits����Ʈ�� ��ϵ� ���ڿ��� 8���� ���� �о ���ڿ��� �ٲ� sb�� �߰��Ѵ�.
				int cnt2 = 0;
				for (int j = 0; j < 3; j++) {
					int bit8[] = new int[8];
					for (int k = 0; k < 8; k++) {
						bit8[k] = de_bits.get(cnt2++);
					}
					char temp = bitsToChar(bit8);
					d_str.append("" + temp);
				}
			}
			System.out.println("#" + t + " " + d_str.toString());
		}
		sc.close();
	}
}
