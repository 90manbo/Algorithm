package binarySearch;
public class BinarySearch {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(binarySearch(number, 10)); // -1
		System.out.println(binarySearch(number, 9)); // 9
		System.out.println(binarySearch(number, 3)); // 2
	}

	static int binarySearch(int[] array, int key) {
		int ans = -1;
		int start = 0;
		int middle = 0;
		int end = array.length - 1;
		while (end >= start) {
			middle = (start + end) / 2;
			if (array[middle] >= key) {
				end = middle - 1;

			} else {
				start = middle + 1;
			}

			if (array[middle] == key) {
				ans = middle;
			}
		}

		return ans;
	}

}
