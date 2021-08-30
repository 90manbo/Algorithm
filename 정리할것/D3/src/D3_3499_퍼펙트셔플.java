import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class D3_3499_∆€∆Â∆Æº≈«√ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			LinkedList<String> ans = new LinkedList<>();
			String[] line = br.readLine().split(" ");

			if (N % 2 == 0) {
				String[] tmp = new String[N / 2];
				String[] tmp2 = new String[N / 2];

				for (int i = 0; i < N / 2; i++) {
					tmp[i] = line[i];
				}

				int idx = 0;
				for (int i = N / 2; i < N; i++) {
					tmp2[idx] = line[i];
					idx++;
				}
				for (int i = 0; i < N / 2; i++) {
					ans.add(tmp[i]);
					ans.add(tmp2[i]);
				}
			} else {
				String[] tmp = new String[N / 2 + 1];
				String[] tmp2 = new String[N / 2];

				for (int i = 0; i < N / 2 + 1; i++) {
					tmp[i] = line[i];
				}

				int idx = 0;
				for (int i = N / 2 + 1; i < N; i++) {
					tmp2[idx] = line[i];
					idx++;
				}
				for (int i = 0; i < N / 2; i++) {
					ans.add(tmp[i]);
					ans.add(tmp2[i]);
				}
				ans.add(tmp[tmp.length - 1]);
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < ans.size(); i++) {
				System.out.print(ans.get(i) + " ");
			}
			System.out.println();

		}

	}

}
