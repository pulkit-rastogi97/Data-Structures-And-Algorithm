import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PermutationTwo {

	//cb -> current box
	//tb -> total box
	//items - > item array
	public static void permutations(int cb, int tb, int[] items, int isf, int ti, String asf) {
		if(cb == tb + 1) {
			if(isf == ti)
				System.out.println(asf);
			return;
		}
		
		//yes call
		for(int i = 0; i < items.length  && isf < ti; i++) {
			if (items[i] == 0) {
				// place item in ibox
				items[i] = 1;

				permutations(cb + 1, tb, items, isf + 1, ti, asf + (i + 1)); 

				// unplace for permutation
				items[i] = 0;
			}
		}
		
		//no cal
		permutations(cb + 1, tb, items, isf, ti, asf + 0); 

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nboxes = Integer.parseInt(br.readLine());
		int ritems = Integer.parseInt(br.readLine());
		permutations(1, nboxes, new int[ritems], 0, ritems, "");
	}
}
