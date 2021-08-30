package basic_input_output;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2739_±¸±¸´Ü {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i < 10; i++) {
			int tmpResult = N;
			tmpResult *= i;
			sb.append(N).append(" * ").append(i).append(" = ").append(tmpResult).append("\n");
		}
		System.out.println(sb);
	}

}
