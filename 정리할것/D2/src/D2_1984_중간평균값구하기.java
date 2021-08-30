import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 10개의 수를 입력받아서 최대 수, 최소 수를 뺸 나머지의 평균값을 구한다.
 * 소수점 첫째 자리에서 반올림한 정수를 출력한다.
 * 1. 리스트에 다 담아서 소트 
 * 2. 처음과 끝 제외한 나머지 값들 모두 더해서 나누기 8
 * 3. round 함수 써서 반올림
 */
public class D2_1984_중간평균값구하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= TC; tc++) {
			String[] input = br.readLine().split(" ");
			ArrayList<Integer> line = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
				line.add(Integer.parseInt(input[i]));
			}
			line.sort(null);

			double result = 0;
			for (int i = 1; i < 9; i++) {
				result += line.get(i);
			}
			System.out.println("#" + tc + " " + Math.round(result / 8));
			
			line.clear();
		}
	}

}
