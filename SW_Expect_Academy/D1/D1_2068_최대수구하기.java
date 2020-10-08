
/*
 * 1. String으로 입력받은 문자열 배열을 parseInt를 사용하여 십진수로 변환.
 * 2. 결과값에 최소값을 저장해놓고, 반복문 사용해서 차례대로 비교하며 갱신.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2068_최대수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			int result = Integer.MIN_VALUE;
			for (int i = 0; i < line.length; i++) {
				int tmp = Integer.parseInt(line[i]);
				if (result < tmp) {
					result = tmp;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
