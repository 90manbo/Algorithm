import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_5789_현주의상자바꾸기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] NQ = br.readLine().split(" ");
			int N = Integer.parseInt(NQ[0]);
			int Q = Integer.parseInt(NQ[1]);

			int[] result = new int[N + 1];
			for (int i = 1; i < Q + 1; i++) {
				String[] LR = br.readLine().split(" ");
				int L = Integer.parseInt(LR[0]);
				int R = Integer.parseInt(LR[1]);

				for (int j = L; j < R + 1; j++) {
					result[j] = i;
				}
			}

			System.out.print("#" + tc + " ");
			for (int i = 1; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
	}

}
