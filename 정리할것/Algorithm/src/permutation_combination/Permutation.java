package permutation_combination;

public class Permutation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int n = arr.length;

		permutation(arr, 0, n, 3);
	}

	static void permutation(int[] arr, int depth, int n, int r) {
		if (depth == r) {
			print(arr, r);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
	}

	static void swap(int[] arr, int depth, int i) {
		int tmp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = tmp;
	}

	static void print(int[] arr, int r) {
		for (int i = 0; i < r; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
