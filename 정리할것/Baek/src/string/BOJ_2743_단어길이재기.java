package string;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2743_�ܾ������� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();

		int length = line.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
			result++;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
