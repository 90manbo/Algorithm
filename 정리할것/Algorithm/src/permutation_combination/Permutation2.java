package permutation_combination;

public class Permutation2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int n = arr.length;
		boolean[] visited = new boolean[arr.length];
		int[] output = new int[n];
		perm(arr, output, visited, 0, n, 3);
	}

	static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth == r) {
			print(output, r);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i] != true) {
				visited[i] = true;
				output[depth] = arr[i];
				perm(arr, output, visited, depth + 1, n, r);
				visited[i] = false;
			}
		}
	}



	static void print(int[] arr, int r) {
		for (int i = 0; i < r; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
