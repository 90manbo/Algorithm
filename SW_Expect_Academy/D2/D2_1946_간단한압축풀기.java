import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 원본 : 너비가 10 빈 공간 없이 알파벳으로 채워져있음
 */

public class D2_1946_간단한압축풀기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			String result = "";
			for (int i = 0; i < N; i++) {
				String[] line = br.readLine().split(" ");
				int count = Integer.parseInt(line[1]);

				for (int j = 0; j < count; j++) {
					result += line[0];
				}

			}
			System.out.println("#" + tc);
			int count = 0;
			for (int i = 0; i < result.length(); i++) {
				if (count == 10) {
					System.out.println();
					count = 0;
				}
				System.out.print(result.charAt(i));
				count++;
			}
			System.out.println();

		}

	}

}
