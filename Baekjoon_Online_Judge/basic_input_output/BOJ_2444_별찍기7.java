package basic_input_output;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2444_�����7 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			for (int j = N - 1 - i; j > 0; j--) {
				bw.write(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
