import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1945_간단한소인수분해 {

	static int[] map = { 2, 3, 5, 7, 11 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());

			int[] result = new int[5];

			while (true) {
				if (N == 1) {
					break;
				}
				for (int i = 0; i < 5; i++) {
					if (N % map[i] == 0) {
						result[i]++;
						N /= map[i];
					}
				}
			}

			System.out.print("#" + tc + " ");
			for (int i = 0; i < 5; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
	}

}
