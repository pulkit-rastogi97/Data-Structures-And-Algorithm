import java.util.Scanner;

/**
 * 		Pattern 2,  n = 5
 * 
 * 		* * * * *
 * 		* * * *
 * 		* * * 
 * 		* *
 * 		*
 * 
 * 
 * @author pulkit-rastogi97
 *
 */
public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int star = n; 
		
		for(int r = 0; r < n; r++) {
			
			for(int st = 0; st < star; st++) {
				System.out.print("*\t");
			}
			
			System.out.println();
			
			star--;
		}
		
		scan.close();
	}
}
