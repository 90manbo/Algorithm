/*
 * 1. String 배열에 한 자리씩 입력 받음.
 * 2. 년 월 일을 나눈 String을 만듦.
 * 3. 월이 만약 1,3,5,7,8,10,12월 일 때, 일이 31일보다 작거나 같고 1보다 크거나 같으면 연/월/일 출력,  아니면  -1 출력 
 * 4. 월이 만약 2월 일 때, 일이 1보다 크거나 같고 28보다 작거나 같으면 연/월/일 출력, 아니면 -1 출력
 * 5. 월이 만약 4,6,9,11 일 때, 일이 1보다 크거나 같고 30보다 작거나 같으면 연/월/일 출력, 아니면 -1 출력 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2056_연월일달력 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();
			String[] tmp = new String[line.length()];

			for (int i = 0; i < line.length(); i++) {
				tmp[i] = line.charAt(i) + "";
			}

			String year = tmp[0] + tmp[1] + tmp[2] + tmp[3];
			String month = tmp[4] + tmp[5];
			String day = tmp[6] + tmp[7];
			int tempMonth = Integer.parseInt(month);
			int tempDay = Integer.parseInt(day);

			if ((tempMonth == 1) || (tempMonth == 3) || (tempMonth == 5) || (tempMonth == 7) || (tempMonth == 8)
					|| (tempMonth == 10) || (tempMonth == 12)) {
				if (tempDay <= 31 && tempDay >= 1) {
					System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
				} else {
					System.out.println("#" + tc + " " + -1);
				}
			} else if ((tempMonth == 2)) {
				if (tempDay <= 28 && tempDay >= 1) {
					System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
				} else {
					System.out.println("#" + tc + " " + -1);
				}
			} else if ((tempMonth == 4) || (tempMonth == 6) || (tempMonth == 9) || (tempMonth == 11)) {
				if (tempDay <= 30 && tempDay >= 1) {
					System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
				} else {
					System.out.println("#" + tc + " " + -1);
				}

			} else {
				System.out.println("#" + tc + " " + -1);
			}
		}

	}

}
