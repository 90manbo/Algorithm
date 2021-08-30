/*
 * 조건문 처리.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_1936_1대1가위바위보 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);

		if (A == 1 && B == 2) {
			System.out.println("B");
		} else if (A == 1 && B == 3) {
			System.out.println("A");
		} else if (A == 2 && B == 1) {
			System.out.println("A");
		} else if (A == 2 && B == 3) {
			System.out.println("B");
		} else if (A == 3 && B == 1) {
			System.out.println("B");
		} else if (A == 3 && B == 2) {
			System.out.println("A");
		}
	}

}
