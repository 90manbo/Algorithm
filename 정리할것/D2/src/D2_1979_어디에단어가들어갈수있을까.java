import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. 1�� ������ �� �� �ִ� tmpCount�� �����.
 * 2. ���� ��ġ�� 0�̰ų� ������ ���϶� tmpCount�� K�� ������ count+1 ���ش�.
 * 3. tmpCount�� �� ��/�� ���� �ʱ�ȭ 
 */
public class D2_1979_��𿡴ܾ���������� {

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
