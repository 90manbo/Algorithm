/* 
 * 1. 1부터 입력받은 숫자까지 반복문 돌면서 덧셈.
 * 2. 가우스 계산법 사용가능. (1+N)*N/2 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2025_N줄덧셈 {

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
