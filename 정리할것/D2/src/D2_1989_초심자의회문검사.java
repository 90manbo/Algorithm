/*
 * �ܾ �Է¹޾� ȸ���̸� 1�� ����ϰ� �ƴϸ� 0�� ����Ѵ�.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1989_�ʽ�����ȸ���˻� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String line = br.readLine().trim();
			StringBuffer sb = new StringBuffer().append(line).reverse();
			
			int result = -1;
			for(int i = 0; i< line.length(); i++) {
				if(line.charAt(i) != sb.charAt(i)) {
					result = 0;
					break;
				}
				result = 1;
			}


			System.out.println("#" + tc + " " + result);
		}
	}
}