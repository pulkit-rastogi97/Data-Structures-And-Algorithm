import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NQueenPermutations2Das1DQueenChooses {

	//Level - Queens
	//Options - Places to place into
	static int[] rdir = { 0, -1, -1, -1, 0, 1, 1, 1 };
	static int[] cdir = { -1, -1, 0, 1, 1, 1, 0, -1 };
    // permutation for arrangement of queens
    public static boolean IsQueenSafe(int[][] chess, int row, int col) {
        // write your code here
        for(int rad = 1; rad < chess.length; rad++) {
            for(int d = 0; d < 8; d++) {
                int r = row + rdir[d] * rad;
                int c = col + cdir[d] * rad;
                if(r >= 0 && r < chess.length && c >= 0 && c < chess[0].length && chess[r][c] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
	public static void nqueens(int qpsf, int tq, int[][] chess) {
        if (qpsf == tq) {
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                	if(chess[row][col] != 0)
                		System.out.print("q" + chess[row][col] + "\t");
                	else
                		System.out.print("-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= chess.length * chess.length - 1; i++) {
            int row = i / chess.length;
            int col = i % chess.length;

            if (chess[row][col] ==0 && IsQueenSafe(chess, row, col)) {
                chess[row][col] = qpsf + 1;
                nqueens(qpsf + 1, tq, chess);
                chess[row][col] = 0;
            }
        }
    }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] chess = new int[n][n];

		nqueens(0, n, chess);
	}
}
