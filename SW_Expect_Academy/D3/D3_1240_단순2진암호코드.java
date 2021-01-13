import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_1240_�ܼ�2����ȣ�ڵ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] tmp = br.readLine().split(" ");
			int N = Integer.parseInt(tmp[0]);
			int M = Integer.parseInt(tmp[1]);

			int[][] arr = new int[N][M];

			for (int i = 0; i < N; i++) {
				char[] line = br.readLine().toCharArray();
				for (int j = 0; j < M; j++) {
					arr[i][j] = line[j] - '0';
				}

			}
			// 1 �����ϴ� �ε��� ã�� �κ�
			int di = 0;
			int dj = 0;
			boolean flag = false;
			for (int i = 0; i < N; i++) {
				if (flag == false) {
					for (int j = M - 1; j >= 0; j--) {
						if (arr[i][j] == 1) {
							di = i;
							dj = j;
							flag = true;
							break;
						}
					}
				} else {
					break;
				}
			}

			int idx = 0;

			int count = 0;

			int[] temp = new int[7];

			int checkCode1 = 0;
			int checkCode2 = 0;
			int checkCode3 = 0;

			for (int j = dj - 55; j < dj + 1; j++) { // ã�� 1�� �ε����� �迭�� �޺κ���. ���������� �̵�
				temp[idx++] = arr[di][j]; // �տ��� ���� 7���� ��� �ӽù迭�� ������.
				if (idx >= 7) {
					int x = Operator(temp);
					if ((count % 2) == 0 && count < 7) { // ¦������ �ε��� ���� ���� ����
						checkCode1 += x;
						count++;
					} else if ((count % 2) == 1 && count < 7) { // Ȧ�� ���� �ε��� ���� ���� ����
						checkCode2 += x;
						count++;
					} else if (count == 7) { // 7�� �ε��� �����ڵ�
						checkCode3 += x;
					}
					idx = 0;
				}
			}

			int result = (checkCode1 * 3) + checkCode2 + checkCode3; // ��ǰ�ڵ忡 ���� �˻�
			if ((result % 10) == 0) {
				System.out.println("#" + tc + " " + (checkCode1 + checkCode2 + checkCode3));
			} else {
				System.out.println("#" + tc + " " + 0);
			}

		}
	}

	public static int Operator(int[] array) {

		int value = -1;

		String[] check = { "0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011",
				"0110111", "0001011" };

		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i] + "";
		}

		for (int i = 0; i < check.length; i++) { // string�� 0���� ���ʴ�� ������.
			if (str.equals(check[i])) {
				value = i;
			}
		}

		return value;
	}
}
