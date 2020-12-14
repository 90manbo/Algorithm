import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_1158_요세푸스문제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] line = br.readLine().split(" ");

		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}

		bw.append("<");

		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < M - 1; j++) {
				q.offer(q.peek());
				q.poll();
			}
			bw.append(q.poll() + ", ");
		}

		bw.append(q.peek() + ">");
		bw.flush();
		bw.close();

	}
}
