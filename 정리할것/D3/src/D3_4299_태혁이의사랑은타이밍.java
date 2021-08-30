import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_4299_태혁이의사랑은타이밍 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String[] tmp = br.readLine().split(" ");
			int D = Integer.parseInt(tmp[0]);
			int H = Integer.parseInt(tmp[1]);
			int M = Integer.parseInt(tmp[2]);

			int result = 0;

			int temp = (11 * 24 * 60) + (11 * 60) + 11;
			int temp2 = (D * 24 * 60) + (H * 60) + M;
			result = temp2 - temp;

			if (result < 0) {
				result = -1;
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
