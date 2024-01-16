import java.util.Scanner;

/**
 * 
 *     Pattern is row wise, n = 5
 *     
 *     *
 *     * *
 *     * * *
 *     * * * *
 *     * * * * *
 * 
 * 
 * @author pulkit-rastogi97
 *
 */
public class Pattern1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		//initialize star count
		int star = 1;
		
		//loop row
		for(int r = 0; r < n; r++) {
			
			//print row of stars
			for(int st = 0; st < star; st++) {
				System.out.print("*\t");
			}
			
			//hit enter
			System.out.println();
			
			//manage star count
			star++;
		}
		
		scan.close();
	}

}
