package dynaminc_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_80970_피보나치수5_TopDown {
	static int N;
	static int dp[];

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
		if (n <= 1) {
			return n;
		}

		if (dp[n] > 0) {
			return dp[n];
		}

		dp[n] = fi(n - 1) + fi(n - 2);
		return dp[n];
	}

}
