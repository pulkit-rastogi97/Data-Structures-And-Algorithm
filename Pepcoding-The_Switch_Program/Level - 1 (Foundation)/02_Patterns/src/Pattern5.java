import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int star = 1;
		int space = (n - star)/ 2;
		boolean increaseStar = true;
		
		for(int r = 1; r <= n; r++) {
			
			//print space
			for(int sp = 1; sp <= space; sp++) {
				System.out.print(" \t");
			}
			
			//print star
			for(int st = 1; st <= star; st++) {
				System.out.print("*\t");
			}
			
			//print space
			for(int sp = 1; sp <= space; sp++) {
				System.out.print(" \t");
			}
			
			//hit enter
			System.out.println();
			
			//manage count
			if(star >= n) {
				increaseStar = false;
			}
			
			if(!increaseStar) {
				star -= 2;
			}
			else {
				star += 2;
			}
			
			
			space = (n - star) / 2;
		}
		
		scan.close();
	}
}
