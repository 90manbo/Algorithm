/*
 * N * N 크기의 배열안에서 M * M 크기의 값을 모두 더했을때, 가장 큰값 찾는거
 *  
 */
import java.io.IOException;
import java.util.Scanner;

public class D2_2001_파리퇴치 {
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

			for(int i = 0 ; i<N-M+1; i++) { //M 만큼 돌 수 있는 범위를 잡아주기 위해 N-M+1 
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