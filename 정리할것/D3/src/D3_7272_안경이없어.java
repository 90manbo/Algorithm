import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. 문자열로 받아서
 *2. 문자의 특성에 따라 값을 달리하여 카운트로 저장
 *3. 비교하여 같으면 SAME 다르면 DIFF
 */
public class D3_7272_안경이없어 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String[] tmp = br.readLine().split(" ");
			String word = tmp[0];
			String word2 = tmp[1];
			boolean flag = false;

			if (word.length() != word2.length()) {
				flag = true;
			} else {
				for (int i = 0; i < word.length(); i++) {
					if (value(word.charAt(i)) != value(word2.charAt(i))) {
						flag = true;
						break;
					}
				}
			}

			if (flag) {
				System.out.println("#" + tc + " " + "DIFF");
			} else {
				System.out.println("#" + tc + " " + "SAME");
			}

		}
	}

	static int value(char c) {
		switch (c) {
		case 'A':
		case 'D':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
			return 1;
		case 'B':
			return 2;
		default:
			return 0;

		}
	}

}
