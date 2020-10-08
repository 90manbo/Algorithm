/*
 * 1. String으로 입력받음.
 * 2. 반복문과 charAt사용하여 한 단어씩 찾은 문자에 공백을 더함.
 * 3. 인트형으로 변환하여 더하기 반복.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2058_자릿수더하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		int result = 0;

		for (int i = 0; i < line.length(); i++) {
			int tmp = Integer.parseInt(line.charAt(i) + "");
			result += tmp;
		}
		System.out.println(result);
	}
}