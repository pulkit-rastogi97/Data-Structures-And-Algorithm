
public class Fibonacci_DP {

	public static void main(String[] args) {
		int n = Helper.inputInt();
		
		int answer = 0;
		// fibonacci-recursive
		answer = fib_rec(n);
		System.out.println("Recursive approach answer   : " + answer);


		// fibonacci-memoization
		int[] dp = new int[n + 1];
		answer = fib_memo(n, dp);
		System.out.println("Memoization approach answer : " + answer);


		// fibonacci-recursive
		answer = fib_tab(n, dp);
		System.out.println("Tabulation approach answer  : " + answer);
		
		//fibonacci-conversion of memoization to tabulation
		answer = fib_memo_to_tab(n, dp);
		System.out.println("Conversion of Memoization to Tabulation approach answer  : " + answer);

	}

	private static int fib_memo_to_tab(int N, int[] dp) {
		for(int n = 0; n <= N; n++) {
			if(n == 0 || n == 1) {
				dp[n] = n;
				continue;
			}
			
			int fibnm1 = dp[n - 1]; //fib_memo(n - 1, dp);
			int fibnm2 = dp[n - 2]; //fib_memo(n - 2, dp);
			
			dp[n] = fibnm1 + fibnm2;
		}
		return dp[N];
	}

	private static int fib_rec(int n) {
		if(n == 0 || n == 1)
			return n;
		
		int fibnm1 = fib_rec(n - 1);
		int fibnm2 = fib_rec(n - 2);
		
		int fibn = fibnm1 + fibnm2;
		
		return fibn;
	}

	private static int fib_memo(int n, int[] dp) {
		if(n == 0 || n == 1)
			return dp[n] = n;
		
		if(dp[n] != 0)
			return dp[n];
		
		int fibnm1 = fib_memo(n - 1, dp);
		int fibnm2 = fib_memo(n - 2, dp);
		
		dp[n] = fibnm1 + fibnm2;
		
		return dp[n];
	}

	private static int fib_tab(int n, int[] dp) {
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
	}
}
