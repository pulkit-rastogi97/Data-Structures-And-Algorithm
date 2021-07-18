import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueenCombinations2Das2DQueenChooses {

	public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int i, int j) {
		if(qpsf == tq) {
			for(int i1 = 0; i1 < chess.length; i1++) {
				for(int j1 = 0; j1 < chess[0].length; j1++) {
					System.out.print(chess[i1][j1] == true ? "q\t" : "-\t");
				}
				System.out.println();
			}
			System.out.println();

			return;
		}
		
		//place queen in current row
		for(int col = j + 1; col < chess[0].length; col++) {
			//place
			chess[i][col] = true;
			queensCombinations(qpsf + 1, tq, chess, i, col);
			//unplace
			chess[i][col] = false;
		}
		
		
		//from next row to end point
		for(int row = i + 1; row < chess.length; row++) {
			for(int col = 0; col < chess[0].length; col++) {
				//place
				chess[row][col] = true;
				queensCombinations(qpsf + 1, tq, chess, row, col);
				//unplace
				chess[row][col] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[][] chess = new boolean[n][n];

		queensCombinations(0, n, chess, 0, -1);
	}
}
