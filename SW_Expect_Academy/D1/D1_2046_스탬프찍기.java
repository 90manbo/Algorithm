/*
 * 1. 입력받은 숫자만큼 반복문 돌리기.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2046_스탬프찍기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			System.out.print("#");
		}
		System.out.println();
	}

}
