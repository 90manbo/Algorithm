/* 
 * 1. ���ٷ� �Է¹޾Ƽ� ������ �������� �迭�� ����. 
 * 2. int�� ����ȯ �� ������ ������ ������ Ȱ��.
 * 3. 2�� ���� �������� 1�� ��츸 ����.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2072_Ȧ�������ϱ� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int result = 0;
			String[] temp = br.readLine().split(" ");

			for (int i = 0; i < temp.length; i++) {
				int number = Integer.parseInt(temp[i]);
				if (number % 2 == 1) {
					result += number;
				}

			}
			System.out.println("#" + tc + " " + result);

		}
	}

}
