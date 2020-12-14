

import java.util.Scanner;

public class D3_1289_원재의메모리복구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();
		for (int tc = 1; tc <= TC; tc++) {

			String line = sc.next();
			int[] bit_arr = new int[line.length()];
			int[] tmp_arr = new int[line.length()];
			int count = 0;

			for (int i = 0; i < line.length(); i++) {
				bit_arr[i] = (line.charAt(i) == '1' ? 1 : 0);
				tmp_arr[i] = 0;
			}

			for (int i = 0; i < line.length(); i++) {
				if (tmp_arr[i] != bit_arr[i]) {
					for (int j = i; j < line.length(); j++) {
						tmp_arr[j] = bit_arr[i];
					}
					count++;
				}
			}
			System.out.println("#" + tc + " " + count);
		}

		sc.close();
	}
}
