/*
 * String �迭�� �����Ͽ� �Է¹��� �� ���� split() ����Ͽ� " " ��� ����.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2043_�����Ǻ�й�ȣ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int P = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);

		System.out.println(P - K + 1);

	}

}
