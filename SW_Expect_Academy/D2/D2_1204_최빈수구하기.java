import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1204_최빈수구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			int tNum = Integer.parseInt(br.readLine());

			String[] tmp = br.readLine().split(" ");
			int[] map = new int[1000];
			int[] score = new int[101];
			for (int i = 0; i < tmp.length; i++) {
				map[i] = Integer.parseInt(tmp[i]);
			}

			for (int i = 0; i < map.length; i++) {
				score[map[i]]++;
			}

			int tmp_score = 0;
			int idx = 0;

			for (int i = 0; i < score.length; i++) {
				if (score[i] >= tmp_score) {
					tmp_score = score[i];
					idx = i;
				}
			}
			System.out.println("#" + tNum + " " + idx);

		}
	}

}
