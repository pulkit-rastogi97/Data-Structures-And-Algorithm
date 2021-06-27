
public class MinCostMazeTraversal {

	static int[][] dir = {{0, 1}, {1, 0}};
	public static void main(String[] args) {
		int n = Helper.inputInt();
		int m = Helper.inputInt();
		int[][] costs = Helper.inputArr(n, m);
		int[][] dp = new int[n][m];
		
		int answer = 0;
		// recursive
		answer = minCosts_rec(0, 0, n - 1, m - 1, costs);
		System.out.println("Recursive approach : " + answer);

		// memoization
		answer = minCosts_memo(0, 0, n - 1, m - 1, costs, dp);
		System.out.println("Memoization approach : " + answer);

		//tabulation
		answer = minCosts_tab(0, 0, n - 1, m - 1, costs, dp);
		System.out.println("Tabulation approach : " + answer);

		//memoziation to tabulation
		answer = minCosts_memo_to_tab(0, 0, n - 1, m - 1, costs, dp);
		System.out.println("Memoization to Tabulation approach : " + answer);
	}

	private static int minCosts_memo_to_tab(int sr, int sc, int dr, int dc, int[][] costs, int[][] dp) {
		
		for(int x = dr; x >= 0; x--) {
			for(int y = dc; y >= 0; y--) {
				if(x == dr && y == dc) {
					dp[x][y] = costs[dr][dc];
					continue;
				}
				
				int minCost = (int)(1e9);
				for(int i = 0; i < dir.length; i++) {
					int row = x + dir[i][0];
					int col = y + dir[i][1];
					
					if(row >= 0 && col >= 0 && row <= dr && col <= dc) {
						minCost = Math.min(minCost, dp[row][col]);
					}
				}
				dp[x][y] = minCost + costs[x][y];
			}
		}
		return dp[sr][sc];
	}

	private static int minCosts_tab(int sr, int sc, int dr, int dc, int[][] costs, int[][] dp) {
		dp[dr][dc] = costs[dr][dc];
		
		for(int row = dr - 1; row >= 0; row--) {
			for(int col = dc - 1; col >= 0; col--) {
				int minCost = (int)1e9;
				for(int i = 0; i < dir.length; i++) {
					int r = row + dir[i][0];
					int c = col + dir[i][1];
					
					if(r >= 0 && c >= 0 && r <= dr && c <= dc) {
						minCost = Math.min(minCost, dp[r][c]);
					}
				}
				dp[row][col] = minCost + dp[row][col];
			}
		}
		
		return dp[sr][sc];
	}

	private static int minCosts_memo(int sr, int sc, int dr, int dc, int[][] costs, int[][] dp) {
		if(sr == dr && sc == dc)
			return dp[dr][dc] = costs[dr][dc];
		
		if(dp[sr][sc] != 0)
			return dp[sr][sc];
		
		int minCost = (int)(1e9);
		for(int i = 0; i < dir.length; i++) {
			int row = sr + dir[i][0];
			int col = sc + dir[i][1];
			
			if(row >= 0 && col >= 0 && row <= dr && col <= dc) {
				minCost = Math.min(minCost, minCosts_rec(row, col, dr, dc, costs));
			}
		}
		return dp[sr][sc] = minCost + costs[sr][sc];
	}

	private static int minCosts_rec(int sr, int sc, int dr, int dc, int[][] costs) {
		if(sr == dr && sc == dc)
			return costs[dr][dc];
		
		int minCost = (int)(1e9);
		for(int i = 0; i < dir.length; i++) {
			int row = sr + dir[i][0];
			int col = sc + dir[i][1];
			
			if(row >= 0 && col >= 0 && row <= dr && col <= dc) {
				minCost = Math.min(minCost, minCosts_rec(row, col, dr, dc, costs));
			}
		}
		return minCost + costs[sr][sc];
	}
}
