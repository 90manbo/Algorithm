import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1940_°¡¶ùRCÄ« {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());

			int result = 0;
			int now = 0;
			for (int i = 0; i < N; i++) {
				String[] commend = br.readLine().split(" ");
				if (Integer.parseInt(commend[0]) == 1) {
					now += Integer.parseInt(commend[1]);
					result += now;
				} else if (Integer.parseInt(commend[0]) == 2) {
					now -= Integer.parseInt(commend[1]);
					if (now < 0) {
						now = 0;
					}
					result += now;
				} else if (Integer.parseInt(commend[0]) == 0) {
					result += now;
				}

			}

			System.out.println("#" + tc + " " + result);
		}

	}

}
