import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D4_5432_쇠막대기자르기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine();

			Stack<Integer> st = new Stack<>();

			int result = 0;

			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '(') {
					st.push(i);
				} else {
					int tmp = st.peek() + 1;
					if (tmp == i) {
						st.pop();
						result += st.size();
					} else {
						st.pop();
						result += 1;
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
