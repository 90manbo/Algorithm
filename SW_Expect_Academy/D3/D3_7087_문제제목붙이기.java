import java.util.Scanner;

public class D3_7087_문제제목붙이기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt();
			sc.nextLine(); // 개행문자 제거를 위함.

			char[] arr = new char[N];
			;
			for (int i = 0; i < N; i++) {
				String line = sc.nextLine();
				arr[i] = line.charAt(0);
			}

			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (arr[i] > arr[j]) {
						char tmp;
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}

			int count = 0;
			int check = 65;

			for (int i = 0; i < N; i++) {
				if (arr[i] == check) {
					count++;
					check++;
				}
			}
			System.out.println("#" + tc + " " + count);

		}
		sc.close();
	}

}
