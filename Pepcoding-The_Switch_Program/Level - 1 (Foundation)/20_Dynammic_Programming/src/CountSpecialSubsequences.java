
public class CountSpecialSubsequences {

	public static void main(String[] args) {
		String str = Helper.inputString();
		
		int total = countSpecialSubsequences(str);
		System.out.println(total);
	}

	private static int countSpecialSubsequences(String str) {
		int[][] dp = new int[3][str.length()];
		
		int count_a = 0;
		int count_b = 0;
		int count_c = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				int old_count_a = i - 1 >= 0 ? dp[0][i - 1] : 0;
				count_a = 2 * old_count_a + 1;    
			}else if(str.charAt(i) == 'b') {
				int old_count_b = i - 1 >= 0 ? dp[1][i - 1] : 0;
				count_b = count_a + 2 * old_count_b;    
			}else if(str.charAt(i) == 'c') {
				int old_count_c = i - 1 >= 0 ? dp[2][i - 1] : 0;
				count_c = count_b + 2 * old_count_c;    
			}
			dp[0][i] = count_a;
			dp[1][i] = count_b;
			dp[2][i] = count_c;
		}
		return count_c;
	}
}
