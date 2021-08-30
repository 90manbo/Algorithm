/*
 * 1. �Է� ���� String�� Double������ ��ȯ�Ͽ� ����.
 * 2. ������ŭ ������, Math.round �Լ� ����Ͽ� �ݿø�.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2071_��հ����ϱ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			double result = 0;
			for (int i = 0; i < line.length; i++) {
				double temp = Double.parseDouble(line[i]);
				result += temp;
			}

			result = result / line.length;
			System.out.println("#" + tc + " " + Math.round(result));
		}
	}
}
