/*
 * 입력받은 수부터 0 까지 1씩 줄면서 반복문 돌기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_1545_거꾸로출력해보아요 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = N; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
