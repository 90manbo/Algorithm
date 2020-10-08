import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class D2_1966_숫자를정렬하자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			String[] line = br.readLine().split(" ");
			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				result.add(Integer.parseInt(line[i]));
			}

			result.sort(null);
			System.out.print("#" + tc + " ");
			for (int i = 0; i < result.size(); i++) {
				System.out.print(result.get(i) + " ");
			}
			System.out.println();
		}

	}

}
