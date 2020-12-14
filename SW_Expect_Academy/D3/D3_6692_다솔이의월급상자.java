import java.util.Scanner;

public class D3_6692_다솔이의월급상자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int tc = 1; tc <= TC; tc++) {
			double sum = 0.0;
			int N = sc.nextInt();

			for (int i = 0; i < N; i++) {
				double P = sc.nextDouble();
				int X = sc.nextInt();

				sum += P * X;
			}
			System.out.printf("#" + tc + " " + "%.6f", sum);
		}
		sc.close();

	}

}
