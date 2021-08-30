import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D4_1233_사칙연산유효성검사 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {

			int number = Integer.parseInt(br.readLine());
			String[] arr = new String[number + 1];
			int ans = 1;
			int count = 0;
			for (int i = 1; i <= number; i++) {
				String[] tmp = br.readLine().split(" ");
				count = Integer.parseInt(tmp[0]);
				arr[count] = tmp[1];

			}
			for (int i = 1; i <= number; i++) {
				if (i > number / 2 && i % 2 == 0) {
					if (arr[i].equals("*") || arr[i].equals("/") || arr[i].equals("+") || arr[i].equals("-")) {
						ans = 0;
						break;
					}
				}
			}
			System.out.println("#" + tc + " " + ans);

		}

	}
}
