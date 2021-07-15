import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Level - Items
 * Options - Box
 * @author pulkit
 *
 */
public class CombinationTwo {
	
	//ci -> current item
	//ti -> total item
	//lb -> last box
	private static void combinations(int[] boxes, int ci, int ti, int lb) {
		if(ci == ti + 1) {
			for(int i = 0; i < boxes.length; i++) {
				if(boxes[i] != 0)
					System.out.print("i");
				else
					System.out.print("-");
			}
			System.out.println();
			return;
		}
		
		for(int b = lb + 1; b < boxes.length; b++) {
			//place
			boxes[b] = ci;
			
			combinations(boxes, ci + 1, ti, b);
			
			//unplace
			boxes[b] = 0;
		}
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nboxes = Integer.parseInt(br.readLine());
		int ritems = Integer.parseInt(br.readLine());
		combinations(new int[nboxes], 1, ritems, -1);
	}
}
