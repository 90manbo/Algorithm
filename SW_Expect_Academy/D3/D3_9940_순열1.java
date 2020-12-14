import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_9940_¼ø¿­1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			String[] line = br.readLine().split(" ");
			boolean[] map = new boolean[N + 1];

			for (int i = 0; i < line.length; i++) {
				map[Integer.parseInt(line[i])] = true;
			}

			String ans = "Yes";
			for (int i = 1; i < map.length; i++) {
				if (map[i]) {
					continue;
				} else {
					ans = "No";
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}

}
