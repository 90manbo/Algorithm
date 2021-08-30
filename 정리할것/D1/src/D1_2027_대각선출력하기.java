/*
 * 1. 5행5열 배열 생성.
 * 2. 이중 반복문을 돌면서 i, j 값이 동일한 경우에만 # 저장, 아니면 + 저장
 * 3. 이중 반복문 돌리면서 출력. 
 */
public class D1_2027_대각선출력하기 {

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
