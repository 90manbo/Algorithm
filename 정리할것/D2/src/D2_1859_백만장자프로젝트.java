/*
 * 1. N일 동안 물건의 매매가 예측하고 있음.
 * 2. 하루 최대 1만큼 구매 가능.
 * 3. 판매는 언제든지 가능. 
 * 4. 맨 뒤의 값을 최대 값으로 함. 
 * 5. 뒤에서 부터 시작하며 최대값보다 크면 최대값을 갱신, 최대값 보다 작으면 팔면서 이익을 계산함.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1859_백만장자프로젝트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			StringTokenizer st = new StringTokenizer(br.readLine());

			int[] map = new int[N];
			for (int i = 0; i < N; i++) {
				map[i] = Integer.parseInt(st.nextToken());
			}

			long result = 0;
			int max =0;

			for (int i = N - 1; i >= 0; i--) {
				if (map[i] > max) {
					max = map[i];
				} else {
					result += max - map[i];
				}
			}

			System.out.println("#" + tc + " " + result);

		}
	}

}
