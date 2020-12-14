import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * d[n] = 2xn을 채우는 방법의 수
 * --------------
 * |		|	|
 * |		|	|
 * |		|	|
 * --------------
 * --------------
 * |	|		|
 * |	|-------|
 * |	|		|
 * --------------
 * 
 * 세로블럭을 빼고나면  2x(n-1)	-> d[n-1]
 * 가로블럭을 빼고나면 2x(n-2)	-> d[n-2]
 * 
 * d[n] = d[n-1] + d[n-2]
 */
public class BOJ_11726_2xn타일링_TopDown {

	static int N;
	static int d[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		d = new int[N + 1];

		int result = func(N);
		bw.write(result);
		bw.flush();
		bw.close();
	}

	private static int func(int n) {
		if (n <= 1) {
			return 1;
		}

		if (d[n] > 0) {
			return d[n];
		}
		d[n] = func(n - 1) + func(n - 2);
		d[n] %= 10007;
		return d[n];

	}

}
