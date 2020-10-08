import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * A사는 1리터당 P
 * B사는 R리더 이하는 Q, 초과하면 리터당 +S
 * 한 달간 사용하는 수도의 양 W
 */

public class D2_1284_수도요금경쟁 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			int P = Integer.parseInt(line[0]);
			int Q = Integer.parseInt(line[1]);
			int R = Integer.parseInt(line[2]);
			int S = Integer.parseInt(line[3]);
			int W = Integer.parseInt(line[4]);

			int cost_A = 0, cost_B = 0;

			cost_A = W * P;
			if (W <= R) {
				cost_B = Q;
			} else if (W > R) {
				cost_B = Q + (W - R) * S;
			}

			int result = Integer.min(cost_A, cost_B);
			System.out.println("#" + tc + " " + result);
		}
	}

}
