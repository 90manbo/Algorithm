/*
 * 1. 입력받은 String을 int형으로 변환.
 * 2. if문 사용하여 대상 비교.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2070_큰놈작은놈같은놈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			int temp1 = Integer.parseInt(line[0]);
			int temp2 = Integer.parseInt(line[1]);

			if (temp1 < temp2) {
				System.out.println("#" + tc + " " + "<");
			} else if (temp1 > temp2) {
				System.out.println("#" + tc + " " + ">");
			} else if (temp1 == temp2) {
				System.out.println("#" + tc + " " + "=");
			}
		}
	}
}
