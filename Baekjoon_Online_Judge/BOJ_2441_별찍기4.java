import java.util.Scanner;

public class BOJ_2441_º°Âï±â4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = N - i; j < N; j++) {

				System.out.print(" ");
			}
			for (int k = N - i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
