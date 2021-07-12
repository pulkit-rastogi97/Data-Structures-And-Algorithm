public class GoldMine {

	static int[][] dir = { { -1, 1 }, { 0, 1 }, { 1, 1 } };

	public static void main(String[] args) {
		int n = Helper.inputInt();
		int m = Helper.inputInt();
		int[][] mine = Helper.inputArr(n, m);

		int answer = 0;
		// recursive
		answer = mine_rec(mine);
		System.out.println("Recursive approach : " + answer);
		
		//memoization
		answer = mine_memo(mine);
		System.out.println("Memoization approach: " + answer);
		
		//tabulation
		answer = mine_tab(mine);
		System.out.println("Tabulation approach: " + answer);
		
	}

	private static int mine_memo(int[][] mine) {
		int maxProfit = 0;
		int[][] dp = new int[mine.length][mine[0].length];
		for(int i = 0; i < mine.length; i++) {
			maxProfit = Math.max(maxProfit, helperMine_memo(i,  0, mine, dp));
		}
		
		return maxProfit;
	}

	private static int helperMine_memo(int i, int j, int[][] mine, int[][] dp) {
		if (j == mine[0].length - 1) {
			return dp[i][j] = mine[i][j];
		}

		if(dp[i][j] != 0)
			return dp[i][j];
		
		int profit = 0;
		for (int d = 0; d < dir.length; d++) {
			int row = i + dir[d][0];
			int col = j + dir[d][1];

			if (row >= 0 && col >= 0 && row <= mine.length - 1)
				profit = Math.max(profit, helperMine_memo(row, col, mine, dp));
		}
		return dp[i][j] = profit + mine[i][j];
	}

	private static int mine_rec(int[][] profits) {
		int maxProfit = 0;

		for (int i = 0; i < profits.length; i++) {
			maxProfit = Math.max(maxProfit, helperMine_rec(i, 0, profits));
		}
		return maxProfit;
	}

	private static int helperMine_rec(int i, int j, int[][] profits) {
		if (j == profits[0].length - 1) {
			return profits[i][j];
		}

		int profit = 0;
		for (int d = 0; d < dir.length; d++) {
			int row = i + dir[d][0];
			int col = j + dir[d][1];

			if (row >= 0 && col >= 0 && row <= profits.length - 1)
				profit = Math.max(profit, helperMine_rec(row, col, profits));
		}

		return profit + profits[i][j];
	}
	
	private static int mine_tab(int[][] mine) {
		int maxProfit = 0;

		int[][] dp = new int[mine.length][mine[0].length];
		//pre-requisite marking (last column will be smallest problem
		int lastColumn = mine[0].length - 1;
		for(int x = 0; x < mine.length; x++) {
			dp[x][lastColumn] = mine[x][lastColumn];
			maxProfit = Math.max(maxProfit, dp[x][lastColumn]);
		}

		//largest problem solving
		for(int y = lastColumn - 1; y >= 0; y--) {
			for(int x = 0; x < mine.length; x++) {
				int profit = 0;
				for(int d = 0; d < dir.length; d++) {
					int row = x + dir[d][0];
					int col = y + dir[d][1];
					
					if(row >= 0 && col >= 0 && row <= mine.length - 1 && col <= mine[x].length - 1) {
						profit = Math.max(profit, dp[row][col]);
					}
				}
				dp[x][y] = profit + mine[x][y];	
				if(y == 0)
					maxProfit = Math.max(maxProfit, dp[x][y]);
			}
		}
		return maxProfit;
	}
	
}
