package basic_input_output;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_11720_숫자의합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		char[] line = br.readLine().toCharArray();
		int result = 0;
		for (int i = 0; i < N; i++) {
			result += (int) line[i] - 48;
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
