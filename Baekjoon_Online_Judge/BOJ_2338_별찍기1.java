import java.util.Scanner;

public class BOJ_2338_�����1 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			for(int j = i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
