/*
 * 1. �Է� ���� ���ĺ��� ����ȯ�Ͽ� 64�� ����.
 * 2. ��Ʈ������ ����ȯ�� A�� 64.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2050_���ĺ������ڷκ�ȯ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] temp = new String[line.length()];

		for (int i = 0; i < line.length(); i++) {
			temp[i] = ((int) line.charAt(i) - 64) + "";
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
