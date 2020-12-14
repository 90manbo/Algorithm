import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_7964_ºÎ¸Ô¿Õ±¹ÀÇÂ÷¿ø°ü¹® {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String[] ND = br.readLine().split(" ");

			int N = Integer.parseInt(ND[0]) + 2;
			int D = Integer.parseInt(ND[1]);

			String[] tmp = br.readLine().split(" ");
			int[] arr = new int[N];
			for (int i = 1; i < N - 1; i++) {
				arr[i] = Integer.parseInt(tmp[i - 1]);
			}
			arr[0] = 1;
			arr[N - 1] = 1;

			int count = 0;
			int ans = 0;

			for (int i = 0; i < N; i++) {
				if (arr[i] == 0) {
					count++;
				} else {
					count = 0;
				}

				if (count == D) {
					arr[i] = 1;
					count = 0;
					ans++;
				}
			}
			System.out.println("#" + tc + " " + ans);

		}
	}

}
