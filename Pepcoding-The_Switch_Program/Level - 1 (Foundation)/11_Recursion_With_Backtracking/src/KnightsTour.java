
public class KnightsTour {

	static int[][] dir = {{-2, 1}, {-1, 2}, {1, 2}, 
			{2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
	
	public static void main(String[] args) {
		int n = Helper.inputInt();
		int row = Helper.inputInt();
		int col = Helper.inputInt();
		
		int[][] chess = new int[n][n];
		printKnightsTour(chess, row, col, 1);
	}

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(upcomingMove == chess.length * chess.length) {
        	chess[r][c] = upcomingMove;
        	displayBoard(chess);
        	chess[r][c] = 0;
        	return;
        }
    	
 
    	for(int d = 0; d < dir.length; d++) {
    		int row = r + dir[d][0];
    		int col = c + dir[d][1];
    		
    		if(row >= 0 && col >= 0 && row < chess.length && col < chess[0].length) {
    			if(chess[row][col] == 0) {
    				chess[r][c] = upcomingMove;
    				printKnightsTour(chess, row, col, upcomingMove + 1);
    				chess[r][c] = 0;
    			}
    		}
    	}
    	
    	
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
