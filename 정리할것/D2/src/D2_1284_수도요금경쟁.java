import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D2_1284_수도요금경쟁 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			int P = Integer.parseInt(line[0]);
			int Q = Integer.parseInt(line[1]);
			int R = Integer.parseInt(line[2]);
			int S = Integer.parseInt(line[3]);
			int W = Integer.parseInt(line[4]);

			int A = P * W;
			int B = 0;
			if (W <= R) {
				B = Q;
			} else {
				B = Q + (W - R) * S;
			}

			int result = Math.min(A, B);

			bw.write("#" + tc + " ");
			bw.write(String.valueOf(result));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
