import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_9317_석찬이의받아쓰기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			String line = br.readLine();
			String line2 = br.readLine();

			int count = 0;

			for (int i = 0; i < N; i++) {
				if (line.charAt(i) == line2.charAt(i)) {
					count++;
				}
			}
			System.out.println("#" + tc + " " + count);
		}
	}
}
