import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_10912_외로운문자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();
			String answer = "";
			int[] alpha = new int[26];

			for (int i = 0; i < line.length(); i++) {
				alpha[(int) (line.charAt(i)) - 97]++;
			}

			for (int i = 0; i < alpha.length; i++) {
				if (alpha[i] % 2 != 0) {
					answer += (char) (i + 97);
				}
			}

			if (answer.equals("")) {
				answer = "Good";
			}
			System.out.println("#" + tc + " " + answer);
		}
	}

}
