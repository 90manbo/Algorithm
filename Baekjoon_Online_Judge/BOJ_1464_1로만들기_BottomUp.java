import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1464_1로만들기_BottomUp {

	static int d[];
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		d = new int[N + 1];

		d[1] = 0;
		for (int i = 2; i < N + 1; i++) {
			d[i] = d[i - 1] + 1;
			if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
				d[i] = d[i / 2] + 1;
			}

			if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
				d[i] = d[i / 3] + 1;
			}
		}
		
		System.out.println(d[N]);

	}
}
