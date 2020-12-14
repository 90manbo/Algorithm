import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10799_¼è¸·´ë±â {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> st = new Stack<>();
		String line = br.readLine();
		int result = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '(') {
				st.push(i);
			} else {
				int tmp = 0;
				tmp = st.peek() + 1;
				if (tmp == i) {
					st.pop();
					result += st.size();
				} else {
					st.pop();
					result += 1;
				}
			}
		}
		System.out.println(result);
	}
}
