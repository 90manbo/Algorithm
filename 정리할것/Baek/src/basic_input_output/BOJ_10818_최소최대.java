package basic_input_output;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10818_최소최대 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		String[] tmp = br.readLine().split(" ");
		int[] line = new int[N];
		for (int i = 0; i < N; i++) {
			line[i] = Integer.parseInt(tmp[i]);
		}

		Arrays.sort(line);

		sb.append(line[0]).append(" ").append(line[N - 1]);
		System.out.println(sb);
	}
}
