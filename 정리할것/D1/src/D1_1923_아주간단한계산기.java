/*
 * 1. �� ���� �Է¹���.
 * 2. �� ���� ���� ����, ����, ����, �������� ����� ���.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_1923_���ְ����Ѱ��� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}

}
