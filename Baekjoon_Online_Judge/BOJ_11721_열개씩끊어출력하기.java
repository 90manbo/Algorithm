import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11721_열개씩끊어출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		for (int i = 1; i < line.length() + 1; i++) {
			System.out.print(line.charAt(i - 1));

			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
