import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. d[N] = N을 1로 만드는데 필요한 연산의 최소값을 저장한다.
 * 2. d[N] = d[N/3]+1 / d[N/2]+1 / d[N-1] +1
 * 3. d[N] = min(1, 2, 3)
 */
public class BOJ_1464_1로만들기_TopDown {

	static int d[];
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		d = new int[N + 1];

		System.out.println(fun(N));

	}

	public static int fun(int n) {

		if (n == 1) {
			return 0;
		}

		if (d[n] > 0) {
			return d[n];
		}
		
		d[n] = fun(n - 1) + 1;
		
		
		if (n % 2 == 0) {
			int tmp = fun(n / 2) + 1;
			if (d[n] > tmp) {
				d[n] = tmp;
			}
		}

		if (n % 3 == 0) {
			int tmp = fun(n / 3) + 1;
			if (d[n] > tmp) {
				d[n] = tmp;
			}
		}

		return d[n];
	}

}
