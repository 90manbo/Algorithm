import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class D3_1225_암호생성기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			int t = Integer.parseInt(br.readLine());
			Queue<Integer> q = new LinkedList<>();
			String[] line = br.readLine().split(" ");
			for (int i = 0; i < 8; i++) {
				q.add(Integer.parseInt(line[i]));
			}

			int count = 1;
			while (true) {
				int tmp = q.poll();
				tmp = tmp - count;
				if (tmp <= 0) {
					q.add(0);
					break;
				}
				count++;
				if (count == 6) {
					count = 1;
				}
				q.add(tmp);
			}

			System.out.print("#" + t + " ");
			while (!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();
		}
	}

}
