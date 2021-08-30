/*
 * 1. ù ��° ���� �׻� ���� 1
 * 2. �� ��° �ٺ��� �� ���ڵ��� �ڽ��� ���ʰ� ���������� ������ ������ ����.
 *  
 * 1000
 * 1100
 * 1210
 * 1331
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_2005_�Ľ�Į�ǻﰢ�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
			map[0][0] = 1;
			for (int i = 1; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						map[i][j] = 1;
					} else {
						map[i][j] = map[i - 1][j - 1] + map[i - 1][j];
					}
				}
			}
			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
