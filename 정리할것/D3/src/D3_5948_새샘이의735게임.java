import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class D3_5948_새샘이의735게임 {

	static int[] arr;
	static boolean[] visited;
	static LinkedList<Integer> tmp_ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] line = br.readLine().split(" ");
			tmp_ans = new LinkedList<>();
			int n = line.length;
			arr = new int[n];
			visited = new boolean[n];

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(line[i]);
			}

			com(arr, visited, 0, n, 3);
			Collections.sort(tmp_ans, Comparator.reverseOrder());


			int result = tmp_ans.get(0);
			int count = 1;
			for (int i = 1; i < tmp_ans.size(); i++) {
				if (count == 5) {
					break;
				}
				if (result > tmp_ans.get(i)) {
					result = tmp_ans.get(i);
					count++;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

	static void com(int[] arr, boolean[] visited, int start, int n, int r) {
		if (r == 0) {
			sum(arr, visited, n);
			return;
		}

		for (int i = start; i < n; i++) {
			visited[i] = true;
			com(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}

	}

	static void sum(int[] arr, boolean[] visited, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				sum += arr[i];
			}
		}
		tmp_ans.add(sum);
	}

}
