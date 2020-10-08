import java.util.Scanner;

public class BOJ_2444_º°Âï±â7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int k = N - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = N; i >= 1; i--) {
			for (int k = N - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 2 * i - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}

}
