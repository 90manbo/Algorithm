import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���� : �ʺ� 10 �� ���� ���� ���ĺ����� ä��������
 */

public class D2_1946_�����Ѿ���Ǯ�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			String result = "";
			for (int i = 0; i < N; i++) {
				String[] line = br.readLine().split(" ");
				int count = Integer.parseInt(line[1]);

				for (int j = 0; j < count; j++) {
					result += line[0];
				}

			}
			System.out.println("#" + tc);
			int count = 0;
			for (int i = 0; i < result.length(); i++) {
				if (count == 10) {
					System.out.println();
					count = 0;
				}
				System.out.print(result.charAt(i));
				count++;
			}
			System.out.println();

		}

	}

}
