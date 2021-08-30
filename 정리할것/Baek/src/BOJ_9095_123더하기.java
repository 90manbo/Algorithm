import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9095_123¥ı«œ±‚ {

	static int N;
	static int d[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Tc = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= Tc; tc++) {

			N = Integer.parseInt(br.readLine());
			d = new int[N + 1];

			int result = func(N);
			bw.append(String.valueOf(result));
			bw.append("\n");
		}
		bw.flush();
		bw.close();
	}

	private static int func(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 4;
		}

		if (d[n] > 0) {
			return d[n];
		}
		d[n] = func(n - 1) + func(n - 2) + func(n - 3);

		return d[n];

	}

}
