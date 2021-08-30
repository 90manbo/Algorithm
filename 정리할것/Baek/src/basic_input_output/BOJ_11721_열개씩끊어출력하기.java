package basic_input_output;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11721_열개씩끊어출력하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();

		for (int i = 0; i < line.length(); i++) {
			if (i % 10 == 0 && i != 0) {
				sb.append("\n");
			}
			sb.append(line.charAt(i));

		}
		System.out.println(sb);
	}

}
