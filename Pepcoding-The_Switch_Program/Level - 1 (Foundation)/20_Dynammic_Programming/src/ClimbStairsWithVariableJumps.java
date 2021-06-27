
public class ClimbStairsWithVariableJumps {
	public static void main(String[] args) {
		int n = Helper.inputInt();
		int[] jumps = Helper.inputArr(n);
		int[] dp = new int[n + 1];
		
		int answer = 0;
		// recursive
		answer = varJumps_rec(0, n, jumps);
		System.out.println("Recursive approach : " + answer);

		// memoization
		answer = varJumps_memo(0, n, jumps, dp);
		System.out.println("Memoization approach : " + answer);

		// recursive
		answer = varJumps_tab(0, n, jumps, dp);
		System.out.println("Tabulation approach : " + answer);

		// recursive
		answer = varJumps_memo_to_tab(0, n, jumps, dp);
		System.out.println("Memoization to Tabulation approach : " + answer);
	}

	private static int varJumps_memo_to_tab(int i, int n, int[] jumps, int[] dp) {
		for(i = n; i >= 0; i--) {
			if(i == n) {
				dp[i] = 1;
				continue;
			}
			
			int count = 0;
			for(int j = 1; j <= jumps[i] && j + i <= n; j++) {
				count += dp[i + j]; //varJumps_rec(i + j, n, jumps);
			}
			dp[i] = count;
		}
		return dp[i + 1];
	}

	private static int varJumps_tab(int i, int n, int[] jumps, int[] dp) {
		dp[n] = 1;
		
		//direction of solving problem
		for(i = n - 1; i >= 0; i--) {
			int count = 0;
			for(int j = 1; j <= jumps[i] && j + i <= n; j++) {
				count += dp[i + j];
			}
			dp[i] = count;
		}
		
		return dp[i + 1];
	}

	private static int varJumps_memo(int i, int n, int[] jumps, int[] dp) {
		if(i == n) {
			return dp[i] = 1;
		}
		
		if(dp[i] != 0)
			return dp[i];
		
		int count = 0;
		for(int j = 1; j <= jumps[i] && j + i <= n; j++) {
			count += varJumps_rec(i + j, n, jumps);
		}
		
		return dp[i] = count;
	}

	private static int varJumps_rec(int i, int n, int[] jumps) {
		if(i == n) {
			return 1;
		}
		
		int count = 0;
		for(int j = 1; j <= jumps[i] && j + i <= n; j++) {
			count += varJumps_rec(i + j, n, jumps);
		}
		return count;
	}

}