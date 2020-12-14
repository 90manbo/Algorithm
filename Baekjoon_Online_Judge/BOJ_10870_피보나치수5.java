import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10870_피보나치수5 {

	static int N;
	static int memo[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		memo = new int[N + 1];
		int result = fac(N);
		bw.append(result + "");
		bw.flush();
		bw.close();
	}

	static int fac(int a) {
		if (a <= 1) {
			return a;
		}
		if (memo[a] > 0) {
			return memo[a];
		}
		memo[a] = fac(a - 1) + fac(a - 2);
		return memo[a];

	}

}
