import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1961_숫자배열회전 {
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			N = Integer.parseInt(br.readLine().trim());

			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				String[] line = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(line[j]);
				}
			}

			int[][] map1 = rotate(map);
			int[][] map2 = rotate(map1);
			int[][] map3 = rotate(map2);

			System.out.println("#" + tc + " ");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(map1[i][j]);
				}
				System.out.print(" ");

				for (int j = 0; j < N; j++) {
					System.out.print(map2[i][j]);
				}
				System.out.print(" ");

				for (int j = 0; j < N; j++) {
					System.out.print(map3[i][j]);
				}
				System.out.println();

			}

		}

	}

	static int[][] rotate(int[][] map) {
		int[][] newMap = new int[N][N];
		int k = 0;

		for (int j = N - 1; j >= 0; j--) {
			for (int i = 0; i < N; i++) {
				newMap[i][j] = map[k][i];
			}
			k++;
		}
		return newMap;
	}

}
