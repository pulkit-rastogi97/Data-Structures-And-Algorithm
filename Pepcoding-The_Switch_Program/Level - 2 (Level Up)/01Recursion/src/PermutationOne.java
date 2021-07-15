import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PermutationOne {
	// ci -> current items
	// ti -> total items
	public static void permutations(int[] boxes, int ci, int ti) {
		if (ci == ti + 1) {
			for (int i = 0; i < boxes.length; i++) {
				System.out.print(boxes[i]);
			}
			System.out.println();
			return;
		}
		for (int b = 0; b < boxes.length; b++) {
			if (boxes[b] == 0) {
				// place item in ibox
				boxes[b] = ci;

				permutations(boxes, ci + 1, ti);

				// unplace for permutation
				boxes[b] = 0;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nboxes = Integer.parseInt(br.readLine());
		int ritems = Integer.parseInt(br.readLine());
		permutations(new int[nboxes], 1, ritems);
	}
}
