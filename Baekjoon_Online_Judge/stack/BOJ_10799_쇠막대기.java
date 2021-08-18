package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_10799_¼è¸·´ë±â {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Integer> st = new Stack<>();
		char[] line = br.readLine().toCharArray();
		int result = 0;
		for (int i = 0; i < line.length; i++) {
			if (line[i] == '(') {
				st.push(i);
			} else if (line[i] == ')') {
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
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();

	}

}
