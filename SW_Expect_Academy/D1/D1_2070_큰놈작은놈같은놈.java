/*
 * 1. �Է¹��� String�� int������ ��ȯ.
 * 2. if�� ����Ͽ� ��� ��.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2070_ū������������ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			int temp1 = Integer.parseInt(line[0]);
			int temp2 = Integer.parseInt(line[1]);

			if (temp1 < temp2) {
				System.out.println("#" + tc + " " + "<");
			} else if (temp1 > temp2) {
				System.out.println("#" + tc + " " + ">");
			} else if (temp1 == temp2) {
				System.out.println("#" + tc + " " + "=");
			}
		}
	}
}
