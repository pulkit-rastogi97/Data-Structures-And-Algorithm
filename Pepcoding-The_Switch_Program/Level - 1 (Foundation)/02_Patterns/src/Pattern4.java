import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int star = n;
		int space = 0;
		
		//traverse row
		for(int i = 1; i <= n; i++) {
			
			//print space
			for(int sp = 1; sp <= space; sp++) {
				System.out.print(" \t");
			}
			
			//print star
			for(int st = 1; st <= star; st++) {
				System.out.print("*\t");
			}
			
			System.out.println();
			
			star--;
			space++;
		}
		
		
		
		scan.close();
	}
}
