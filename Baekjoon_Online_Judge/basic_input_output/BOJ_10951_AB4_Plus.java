package basic_input_output;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class BOJ_10951_AB4_Plus {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String line = "";
		while((line = br.readLine()) != null) {
			st = new StringTokenizer(line," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int result = A + B;
			bw.write(String.valueOf(result));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}