/*1. ����Ʈ�� �Է°��� �޾Ƽ� ���� 10��ŭ�� ����, �������� �Է¸� �ް� �����ϱ�
 *2. �ݺ� Ƚ���� char �޾Ƽ�,  char �� I D A Ȯ�� �Ұ� 
 *3. I�� ��� �ش� �ε��� ��ȣ�� ���̸� ���� �ʴ� ��� �� �ε������� ������ŭ ���� 
 *4. D�� ��� �ش� �ε��� ��ȣ�� ���̸� ���� �ʴ� ��� �� �ε������� ������ŭ ����
 *4. A�� ��� �� �ڿ� �ٿ��ֱ� �ϹǷ� �Է¸� �ް� �����ص� �ɰͰ���
 *5. ����Ʈ ���  
 */

import java.util.ArrayList;
import java.util.Scanner;

public class D3_1230_��ȣ��3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				if (i < 10) {
					arr.add(i, sc.nextInt());
				} else {
					sc.nextInt();
				}
			}

			int N2 = sc.nextInt();
			for (int i = 0; i < N2; i++) {
				String tmp = sc.next().trim();
				if (tmp.equals("I")) {
					int idx = sc.nextInt();
					int num = sc.nextInt();
					for (int j = idx; j < idx + num; j++) {
						if (j < 10) {
							arr.add(j, sc.nextInt());
						} else {
							sc.nextInt();
						}
					}
				} else if (tmp.equals("D")) {
					int idx = sc.nextInt();
					int num = sc.nextInt();
					for (int j = idx; j < idx + num; j++) {
						if (j < 10) {
							arr.remove(j);
						} else {
							break;
						}
					}
				} else if (tmp.equals("A")) {
					int num = sc.nextInt();
					for (int j = 0; j < num; j++) {
						sc.nextInt();
					}
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < 10; i++) {
				System.out.print(arr.get(i) + " ");
			}
			System.out.println();

		}

	}
}