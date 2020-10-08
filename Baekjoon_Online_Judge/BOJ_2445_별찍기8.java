import java.util.Scanner;

public class BOJ_2445_º°Âï±â8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i < N; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			for (int j = (N * 2) - (i * 2); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = N; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * (N - i); j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}

}
