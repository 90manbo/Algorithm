/*
 * substring(a,b)는 a에서 b-1번째 까지  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_2007_패턴마디의길이 {
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