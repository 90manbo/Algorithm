import java.util.Scanner;

public class BOJ_2339_º°Âï±â2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = N - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 0; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
		sc.close();
	}

}
