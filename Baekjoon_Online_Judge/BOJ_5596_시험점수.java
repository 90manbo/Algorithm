import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5596_시험점수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");
		String[] line2 = br.readLine().split(" ");

		int S = 0, T = 0;

		for (int i = 0; i < line.length; i++) {
			S += Integer.parseInt(line[i]);
		}

		for (int i = 0; i < line2.length; i++) {
			T += Integer.parseInt(line2[i]);
		}

		if (S >= T) {
			System.out.println(S);
		} else if (S < T) {
			System.out.println(T);
		}
	}

}
