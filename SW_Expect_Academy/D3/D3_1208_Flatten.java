

import java.util.Scanner;

public class D3_1208_Flatten {
	public static void sort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int dump = sc.nextInt();
			int[] box = new int[100];
			for (int i = 0; i < 100; i++) {
				box[i] = sc.nextInt();
			}

			sort(box);

			for (int count = 0; count < dump; count++) {
				for (int i = 0, j = 99, k = 0; k < box.length / 2; i++, j--, k++) {
					if (box[j] - box[i] > box[j - 1] - box[i + 1]) {
						box[j] = box[j] - 1;
						box[i] = box[i] + 1;
						sort(box);
						break;
					}
				}
			}
			System.out.print("#" + tc + " ");
			System.out.println(box[99] - box[0]);
		}
	}
}