package queue;

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

		Queue<Integer> queue = new LinkedList<>();
		String[] command = br.readLine().split(" ");
		int N = Integer.parseInt(command[0]);
		int K = Integer.parseInt(command[1]);

		for (int i = 1; i < N + 1; i++) {
			queue.offer(i);
		}

		bw.write("<");
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < K - 1; j++) {
				queue.offer(queue.peek());
				queue.poll();
			}
			bw.write(String.valueOf(queue.poll()));
			bw.write(", ");
		}
		bw.write(String.valueOf(queue.poll()));
		bw.write(">");
		bw.flush();
		bw.close();

	}

}
