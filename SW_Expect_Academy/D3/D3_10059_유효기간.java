import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_10059_유효기간 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();
			int first = Integer.parseInt("" + line.charAt(0) + line.charAt(1));
			int second = Integer.parseInt("" + line.charAt(2) + line.charAt(3));

			if (first <= 0) {
				if (second <= 0) {
					System.out.println("#" + tc + " " + "NA");
				} else if (second >= 1 && second <= 12) {
					System.out.println("#" + tc + " " + "YYMM");
				} else if (second >= 13) {
					System.out.println("#" + tc + " " + "NA");
				}
			} else if (first >= 1 && first <= 12) {
				if (second <= 0) {
					System.out.println("#" + tc + " " + "MMYY");
				} else if (second >= 1 && second <= 12) {
					System.out.println("#" + tc + " " + "AMBIGUOUS");
				} else if (second >= 13) {
					System.out.println("#" + tc + " " + "MMYY");
				}
			} else if (first >= 13) {
				if (second <= 0) {
					System.out.println("#" + tc + " " + "NA");
				} else if (second >= 1 && second <= 12) {
					System.out.println("#" + tc + " " + "YYMM");
				} else if (second >= 13) {
					System.out.println("#" + tc + " " + "NA");
				}
			}

		}
	}
}
