import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class D2_1928_Base64Decoder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();
			String result = new String(Base64.getDecoder().decode(line));
			System.out.println("#" + tc + " " + result);

		}

	}

}
