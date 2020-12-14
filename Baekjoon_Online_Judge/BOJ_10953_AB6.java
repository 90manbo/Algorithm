import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10953_AB6 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");

			int A = Integer.parseInt(line[0]);
			int B = Integer.parseInt(line[1]);
			int result = A+B;
			System.out.println("Case #" + tc + ": " + A + " + " + B+" = "+result);
		}

	}

}