import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D1_2058_자릿수더하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int result = 0;

		while (N != 0) {
			result += N % 10;
			N /= 10;
		}
		bw.write(String.valueOf(result));
		bw.newLine();

		bw.flush();
		br.close();
		bw.close();
	}
}
