import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1288_새로운불면증치료법 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String N = br.readLine();
			int n = Integer.parseInt(N);
			int count = 0;
			int nx = 1;
			boolean[] check = new boolean[10];

			while (true) {
				for (int i = 0; i < N.length(); i++) {
					int tmp = Integer.parseInt(N.substring(i, i + 1));
					if (check[tmp] == false) {
						count++;
						check[tmp] = true;
					}
				}

				if (count == 10) {
					break;
				}

				nx++;
				N = Integer.toString(n * nx);
			}
			System.out.println("#" + tc + " " + N);
		}
	}
}
