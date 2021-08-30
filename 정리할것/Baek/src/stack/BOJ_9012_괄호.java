package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_9012_°ýÈ£ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			Stack<Character> st = new Stack<>();
			char[] line = br.readLine().toCharArray();
			String answer = "";
			for (int i = 0; i < line.length; i++) {
				if (line[i] == '(') {
					st.push(line[i]);
				} else if (line[i] == ')') {
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

			bw.write(answer);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
