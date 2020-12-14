import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_2817_부분수열의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String[] NK = br.readLine().split(" ");
			String[] line = br.readLine().split(" ");

			int N = Integer.parseInt(NK[0]);
			int K = Integer.parseInt(NK[1]);
			int[] arr = new int[line.length];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(line[i]);
			}

			int count = 0;
			for (int i = 0; i < (1 << arr.length); i++) {
				int sum = 0;
				for (int j = 0; j < arr.length; j++) {
					if ((i & (1 << j)) != 0) {
						sum += arr[j];
					}
				}
				if (sum == K) {
					count++;
				}
			}
			System.out.println("#" + tc + " " + count);
		}
	}

}
