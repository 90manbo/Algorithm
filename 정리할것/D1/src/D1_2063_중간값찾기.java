import java.util.Scanner;

public class D1_2063_중간값찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int middle_index = 0;
		int[] box = new int[size];

		for (int i = 0; i < size; i++) {
			box[i] = sc.nextInt();
		}

		int tmp;
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length - i - 1; j++) {
				if (box[j] > box[j + 1]) {
					tmp = box[j];
					box[j] = box[j + 1];
					box[j + 1] = tmp;
				}
			}
		}
		middle_index = box.length / 2;
		System.out.println(box[middle_index]);

		sc.close();
	}
}
