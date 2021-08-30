/*
 * 1. N�� ���� ������ �ŸŰ� �����ϰ� ����.
 * 2. �Ϸ� �ִ� 1��ŭ ���� ����.
 * 3. �ǸŴ� �������� ����. 
 * 4. �� ���� ���� �ִ� ������ ��. 
 * 5. �ڿ��� ���� �����ϸ� �ִ밪���� ũ�� �ִ밪�� ����, �ִ밪 ���� ������ �ȸ鼭 ������ �����.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1859_�鸸����������Ʈ {

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
