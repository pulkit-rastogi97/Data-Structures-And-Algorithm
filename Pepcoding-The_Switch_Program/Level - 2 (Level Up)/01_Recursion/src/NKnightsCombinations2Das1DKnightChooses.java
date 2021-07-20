import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NKnightsCombinations2Das1DKnightChooses {

	public static boolean isIndexValid(int i, int j, boolean[][] chess) {
		if(i < 0 || j < 0 || i >= chess.length || j >= chess[0].length)
			return false;
		return true;
	}
	public static boolean IsKnightSafe(boolean[][] chess, int i, int j) {
		//1st position
		if(isIndexValid(i - 1, j - 2, chess))
			if(chess[i - 1][j - 2] == true)
				return false;
		
		if(isIndexValid(i - 1, j + 2, chess))
			if(chess[i - 1][j + 2] == true)
				return false;
		
		if(isIndexValid(i - 2, j + 1, chess))
			if(chess[i - 2][j + 1] == true)
				return false;
		
		if(isIndexValid(i - 2, j - 1, chess))
			if(chess[i - 2][j - 1] == true)
				return false;
		
		return true;
			
	}

	public static void nknights(int kpsf, int tk, boolean[][] chess, int lcno) {
		if (kpsf == tk) {
			for (int row = 0; row < chess.length; row++) {
				for (int col = 0; col < chess.length; col++) {
					System.out.print(chess[row][col] ? "k\t" : "-\t");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}

		for (int i = lcno + 1; i < chess.length * chess.length; i++) {
			int row = i / chess.length;
			int col = i % chess.length;

			if (chess[row][col] == false && IsKnightSafe(chess, row, col)) {
				chess[row][col] = true;
				nknights(kpsf + 1, tk, chess, row * chess.length + col);
				chess[row][col] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[][] chess = new boolean[n][n];

		nknights(0, n, chess, -1);
	}
}
