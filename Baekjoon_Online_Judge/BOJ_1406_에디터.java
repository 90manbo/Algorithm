import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_1406_¿¡µðÅÍ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();

		int TC = Integer.parseInt(br.readLine());
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();

		for (int i = 0; i < line.length(); i++) {
			left.push(line.charAt(i) + "");
		}
		for (int tc = 1; tc <= TC; tc++) {

			String co = br.readLine();

			if (co.charAt(0) == 'P') {
				String[] tmp = co.split(" ");
				left.push(tmp[1]);
			} else if (co.equals("L")) {
				if (!left.isEmpty()) {
					String tmp = left.pop();
					right.push(tmp);
				}
			} else if (co.equals("D")) {
				if (!right.isEmpty()) {
					String tmp = right.pop();
					left.push(tmp);
				}
			} else if (co.equals("B")) {
				if (!left.isEmpty()) {

					left.pop();
				}
			}

		}

		while (!left.isEmpty()) {
			right.push(left.pop());
		}

		while (!right.isEmpty()) {
			bw.write(right.pop());
		}
		bw.flush();
		bw.close();
	}
}
