/*
 * 1. 1���� �Է¹��� ������ �ݺ��� ���鼭
 * 2. �Է¹��� ���� i�� ���� �������� 0�� ��� ����.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_1933_������N�Ǿ�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String result = "";

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				result += i + " ";
			}
		}
		System.out.println(result);
	}

}
