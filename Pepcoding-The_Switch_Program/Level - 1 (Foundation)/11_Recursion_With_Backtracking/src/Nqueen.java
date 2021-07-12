
public class Nqueen {

	public static void main(String[] args) {
		int n = Helper.inputInt();
		int[][] chess = new int[n][n];
		printNQueens(chess, "", 0);
	}

	private static void printNQueens(int[][] chess, String qsf, int row) {
		if(row == chess.length) {
			System.out.println(qsf + ".");
			return;
		}
		
		for(int col = 0; col < chess.length; col++) {
			if(isItSafeToPutQueen(chess, row, col) == true) {
				chess[row][col] = 1;
				printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
				chess[row][col] = 0;
			}
		}
	}

	private static boolean isItSafeToPutQueen(int[][] chess, int row, int col) {
		//1. check straight up
		for(int i = row, j = col; i >= 0; i--) {
			if(chess[i][j] == 1)
				return false;
		}
		
		//2. check left diagonal
		for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if(chess[i][j] == 1)
				return false;
		}
		
		//3. check right diagonal
		for(int i= row, j = col; i >= 0 && j < chess.length; i--, j++) {
			if(chess[i][j] == 1)
				return false;
		}
		
		//place is safe
		return true;
	}
}
