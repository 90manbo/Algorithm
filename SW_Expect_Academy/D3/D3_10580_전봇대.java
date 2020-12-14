import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class D3_10580_Àüº¿´ë {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());

			ArrayList<Data> list = new ArrayList<>();
			int ans = 0;
			for (int i = 0; i < N; i++) {
				String[] line = br.readLine().split(" ");
				int a = Integer.parseInt(line[0]);
				int b = Integer.parseInt(line[1]);

				list.add(new Data(a, b));
			}

			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {

					if (list.get(i).x > list.get(j).x && list.get(i).y < list.get(j).y) {
						ans++;
					} else if (list.get(i).x < list.get(j).x && list.get(i).y > list.get(j).y) {
						ans++;
					}
				}
			}

			System.out.println("#" + tc + " " + ans);
		}
	}

	static class Data {
		int x;
		int y;

		public Data(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
