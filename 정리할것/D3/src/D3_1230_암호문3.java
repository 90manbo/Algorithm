/*1. 리스트에 입력값을 받아서 길이 10만큼만 저장, 나머지는 입력만 받고 무시하기
 *2. 반복 횟수와 char 받아서,  char 는 I D A 확인 할것 
 *3. I인 경우 해당 인덱스 번호가 길이를 넘지 않는 경우 그 인덱스부터 갯수만큼 갱신 
 *4. D인 경우 해당 인덱스 번호가 길이를 넘지 않는 경우 그 인덱스부터 갯수만큼 삭제
 *4. A인 경우 맨 뒤에 붙여넣기 하므로 입력만 받고 무시해도 될것같음
 *5. 리스트 출력  
 */

import java.util.ArrayList;
import java.util.Scanner;

public class D3_1230_암호문3 {

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