import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * A��� 1���ʹ� P
 * B��� R���� ���ϴ� Q, �ʰ��ϸ� ���ʹ� +S
 * �� �ް� ����ϴ� ������ �� W
 */

public class D2_1284_������ݰ��� {

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
