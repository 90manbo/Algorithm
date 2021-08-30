import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D2_1204_최빈수구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			int tNum = Integer.parseInt(br.readLine());
			int[] score = new int[1000];
			int[] scoreCount = new int[101];
			int result = 0;
			int tmpIdx = 0;
			String[] tmpScore = br.readLine().split(" ");
			for (int i = 0; i < score.length; i++) {
				score[i] = Integer.parseInt(tmpScore[i]);
				scoreCount[score[i]]++;
			}

			for (int i = 0; i < scoreCount.length; i++) {
				if (tmpIdx <= scoreCount[i]) {
					tmpIdx = scoreCount[i];
					result = i;
				}
			}

			bw.write("#" + tNum + " ");
			bw.write(String.valueOf(result));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();

	}
}
