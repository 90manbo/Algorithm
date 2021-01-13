import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_1240_단순2진암호코드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			String[] tmp = br.readLine().split(" ");
			int N = Integer.parseInt(tmp[0]);
			int M = Integer.parseInt(tmp[1]);

			int[][] arr = new int[N][M];

			for (int i = 0; i < N; i++) {
				char[] line = br.readLine().toCharArray();
				for (int j = 0; j < M; j++) {
					arr[i][j] = line[j] - '0';
				}

			}
			// 1 시작하는 인덱스 찾는 부분
			int di = 0;
			int dj = 0;
			boolean flag = false;
			for (int i = 0; i < N; i++) {
				if (flag == false) {
					for (int j = M - 1; j >= 0; j--) {
						if (arr[i][j] == 1) {
							di = i;
							dj = j;
							flag = true;
							break;
						}
					}
				} else {
					break;
				}
			}

			int idx = 0;

			int count = 0;

			int[] temp = new int[7];

			int checkCode1 = 0;
			int checkCode2 = 0;
			int checkCode3 = 0;

			for (int j = dj - 55; j < dj + 1; j++) { // 찾은 1의 인덱스가 배열의 뒷부분임. 시작점으로 이동
				temp[idx++] = arr[di][j]; // 앞에서 부터 7개씩 끊어서 임시배열에 저장함.
				if (idx >= 7) {
					int x = Operator(temp);
					if ((count % 2) == 0 && count < 7) { // 짝수번의 인덱스 값에 대한 연산
						checkCode1 += x;
						count++;
					} else if ((count % 2) == 1 && count < 7) { // 홀수 번의 인덱스 값에 대한 연산
						checkCode2 += x;
						count++;
					} else if (count == 7) { // 7번 인덱스 검증코드
						checkCode3 += x;
					}
					idx = 0;
				}
			}

			int result = (checkCode1 * 3) + checkCode2 + checkCode3; // 상품코드에 대한 검사
			if ((result % 10) == 0) {
				System.out.println("#" + tc + " " + (checkCode1 + checkCode2 + checkCode3));
			} else {
				System.out.println("#" + tc + " " + 0);
			}

		}
	}

	public static int Operator(int[] array) {

		int value = -1;

		String[] check = { "0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011",
				"0110111", "0001011" };

		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i] + "";
		}

		for (int i = 0; i < check.length; i++) { // string이 0부터 차례대로 시작함.
			if (str.equals(check[i])) {
				value = i;
			}
		}

		return value;
	}
}
