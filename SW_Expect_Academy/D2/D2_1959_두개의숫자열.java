import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 큰놈기준으로 이중반복문 돌면서 작은놈 움직임
 */
public class D2_1959_두개의숫자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= TC; tc++) {
			String[] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			int ans = 0;

			int[] arr = new int[N];
			int[] arr2 = new int[M];
			String[] line = br.readLine().split(" ");
			String[] line2 = br.readLine().split(" ");

			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(line[i]);
			}
			for (int i = 0; i < M; i++) {
				arr2[i] = Integer.parseInt(line2[i]);
			}

			if (N < M) {
				for (int i = 0; i < M - N + 1; i++) {
					int result = 0;
					for (int j = 0; j < N; j++) {
						result += arr[j] * arr2[j + i];
					}
					ans = Math.max(ans, result);
				}
			} else {
				for (int i = 0; i < N - M + 1; i++) {
					int result = 0;
					for (int j = 0; j < M; j++) {
						result += arr2[j] * arr[j + i];
					}
					ans = Math.max(ans, result);
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}

}
