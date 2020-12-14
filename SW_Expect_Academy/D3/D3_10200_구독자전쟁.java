import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_10200_구독자전쟁 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int P = Integer.parseInt(line[1]);
			int T = Integer.parseInt(line[2]);

			int max = Math.min(P, T);
			int min = 0;
			if (P + T > N) {
				min = P + T - N;
			} else {
				min = 0;
			}
			System.out.println("#" + tc + " " + max + " " + min);
		}
	}

}
