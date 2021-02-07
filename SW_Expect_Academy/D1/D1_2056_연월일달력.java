import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D1_2056_연월일달력 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();
			String year = "" + line.charAt(0) + line.charAt(1) + line.charAt(2) + line.charAt(3);
			String month = "" + line.charAt(4) + line.charAt(5);
			String day = "" + line.charAt(6) + line.charAt(7);
			int tmpM = Integer.parseInt(month);
			int tmpD = Integer.parseInt(day);
			boolean flag = false;
			if (tmpM == 1 || tmpM == 3 || tmpM == 5 || tmpM == 7 || tmpM == 8 || tmpM == 10 || tmpM == 12) {
				if (tmpD >= 1 && tmpD <= 31) {
					flag = true;
				}
			} else if (tmpM == 4 || tmpM == 6 || tmpM == 9 || tmpM == 11) {
				if (tmpD >= 1 && tmpD < 31) {
					flag = true;
				}
			} else if (tmpM == 2) {
				if (tmpD >= 1 && tmpD < 29) {
					flag = true;
				}
			}
			
			String result = "";
			if (flag) {
				result = year + "/" + month + "/" + day;
			} else {
				result = "-1";
			}

			bw.write("#" + tc + " ");
			bw.write(result);
			bw.newLine();

		}
		bw.flush();
		bw.close();
		br.close();
	}
}
