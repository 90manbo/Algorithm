import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_9997_미니멀리즘시계 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int num = Integer.parseInt(br.readLine().trim());

			int hour = 0;
			int min = 0;

			hour = num / 30;
			min = (num - hour * 30) * 2;

			if (hour > 12) {
				hour -= 12;
			}

			System.out.println("#" + tc + " " + hour + " " + min);
		}

	}

}
