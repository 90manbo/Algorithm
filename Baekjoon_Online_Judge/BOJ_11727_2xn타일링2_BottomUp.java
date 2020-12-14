import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_11727_2xn≈∏¿œ∏µ2_BottomUp {

	static int N;
	static int d[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		d = new int[N + 1];

		d[0] = 1;
		d[1] = 1;

		for (int i = 2; i < N + 1; i++) {
			d[i] = d[i - 1] + d[i - 2];
			d[i] %= 10007;
		}

		bw.write(String.valueOf(d[N]));
		bw.flush();
		bw.close();
	}

}
