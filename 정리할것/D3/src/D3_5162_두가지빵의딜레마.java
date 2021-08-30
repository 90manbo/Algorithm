import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_5162_µÎ°¡Áö»§ÀÇµô·¹¸¶ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String[] tmp = br.readLine().split(" ");
			int A = Integer.parseInt(tmp[0]);
			int B = Integer.parseInt(tmp[1]);
			int C = Integer.parseInt(tmp[2]);

			int result = 0;

			if (A < B) {
				result = C / A;
			} else if (A > B) {
				result = C / B;
			} else {
				result = C / A;
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
