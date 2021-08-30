import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 35% + 45% +20%
 * N은 100이하의 10의 배수임 , K번째 학생의 점수를 구하라.
 * N/10명의 학생에게 동일한 평점을 부여할 수 있다 
 *
 */
public class D2_1983_조교의성적매기기 {
	static String[] score = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
	static 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String[] NK = br.readLine().split(" ");
			int N = Integer.parseInt(NK[0]);
			int K = Integer.parseInt(NK[1]) - 1;
			int kscore = 0;
			ArrayList<Data> result = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				String[] tmp = br.readLine().split(" ");
				int one = Integer.parseInt(tmp[0]);
				int two = Integer.parseInt(tmp[1]);
				int three = Integer.parseInt(tmp[2]);

				int sum = (one * 35) + (two * 45) + (three * 20);
				if (K == i) {
					kscore = sum;
				}
				result.add(new Data(sum, i));

			}

			Collections.sort(result);

			int idx = -1;
			for (int i = 0; i < N; i++) {
				if (kscore == result.get(i).x) {
					idx = i;
					break;
				}
			}
			int ans = idx / (N / 10);

			System.out.println("#" + tc + " " + score[ans]);

		}
	}

	static class Data implements Comparable<Data> {
		int x;
		int y;

		public Data(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Data o) {

			return o.x - this.x;
		}

	}
}