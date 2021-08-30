package dfs_bfs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS¿ÍBFS{
	static int N, M, V;
	static int[][] map;
	static boolean[] check;
	static Queue<Integer> queue;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();

		map = new int[N + 1][N + 1];
		check = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
		}

		dfs(V);
		System.out.println();
		check = new boolean[N + 1];
		bfs();
		System.out.println();

	}

	public static void bfs() {
		queue = new LinkedList<>();

		queue.add(V);
		check[V] = true;
		while (!queue.isEmpty()) {
			int num = queue.poll();
			System.out.print(num + " ");

			for (int i = 1; i < N + 1; i++) {
				if (map[num][i] == 1 && !check[i]) {
					queue.add(i);
					check[i] = true;
				}
			}
		}
	}

	public static void dfs(int now) {
		check[now] = true;
		System.out.print(now + " ");
		for (int i = 1; i < N + 1; i++) {
			if (map[now][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}

}