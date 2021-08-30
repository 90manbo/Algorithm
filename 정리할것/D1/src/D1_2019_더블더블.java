/*
 * 1. �Է°� + 2 ũ���� �迭 ����
 * 2. 1�� �迭�� 1 ���� 
 * 3. i=2 ���� �ݺ��� ���鼭, ���� �� *2 �� ���� ���� ĭ�� ����.
 * 4. ��� 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_2019_������� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] result = new int[N + 2];
		result[1] = 1;

		for (int i = 2; i < N + 2; i++) {
			result[i] = result[i - 1] * 2;
		}

		for (int i = 1; i < N + 2; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();

	}

}
