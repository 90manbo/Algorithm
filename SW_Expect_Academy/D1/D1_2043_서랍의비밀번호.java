/*
 * String 배열을 생성하여 입력받은 한 줄을 split() 사용하여 " " 끊어서 저장.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2043_서랍의비밀번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int P = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);

		System.out.println(P - K + 1);

	}

}
