/*
 * 1. 입력 받은 알파벳을 형변환하여 64를 뺀다.
 * 2. 인트형으로 형변환시 A는 64.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2050_알파벳을숫자로변환 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] temp = new String[line.length()];

		for (int i = 0; i < line.length(); i++) {
			temp[i] = ((int) line.charAt(i) - 64) + "";
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
