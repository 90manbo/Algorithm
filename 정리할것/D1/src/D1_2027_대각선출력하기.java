/*
 * 1. 5��5�� �迭 ����.
 * 2. ���� �ݺ����� ���鼭 i, j ���� ������ ��쿡�� # ����, �ƴϸ� + ����
 * 3. ���� �ݺ��� �����鼭 ���. 
 */
public class D1_2027_�밢������ϱ� {

	public static void main(String[] args) {
		String[][] map = new String[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					map[i][j] = "#";
				} else {
					map[i][j] = "+";
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

}
