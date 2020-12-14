/*
 * 3, 6, 9가 포함되면 - 로 치환한다.
 * 단 33, 36등 두 수 다 포함되면 갯수 만큼 --로 바꾼다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1926_간단한369게임 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());

		for (int i = 1; i < N + 1; i++) {
			String result = Integer.toString(i);
			if (result.contains("3") || result.contains("6") || result.contains("9")) {

				result = result.replace("3", "-");
				result = result.replace("6", "-");
				result = result.replace("9", "-");
				result = result.replace("0", "");
				result = result.replace("1", "");
				result = result.replace("2", "");
				result = result.replace("4", "");
				result = result.replace("5", "");
				result = result.replace("7", "");
				result = result.replace("8", "");

			}
			System.out.print(result + " ");
		}
	}

}
