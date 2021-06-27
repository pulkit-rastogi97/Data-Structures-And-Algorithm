
public class ClimbStairsWithMinJumps {

	public static void main(String[] args) {
		int n = Helper.inputInt();
		int[] jumps = Helper.inputArr(n);
		int[] dp = new int[n + 1];
		
		int answer = 0;
		
		// recursive
		answer = minJumps_rec(0, n, jumps);
		System.out.println("Recursive approach : " + answer);

		// memoization
		answer = minJumps_memo(0, n, jumps, dp);
		System.out.println("Memoization approach : " + answer);

		// recursive
		answer = minJumps_tab(0, n, jumps, dp);
		System.out.println("Tabulation approach : " + answer);

		// recursive
		answer = minJumps_memo_to_tab(0, n, jumps, dp);
		System.out.println("Memoization to Tabulation approach : " + answer);
	}

	private static int minJumps_memo_to_tab(int i, int n, int[] jumps, int[] dp) {
		for(i = n; i >= 0; i--) {
			if(i == n) {
				dp[i] = 0;
				continue;
			}
			
			int minJumps = (int)1e9;
			for(int jump = 1; jump <= jumps[i] && jump + i <= n; jump++) {
				minJumps = Math.min(minJumps, dp[i + jump]);
			}
			dp[i] = minJumps == 1e9 ? minJumps : minJumps + 1;
		}
		return dp[i + 1];
	}

	private static int minJumps_tab(int i, int n, int[] jumps, int[] dp) {
		dp[n] = 0;
		

		for(i = n - 1; i >= 0; i--) {
			int minJumps = (int)1e9;
			for(int jump = 1; jump <= jumps[i] && jump + i <= n; jump++) {
				minJumps = Math.min(minJumps, dp[i + jump]);
			}
			dp[i] = minJumps == 1e9 ? minJumps : minJumps + 1;
		}
		
		return dp[i + 1];
	}

	private static int minJumps_memo(int i, int n, int[] jumps, int[] dp) {
		if(i == n)
			return dp[i] = 0;
		
		if(dp[i] != 0)
			return dp[i];
		
		int minJumps = (int)1e9;
		for(int jump = 1; jump <= jumps[i] && jump + i <= n; jump++) {
			minJumps = Math.min(minJumps, minJumps_rec(i + jump, n, jumps));
		}
		
		return dp[i] = minJumps == 1e9 ? minJumps : minJumps + 1;
	}

	private static int minJumps_rec(int i, int n, int[] jumps) {
		if(i == n)
			return 0;
		
		int minJumps = (int)1e9;
		
		for(int jump = 1; jump <= jumps[i] && jump + i <= n; jump++) {
			minJumps = Math.min(minJumps, minJumps_rec(i + jump, n, jumps));
		}
		
		return minJumps == 1e9 ? minJumps : minJumps + 1;
	}
}
