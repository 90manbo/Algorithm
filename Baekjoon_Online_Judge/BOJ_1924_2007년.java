import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1924_2007³â {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] line = br.readLine().split(" ");
		int month = Integer.parseInt(line[0]);
		int day = Integer.parseInt(line[1]);

		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		
		int total = day;
		for(int i = 0 ; i<month-1; i++) {
			total += daysOfMonth[i];
		}
		bw.write(days[total%7]);
		bw.flush();
		bw.close();
	}

}
