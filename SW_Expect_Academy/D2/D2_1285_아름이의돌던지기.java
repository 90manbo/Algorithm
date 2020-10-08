import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * -100,000 ~ 100,000
 * N명이 돌을 던지고, 
 * 0에 가장 가까운 위치와 0의 차이, 사람 수 
 */
public class D2_1285_아름이의돌던지기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			String[] line = br.readLine().split(" ");
			int[] distance = new int[N];

			for (int i = 0; i < N; i++) {
				distance[i] = Math.abs(Integer.parseInt(line[i]));
			}

			int count = 0;
			int result = Integer.MAX_VALUE;

			for (int i = 0; i < N; i++) {
				if (distance[i] < result) {
					count = 1;
					result = distance[i];
				} else if (distance[i] == result) {
					count++;
				}

			}

			System.out.println("#" + tc + " " + result + " " + count);
		}

	}

}
