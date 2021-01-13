import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_3431_준환이의운동관리 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] tmp = br.readLine().split(" ");

			int L = Integer.parseInt(tmp[0]);
			int U = Integer.parseInt(tmp[1]);
			int X = Integer.parseInt(tmp[2]);

			int result = 0;
			if (X >= L && X <= U) {
				result = 0;
			} else if (X < L) {
				result = Math.abs(X - L);
			} else if (X > L && X > U) {
				result = -1;
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
