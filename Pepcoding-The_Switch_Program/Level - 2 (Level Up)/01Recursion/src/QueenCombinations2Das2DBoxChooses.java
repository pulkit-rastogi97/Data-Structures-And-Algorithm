import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueenCombinations2Das2DBoxChooses {

	// Level - Boxes
	// Options - Queen
	public static void queensCombinations(int qpsf, int tq, int row, int col, String asf) {
		if(row == tq) {
			if(qpsf == tq) {
				System.out.println(asf);
			}
			return;
		}
		
		// Don't enter if column is last
		if (col + 1 < tq) {
			// yes call
			queensCombinations(qpsf + 1, tq, row, col + 1, asf + "q");

			// no call
			queensCombinations(qpsf, tq, row, col + 1, asf + "-");
		}else {
			// yes call
			queensCombinations(qpsf + 1, tq, row + 1, 0, asf + "q\n");

			// no call
			queensCombinations(qpsf, tq, row + 1, 0, asf + "-\n");
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		queensCombinations(0, n, 0, 0, "");
	}
}
