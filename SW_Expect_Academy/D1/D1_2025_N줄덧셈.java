/* 
 * 1. 1���� �Է¹��� ���ڱ��� �ݺ��� ���鼭 ����.
 * 2. ���콺 ���� ��밡��. (1+N)*N/2 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2025_N�ٵ��� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 1; i <= N; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
