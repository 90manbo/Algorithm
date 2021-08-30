import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };

		solution(scores);
	}

	public static String solution(int[][] scores) {

		int length = scores.length;

		int[] myScore = new int[length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i == j) {
					myScore[i] = scores[i][j];
					break;
				}
			}
		}

		int[]sum = new int[length];
		
		for(int j =0; j<length; j++) {
			for(int i = 0; i<length; i++) {
				sum[j] += scores[i][j];
			}
		}
		
		int maxScore = 0;
		int minScore = 0;
		boolean flag = false;
		for(int j = 0; j<length; j++) {
			if(flag) {
				break;
			}
			for(int i =0; i<length; i++) {
				maxScore = myScore[j];
				minScore = myScore[j];
				int tmpScore = scores[i][j];
				if(i != j && (tmpScore >maxScore || tmpScore < minScore)) {
					flag = true;
					break;
				}
			}
		}
		

		String answer = "";
		return answer;
	}

}
