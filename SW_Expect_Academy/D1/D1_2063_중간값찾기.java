/*
 * 1. �Է��� ����Ʈ�� �����Ͽ��� ��Ʈ��.
 * 2. ����Ʈ�� �߰��� �ִ� �� ���.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class D1_2063_�߰���ã�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();

		String[] number = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(number[i]);
			list.add(tmp);
		}

		list.sort(null);

		System.out.println(list.get(N / 2));
	}

}
