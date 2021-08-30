package permutation_combination;

public class Combination2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int n = arr.length;
		boolean[] visited = new boolean[n];
		combination(arr, visited, 0, n, 2);
	}

	static void combination(int[] arr, boolean[] visited, int depth, int n, int r) {
		if (r == 0) {
			print(arr, visited, n);
			return;
		}

		if (depth == n) {
			return;
		}

		visited[depth] = true;
		combination(arr, visited, depth + 1, n, r - 1);

		visited[depth] = false;
		combination(arr, visited, depth + 1, n, r);
	}

	static void print(int[] arr, boolean[] visited, int n) {
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

}
