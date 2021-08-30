package insertionsort;

import java.util.LinkedList;
import java.util.Random;

public class InsertionSort {

	static LinkedList<Integer> list = new LinkedList<>();

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(50));
		}
		System.out.println(list);
		insertionSort();
		System.out.println(list);

	}

	static void insertionSort() {
		for (int i = 1; i < list.size(); i++) {
			int tmp = list.remove(i);
			boolean find = false;
			for (int j = i - 1; j >= 0; j--) {
				if (tmp > list.get(j)) {
					list.add(j + 1, tmp);
					find = true;
					break;
				}
			}
			if (!find) {
				list.add(0, tmp);
			}
		}
	}
}
