import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_10965_제곱수만들기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());

			int[] map = new int[N + 1];

			for (int i = 2; i <= N; i++) {
				while (N % i == 0) {
					map[i]++;
					N /= i;
				}
			}

			int ans = 1;
			for (int i = 1; i < map.length; i++) {
				if (map[i] % 2 != 0) {
					ans *= i;
				}
			}
			System.out.println("#" + tc + " " + ans);

		}

	}

}
