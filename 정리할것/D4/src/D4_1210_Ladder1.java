import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D4_1210_Ladder1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			int t = Integer.parseInt(br.readLine());
			int[][] ladder = new int[100][100];

			for (int i = 0; i < 100; i++) {
				String[] line = br.readLine().split(" ");
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = Integer.parseInt(line[j]);
				}
			}

			int start_row = 99;
			int start_cal = 0;

			for (int j = 0; j < 100; j++) {
				if (ladder[start_row][j] == 2) {
					start_cal = j;
				}
			}

			while (start_row > 0) {
				if (start_cal > 0 && ladder[start_row][start_cal - 1] == 1) {
					ladder[start_row][start_cal] = 0;
					start_cal--;
				} else if (start_cal < 99 && ladder[start_row][start_cal + 1] == 1) {
					ladder[start_row][start_cal] = 0;
					start_cal++;
				} else {
					start_row--;
				}
			}
			System.out.println("#" + t + " " + start_cal);

		}
	}

}
