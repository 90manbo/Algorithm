import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3_10761_½Å·Ú {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());

			Data B = new Data();
			Data O = new Data();
			int cnt = 0;

			while (st.hasMoreTokens()) {
				char c = st.nextToken().charAt(0);
				int k = Integer.parseInt(st.nextToken());
				if (c == 'B') {
					B.time += Math.abs(B.location - k) + 1;
					B.location = k;
					if (cnt >= B.time) {
						cnt++;
						B.time = cnt;
					} else {
						cnt = B.time;
					}
				} else {
					O.time += Math.abs(O.location - k) + 1;
					O.location = k;
					if (cnt >= O.time) {
						cnt++;
						O.time = cnt;
					} else {
						cnt = O.time;
					}
				}
			}

			System.out.println("#" + tc + " " + Math.max(B.time, O.time));
		}

	}

	static class Data {
		int time;
		int location;

		public Data() {
			this.time = 0;
			this.location = 1;
		}
	}
}
