import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_10505_¼ÒµæºÒ±ÕÇü {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			String[] tmp = br.readLine().split(" ");
			int[] line = new int[N];
			int sum = 0;
			for (int i = 0; i < N; i++) {
				line[i] = Integer.parseInt(tmp[i]);
				sum += line[i];
			}
			int avg = sum / N;

			int ans = 0;
			for (int i = 0; i < N; i++) {
				if (avg >= line[i]) {
					ans++;
				}
			}

			System.out.println("#" + tc + " " + ans);

		}

	}

}
