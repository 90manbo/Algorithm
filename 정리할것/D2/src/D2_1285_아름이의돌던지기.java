import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * -100,000 ~ 100,000
 * N���� ���� ������, 
 * 0�� ���� ����� ��ġ�� 0�� ����, ��� �� 
 */
public class D2_1285_�Ƹ����ǵ������� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TC = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			String[] line = br.readLine().split(" ");
			int[] tmp = new int[N];

			int result = Integer.MAX_VALUE;
			int idx = 0;
			for (int i = 0; i < line.length; i++) {
				tmp[i] = Math.abs(Integer.parseInt(line[i]));

				if (tmp[i] < result) {
					result = tmp[i];
				}
			}

			for (int i = 0; i < line.length; i++) {
				if (result == tmp[i]) {
					idx++;
				}
			}

			bw.write("#" + tc + " ");
			bw.write(result + " " + idx);
			bw.newLine();

		}

		bw.flush();
		bw.close();

	}
}
