
import java.util.Scanner;

public class BOJ_2455_지능형기차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] minus = new int[4];
		int[] plus = new int[4];
		int[] sum = new int[4];
		int result = 0;
		for (int i = 0; i < 4; i++) {
			minus[i] = sc.nextInt();
			plus[i] = sc.nextInt();

		}
		sum[0] = plus[0] - minus[0];

		for (int i = 1; i < 4; i++) {
			sum[i] = sum[i - 1] - minus[i] + plus[i];
		}

		for (int i = 0; i < 4; i++) {
			if (result <= sum[i]) {
				result = sum[i];
			}
		}
		System.out.println(result);
		sc.close();
	}

}
