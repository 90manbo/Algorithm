/*
 * 1. 1부터 입력받은 수까지 반복문 돌면서
 * 2. 입력받은 수를 i로 나눈 나머지가 0인 경우 저장.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_1933_간단한N의약수 {

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
