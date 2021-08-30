import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_10032_과자분배 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] NK = br.readLine().split(" ");
			int N = Integer.parseInt(NK[0]);
			int K = Integer.parseInt(NK[1]);
			if (N % K == 0) {
				System.out.println("#" + tc + " " + 0);
			} else {
				System.out.println("#" + tc + " " + 1);
			}
		}
	}

}
