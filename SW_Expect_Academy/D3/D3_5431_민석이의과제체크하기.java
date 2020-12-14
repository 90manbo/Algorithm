

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D3_5431_민석이의과제체크하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");

			int N = Integer.parseInt(line[0]);
			int K = Integer.parseInt(line[1]);

			String[] tmp = br.readLine().split(" ");

			boolean[] map = new boolean[N + 1];

			for (int i = 0; i < tmp.length; i++) {
				map[Integer.parseInt(tmp[i])] = true;
			}

			String ans = "";
			for (int i = 1; i < map.length; i++) {
				if (!map[i]) {
					ans += i + " ";
				}
			}
			bw.write("#" + tc + " " + ans);
			bw.write("\n");
			bw.flush();

		}
		bw.close();
	}
}
