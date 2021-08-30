import java.util.Scanner;

public class D3_2805_농작물수확하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];

			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < n; j++) {
					a[i][j] = s.charAt(j) - '0';
				}
			}
			int reuslt = 0, range = 1;
			for (int i = 0; i < n / 2; i++) {
				int p = n / 2 - i;
				for (int j = 0; j < range; j++) {
					reuslt += a[i][j + p];
					reuslt += a[n - 1 - i][j + p];
				}
				range += 2;
			}
			for (int i = 0; i < n; i++) {
				reuslt += a[n / 2][i];
			}

			System.out.println("#" + t + " " + reuslt);
		}
	}
}