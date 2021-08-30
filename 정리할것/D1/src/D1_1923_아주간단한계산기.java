/*
 * 1. µÎ ¼ö¸¦ ÀÔ·Â¹ÞÀ½.
 * 2. µÎ ¼ö¿¡ ´ëÇÑ µ¡¼À, »¬¼À, °ö¼À, ³ª´°¼ÀÇÑ °á°ú°© Ãâ·Â.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_1923_¾ÆÁÖ°£´ÜÇÑ°è»ê±â {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}

}
