import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int star = 1;
		int space = (n - star);
		
		for(int r = 1; r <= n; r++) {
			
			//print space
			for(int sp = 1; sp <= space; sp++) {
				System.out.print(" \t"); //in pepcoding, it's only tab, not tab with spaces
			}
			
			//print star
			for(int st = 1; st <= star; st++) {
				System.out.print("*\t");
			}
			
			//hit enter
			System.out.println();
			
			//manage space and star
			star++;
			space--;
			
			
			
		}
		
		
		
		scan.close();
	}
}
