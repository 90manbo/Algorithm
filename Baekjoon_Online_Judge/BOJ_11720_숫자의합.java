import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720_숫자의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		char[] arr = br.readLine().toCharArray();

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += (int) arr[i] - 48;
		}
		System.out.println(result);
	}

}
