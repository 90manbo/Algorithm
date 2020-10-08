/*
 * N * N ũ���� �迭�ȿ��� M * M ũ���� ���� ��� ��������, ���� ū�� ã�°�
 *  
 */
import java.io.IOException;
import java.util.Scanner;

public class D2_2001_�ĸ���ġ {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();
		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			int result = 0;

			for(int i = 0 ; i<N-M+1; i++) { //M ��ŭ �� �� �ִ� ������ ����ֱ� ���� N-M+1 
				for(int j = 0; j<N-M+1; j++) {
					int sum = 0;
					for(int k = 0; k<M; k++) {
						for(int l =0; l<M; l++) {
							sum+=map[i+k][j+l];
						}
					}
					if(sum>result) {
						result = sum;
					}
				}
			}

			System.out.println("#" + tc + " " + result);

		}
		sc.close();

	}
}