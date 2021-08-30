import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �� ������ �̷���� �ð� 2���� �Է� �޾�, ���� ���� �� �� ���� ���
 * �ô� 12�ð���, 1~12
 * ���� 0~59 
 */
public class D2_1976_�ð����� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");

			int hour = Integer.parseInt(line[0]) + Integer.parseInt(line[2]);
			int minute = Integer.parseInt(line[1]) + Integer.parseInt(line[3]);

			if (minute >= 60) {
				minute = minute - 60;
				hour += 1;
			}
			if (hour > 12) {
				hour -= 12;
			}
			System.out.println("#" + tc + " " + hour + " " + minute);
		}

	}

}
