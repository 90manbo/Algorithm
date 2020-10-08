import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 10���� ���� �Է¹޾Ƽ� �ִ� ��, �ּ� ���� �A �������� ��հ��� ���Ѵ�.
 * �Ҽ��� ù° �ڸ����� �ݿø��� ������ ����Ѵ�.
 * 1. ����Ʈ�� �� ��Ƽ� ��Ʈ 
 * 2. ó���� �� ������ ������ ���� ��� ���ؼ� ������ 8
 * 3. round �Լ� �Ἥ �ݿø�
 */
public class D2_1984_�߰���հ����ϱ� {

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
