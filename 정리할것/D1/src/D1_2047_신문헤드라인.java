/*
 * 1. toUpperCase 함수는 소문자를 대문자로 바꿔주는 기능을 한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2047_신문헤드라인 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine().toUpperCase();
		System.out.println(line);

	}

}
