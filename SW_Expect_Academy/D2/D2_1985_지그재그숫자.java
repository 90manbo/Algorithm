import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1���� N ���� Ȧ���� ���ϰ� ¦���� ������ ���� ������ ���� ����.
 * 
 */
public class D2_1985_������׼��� {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		
		for(int tc=1; tc<=TC; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			
			int result = 0;
			for(int i = 1; i<=N; i++) {
				if(i%2==0) {
					result -= i;
				}else {
					result += i;
				}
			}
			System.out.println("#"+tc+" "+result);
		}
	}

}
