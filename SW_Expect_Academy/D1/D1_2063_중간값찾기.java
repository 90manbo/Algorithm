/*
 * 1. 입력을 리스트에 저장하여서 소트함.
 * 2. 리스트의 중간에 있는 값 출력.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class D1_2063_중간값찾기 {

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
