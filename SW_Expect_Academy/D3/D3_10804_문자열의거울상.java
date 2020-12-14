import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_10804_문자열의거울상 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();
			StringBuilder sb = new StringBuilder().append(line).reverse();

			String result = "";
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) == 'p') {
					result += "q";
				} else if (sb.charAt(i) == 'q') {
					result += "p";
				} else if (sb.charAt(i) == 'b') {
					result += "d";
				} else if (sb.charAt(i) == 'd') {
					result += "b";
				}
			}

			System.out.println("#" + tc + " " + result);
		}

	}

}
