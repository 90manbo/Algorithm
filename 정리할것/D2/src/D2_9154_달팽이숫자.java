import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_9154_달팽이숫자 {
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());

			int[][] map = new int[N][N];

			int x = 0, y = 0, dir = 0;

			for (int i = 0; i < N * N; i++) {
				map[x][y] = i + 1;
				x = x + dx[dir];
				y = y + dy[dir];

				if (x >= N || y >= N || x < 0 || y < 0 || map[x][y] != 0) {
					x = x - dx[dir];
					y = y - dy[dir];

					dir = (dir + 1) % 4;

					x = x + dx[dir];
					y = y + dy[dir];
				}

			}

			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}

		}
	}

}
