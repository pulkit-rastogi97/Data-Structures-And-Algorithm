import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueenPermutations2Das2DBoxChooses {

	public static void queensPermutations(int qpsf, int tq, int row, int col, String asf, boolean[] queens) {
		if(row == tq) {
			if(qpsf == tq) {
				System.out.println(asf);
				System.out.println();
			}
			return;
		}
		
		for(int q = 0; q < queens.length; q++) {
			if(queens[q] == false) {
				//place
				queens[q] = true;
				if(col + 1 < tq) {				
					//yes call
					queensPermutations(qpsf + 1, tq, row, col + 1, asf + "q" + (q + 1) + "\t", queens);
				}else {
					//yes call
					queensPermutations(qpsf + 1, tq, row + 1, 0, asf + "q" + (q + 1) + "\n", queens);
				}
				//unplace
				queens[q] = false;
			}
		}
		
		//no call
		if(col + 1 < tq) {				
			queensPermutations(qpsf, tq, row, col + 1, asf + "-" + "\t", queens);
		}else {
			queensPermutations(qpsf, tq, row + 1, 0, asf + "-" + "\n", queens);
		}
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] queens = new boolean[n];

		queensPermutations(0, n, 0, 0, "", queens);
	}
}
