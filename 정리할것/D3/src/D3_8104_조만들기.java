import java.io.IOException;
import java.util.Scanner;

public class D3_8104_조만들기 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[][] arr = new int[N + 1][K + 1];
			int count = 1;
			for (int i = 1; i < N + 1; i++) {
				if (i % 2 == 0) {
					for (int j = K; j >= 1; j--) {
						arr[i][j] = count;
						count++;
					}
				} else {
					for (int j = 1; j < K + 1; j++) {
						arr[i][j] = count;
						count++;
					}
				}

			}

			int[] sum = new int[K + 1];
			for (int j = 1; j < K + 1; j++) {
				for (int i = 1; i < N + 1; i++) {
					sum[j] += arr[i][j];
				}
			}

			System.out.print("#" + tc + " ");
			for (int i = 1; i < K + 1; i++) {
				System.out.print(sum[i] + " ");
			}
			System.out.println();
		}

	}

}
