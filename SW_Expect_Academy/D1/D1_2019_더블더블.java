/*
 * 1. 입력값 + 2 크기의 배열 생성
 * 2. 1번 배열에 1 저장 
 * 3. i=2 부터 반복분 돌면서, 이전 수 *2 한 값을 다음 칸에 저장.
 * 4. 출력 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2019_더블더블 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] result = new int[N + 2];
		result[1] = 1;

		for (int i = 2; i < N + 2; i++) {
			result[i] = result[i - 1] * 2;
		}

		for (int i = 1; i < N + 2; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();

	}

}
