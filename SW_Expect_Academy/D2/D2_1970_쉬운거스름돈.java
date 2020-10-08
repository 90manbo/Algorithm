import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1970_쉬운거스름돈 {

	static int[] moneyTable = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int money = Integer.parseInt(br.readLine().trim());
			int[] count = new int[8];
			for (int i = 0; i < 8; i++) {
				if (money >= moneyTable[i]) {
					int result = money / moneyTable[i];
					count[i] = result;
					money -= result * moneyTable[i];
				}
			}
			System.out.println("#" + tc + " ");
			for (int i = 0; i < 8; i++) {
				System.out.print(count[i] + " ");
			}
			System.out.println();

		}

	}

}
