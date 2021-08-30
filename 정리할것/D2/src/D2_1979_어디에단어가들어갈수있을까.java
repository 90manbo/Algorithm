import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. 1의 갯수를 셀 수 있는 tmpCount를 만든다.
 * 2. 만약 위치가 0이거나 라인의 끝일때 tmpCount와 K가 같으면 count+1 해준다.
 * 3. tmpCount는 매 행/열 마다 초기화 
 */
public class D2_1979_어디에단어가들어갈수있을까 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] NK = br.readLine().split(" ");

			int N = Integer.parseInt(NK[0]);
			int K = Integer.parseInt(NK[1]);

			int[][] map = new int[N][N];
			for (int i = 0; i < N; i++) {
				String[] line = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(line[j]);
				}
			}

			int tmpCount = 0;
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1) {
						tmpCount++;
					}
					if (j == N - 1 || map[i][j] == 0) {
						if (tmpCount == K) {
							count++;
						}
						tmpCount = 0;
					}
				}
			}
			tmpCount = 0;
			for (int j = 0; j < N; j++) {
				for (int i = 0; i < N; i++) {
					if (map[i][j] == 1) {
						tmpCount++;
					}
					if (i == N - 1 || map[i][j] == 0) {
						if (tmpCount == K) {
							count++;
						}
						tmpCount = 0;
					}
				}
			}

			System.out.println("#" + tc + " " + count);

		}

	}

}
