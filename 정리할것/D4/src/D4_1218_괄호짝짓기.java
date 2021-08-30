import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D4_1218_°ýÈ£Â¦Áþ±â {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			Stack<Character> st = new Stack<>();
			int N = Integer.parseInt(br.readLine());
			char[] line = br.readLine().toCharArray();

			int result = 1;

			for (int i = 0; i < N; i++) {
				char ch = line[i];
				if (ch == '(' || ch == '{' || ch == '<' || ch == '[') {
					st.push(ch);
				} else if (!st.empty()) {
					char tmp = st.peek();
					if (tmp == '(' && ch == ')') {
						st.pop();
					} else if (tmp == '{' && ch == '}') {
						st.pop();
					} else if (tmp == '<' && ch == '>') {
						st.pop();
					} else if (tmp == '[' && ch == ']') {
						st.pop();
					} else {
						result = 0;
						break;
					}
				} else if (st.empty() && (ch == ')' || ch == '}' || ch == '>' || ch == ']')) {
					result = 0;
					break;
				}
			}

			if (!st.empty()) {
				result = 0;
			}

			System.out.println("#" + tc + " " + result);
		}
	}

}
