import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1948_날짜계산기 {
	static int[] month = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	static int[] day = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");

			int mon1 = Integer.parseInt(line[0]);
			int day1 = Integer.parseInt(line[1]);
			int mon2 = Integer.parseInt(line[2]);
			int day2 = Integer.parseInt(line[3]);

			int result = 0;

			if (mon1 == mon2) {
				result = day2 - day1 + 1;
			} else {
				for (int i = mon1; i < mon2; i++) {
					result += day[i];
				}
				result += day2 - day1 + 1;

			}

			System.out.println("#" + tc + " " + result);
		}

	}

}
