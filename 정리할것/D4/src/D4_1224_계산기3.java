import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D4_1224_°è»ê±â3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String ans = "";
			Stack<Character> st = new Stack<>();

			for (int i = 0; i < N; i++) {
				char tmp = line.charAt(i);

				if (tmp >= '0' && tmp <= '9') {
					ans += tmp;
				} else if (tmp == '(') {
					st.push(tmp);
				} else if (tmp == ')') {
					char cur = st.pop();
					while (!st.isEmpty() && cur != '(') {
						ans += cur;
						cur = st.pop();
					}
				} else {
					if (st.isEmpty()) {
						st.push(tmp);
					} else {
						if (priority(st.peek()) >= priority(tmp)) {
							ans += st.pop();
							st.push(tmp);
						} else {
							st.push(tmp);
						}
					}
				}

			}
			while (!st.isEmpty()) {
				ans += st.pop();
			}

			Stack<Integer> st2 = new Stack<>();
			for (int i = 0; i < ans.length(); i++) {
				char tmp = ans.charAt(i);
				if (tmp >= '0' && tmp <= '9') {
					st2.push(tmp - '0');
				} else if (tmp == '+') {
					int tmp1 = st2.pop();
					int tmp2 = st2.pop();
					st2.push(tmp1 + tmp2);
				} else if (tmp == '*') {
					int tmp1 = st2.pop();
					int tmp2 = st2.pop();
					st2.push(tmp1 * tmp2);
				}
			}
			int result = st2.pop();

			System.out.println("#" + tc + " " + result);

		}

	}

	static int priority(char op) {
		if (op == '*') {
			return 2;
		} else if (op == '+') {
			return 1;
		} else {
			return -1;
		}
	}
}
