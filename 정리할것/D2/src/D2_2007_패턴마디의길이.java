/*
 * substring(a,b)�� a���� b-1��° ����  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_2007_���ϸ����Ǳ��� {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();

			for (int i = 1; i <= line.length(); i++) {
				String pattern = line.substring(0, i);
				String tmp = line.substring(i, i + i);
				if (pattern.equals(tmp)) {
					System.out.println("#" + tc + " " + pattern.length());
					break;
				}
			}

		}

	}
}