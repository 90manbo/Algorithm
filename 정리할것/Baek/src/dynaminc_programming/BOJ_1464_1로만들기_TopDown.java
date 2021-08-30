package dynaminc_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 1. d[N] = N�� 1�� ����µ� �ʿ��� ������ �ּҰ��� �����Ѵ�.
 * 2. d[N] = d[N/3]+1 / d[N/2]+1 / d[N-1] +1
 * 3. d[N] = min(1, 2, 3)
 */
public class BOJ_1464_1�θ����_TopDown {

	static int d[];
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		d = new int[N + 1];

		int result = go(N);

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();

	}

	static int go(int n) {
		if (n == 1) {
			return 0;
		}
		if (d[n] > 0) {
			return d[n];
		}

		d[n] = go(n - 1) + 1;
		if (n % 2 == 0) {
			int temp = go(n / 2) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}

		if (n % 3 == 0) {
			int temp = go(n / 3) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		return d[n];
	}

}
