import java.util.ArrayList;
import java.util.Scanner;

public class D3_1228_¾ÏÈ£¹®1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				list.add(i, sc.nextInt());
			}

			int N2 = sc.nextInt();

			for (int i = 0; i < N2; i++) {
				String tmp = sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				for (int j = x; j < x + y; j++) {
					list.add(j, sc.nextInt());
				}
			}

			System.out.print("#" + tc + " ");
			for (int i = 0; i < 10; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
		}

	}

}
