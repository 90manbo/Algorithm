import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_10726_이진수표현 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int M = Integer.parseInt(line[1]);

			String tmp = Integer.toBinaryString(M);
			int[] binary = new int[tmp.length()];
			for (int i = 0; i < tmp.length(); i++) {
				binary[i] = Integer.parseInt(tmp.charAt(i) + "");
			}

			String ans = "ON";
			if (binary.length - N > -1) {
				for (int i = binary.length - N; i < binary.length; i++) {
					if (binary[i] == 0) {
						ans = "OFF";
						break;
					}
				}
			} else {
				ans = "OFF";
			}
			System.out.println("#" + tc + " " + ans);
		}

	}

}
