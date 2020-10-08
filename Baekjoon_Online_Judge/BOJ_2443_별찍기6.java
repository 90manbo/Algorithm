import java.util.Scanner;

public class BOJ_2443_º°Âï±â6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = N; i >= 1; i--) {
			for(int k = N-i ; k >0; k--) {
				System.out.print(" ");
			}
			for (int j = 2 *i -1; j >=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
