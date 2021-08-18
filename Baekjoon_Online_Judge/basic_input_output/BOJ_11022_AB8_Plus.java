package basic_input_output;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11022_AB8_Plus {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();
			st = new StringTokenizer(line, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int result = A + B;
			sb.append("Case #").append(tc).append(": ").append(A).append(" + ")
			.append(B).append(" = ").append(result).append("\n");
		}
		System.out.println(sb);

	}

}