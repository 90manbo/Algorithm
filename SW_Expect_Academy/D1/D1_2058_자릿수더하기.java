/*
 * 1. String���� �Է¹���.
 * 2. �ݺ����� charAt����Ͽ� �� �ܾ ã�� ���ڿ� ������ ����.
 * 3. ��Ʈ������ ��ȯ�Ͽ� ���ϱ� �ݺ�.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2058_�ڸ������ϱ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		int result = 0;

		for (int i = 0; i < line.length(); i++) {
			int tmp = Integer.parseInt(line.charAt(i) + "");
			result += tmp;
		}
		System.out.println(result);
	}
}