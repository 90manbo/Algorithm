import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012_°ýÈ£ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			Stack<Character> st = new Stack<>();
			String line = br.readLine();
			String answer = "";
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '(') {
					st.push(line.charAt(i));
				} else {
					if (!st.isEmpty()) {
						st.pop();
					} else {
						answer = "NO";
						break;
					}
				}
			}

			if (st.isEmpty() && answer.equals("")) {
				answer = "YES";
			} else {
				answer = "NO";
			}
			System.out.println(answer);

		}

	}

}
