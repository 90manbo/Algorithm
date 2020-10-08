
/*
 * 1. String���� �Է¹��� ���ڿ� �迭�� parseInt�� ����Ͽ� �������� ��ȯ.
 * 2. ������� �ּҰ��� �����س���, �ݺ��� ����ؼ� ���ʴ�� ���ϸ� ����.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2068_�ִ�����ϱ� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			int result = Integer.MIN_VALUE;
			for (int i = 0; i < line.length; i++) {
				int tmp = Integer.parseInt(line[i]);
				if (result < tmp) {
					result = tmp;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
