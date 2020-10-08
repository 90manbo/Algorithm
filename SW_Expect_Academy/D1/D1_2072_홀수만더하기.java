/* 
 * 1. 한줄로 입력받아서 공백을 기준으로 배열에 저장. 
 * 2. int로 형변환 후 나눗셈 나머지 연산을 활용.
 * 3. 2로 나눈 나머지가 1인 경우만 더함.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2072_홀수만더하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int result = 0;
			String[] temp = br.readLine().split(" ");

			for (int i = 0; i < temp.length; i++) {
				int number = Integer.parseInt(temp[i]);
				if (number % 2 == 1) {
					result += number;
				}

			}
			System.out.println("#" + tc + " " + result);

		}
	}

}
