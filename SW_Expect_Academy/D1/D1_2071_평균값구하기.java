/*
 * 1. 입력 받은 String을 Double형으로 변환하여 덧셈.
 * 2. 갯수만큼 나누고, Math.round 함수 사용하여 반올림.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2071_평균값구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			double result = 0;
			for (int i = 0; i < line.length; i++) {
				double temp = Double.parseDouble(line[i]);
				result += temp;
			}

			result = result / line.length;
			System.out.println("#" + tc + " " + Math.round(result));
		}
	}
}
