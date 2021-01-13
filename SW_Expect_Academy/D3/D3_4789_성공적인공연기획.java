import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_4789_성공적인공연기획 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			char[] line = br.readLine().toCharArray();
			int need = 0;
			int tmp = line[0] - '0';

			for (int i = 1; i < line.length; i++) {
				if (line[i] - '0' != 0 && i >= tmp) {
					need += (i - tmp);
					tmp += (line[i] - '0') + (i - tmp);
					continue;
				}
				tmp += line[i] - '0';
			}
			System.out.println("#" + tc + " " + need);

		}
	}

}
