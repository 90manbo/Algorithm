import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1974_스도쿠검증 {

	static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			map = new int[9][9];

			for (int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 9; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			boolean check = true;
			for (int i = 0; i < 9; i++) {
				if (!checkRow(i)) {
					System.out.println("#" + tc + " " + 0);
					check = false;
					break;
				}
			}

			if (!check) {
				continue;
			}

			for (int j = 0; j < 9; j++) {
				if (!checkCal(j)) {
					System.out.println("#" + tc + " " + 0);
					check = false;
					break;
				}
			}
			if (!check) {
				continue;
			}

			for (int i = 0; i <= 6; i += 3) {
				for (int j = 0; j <= 6; j += 3) {
					if (!checkThree(i, j)) {
						System.out.println("#" + tc + " " + 0);
						check = false;
						break;
					}
				}
				if (!check) {
					break;
				}
			}
			if (!check) {
				continue;
			}

			System.out.println("#" + tc + " " + 1);

		}

	}

	static boolean checkThree(int x, int y) {
		boolean[] line = new boolean[9];
		int nx = x + 3;
		int ny = y + 3;

		for (int i = x; i < nx; i++) {
			for (int j = y; j < ny; j++) {
				if (line[map[i][j] - 1]) {
					return false;
				}
				line[map[i][j] - 1] = true;
			}
		}
		return true;
	}

	static boolean checkRow(int i) {
		boolean[] line = new boolean[9];
		for (int j = 0; j < 9; j++) {
			if (line[map[i][j] - 1]) {
				return false;
			}
			line[map[i][j] - 1] = true;
		}
		return true;
	}

	static boolean checkCal(int j) {
		boolean[] line = new boolean[9];
		for (int i = 0; i < 9; i++) {
			if (line[map[i][j] - 1]) {
				return false;
			}
			line[map[i][j] - 1] = true;
		}
		return true;
	}

}
