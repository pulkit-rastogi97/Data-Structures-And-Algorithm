import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueenCombinations2Das1DQueenChooses {

	//lcno -> last cell number
	public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
		if(qpsf == tq) {
			for(int i = 0; i < chess.length; i++) {
				for(int j = 0; j < chess[0].length; j++) {
					if(chess[i][j] == true) {
						System.out.print("q\t");
					}else {
						System.out.print("-\t");
					}
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		
		//traversing as 1D
		for(int b = lcno + 1; b < chess.length * chess[0].length; b++) {
			int r = b / chess.length;
			int c = b % chess[0].length;
			
			//place
			chess[r][c] = true;
			
			queensCombinations(qpsf + 1, tq, chess, b);
			
			//unplace
			chess[r][c] = false;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[][] chess = new boolean[n][n];

		queensCombinations(0, n, chess, -1);
	}
}
