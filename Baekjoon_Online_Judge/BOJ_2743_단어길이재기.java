import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2743_�ܾ������� {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		int count = 0;
		for(int i = 0; i<line.length(); i++) {
			count++;
		}
		System.out.println(count);
		
	}
}
