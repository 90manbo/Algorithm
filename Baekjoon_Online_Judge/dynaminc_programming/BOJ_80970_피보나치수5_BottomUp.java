package dynaminc_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_80970_피보나치수5_BottomUp {
	static int N;
	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		dp = new int[21];

		int result = fi(N);
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}

	static int fi(int n) {
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < N + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
