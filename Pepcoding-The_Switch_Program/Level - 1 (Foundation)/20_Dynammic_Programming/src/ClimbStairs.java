
public class ClimbStairs {

	public static void main(String[] args) {
		int n = Helper.inputInt();
		int[] dp = new int[n + 1];

		int answer = 0;

		// recursive
		answer = climbStairs_rec(n);
		System.out.println("Recursive approach : " + answer);

		// memoization
		answer = climbStairs_memo(n, dp);
		System.out.println("Memoization approach : " + answer);

		// tabulation
		answer = climbStairs_tab(n, dp);
		System.out.println("Tabulation approach : " + answer);

		// tabulation
		answer = climbStairs_memo_to_tab(n, dp);
		System.out.println("Memoization to tabulation approach : " + answer);

	}

	private static int climbStairs_memo(int n, int[] dp) {
		if(n == 0) {
			return dp[n] = 1;
		}
		
		if(dp[n] != 0)
			return dp[n];
		

		for(int jump = 1; jump <= 3; jump++) {
			if(n - jump >= 0) {
				dp[n] += climbStairs_memo(n - jump, dp);
			}
		}
		
		return dp[n];
	}

	private static int climbStairs_memo_to_tab(int N, int[] dp) {
		for(int n = 0; n <= N; n++) {
			if(n == 0) {
				dp[n] = 1;
				continue;
			}
			
			int count = 0;
			for(int jump = 1; jump <= 3; jump++) {
				if(n - jump >= 0) {
					count += dp[n - jump];//climbStairs_memo(n - jump, dp);
				}
			}
			dp[n] = count;
		}
		return dp[N];
	}

	private static int climbStairs_tab(int n, int[] dp) {
		dp[0] = 1;
		
		for(int i = 1; i <= n; i++) {
			int count = 0;
			for(int jump = 1; jump <= 3; jump++) {
				if(i - jump >= 0)
					count += dp[i - jump];
			}
			dp[i] = count;
		}
		return dp[n];
	}

	private static int climbStairs_rec(int n) {
		if(n == 0)
			return 1;
		
		int count = 0;
		for(int jump = 1; jump <= 3; jump++) {
			if(n - jump >= 0) {
				count += climbStairs_rec(n - jump);
			}
		}
		return count;
	}
}
