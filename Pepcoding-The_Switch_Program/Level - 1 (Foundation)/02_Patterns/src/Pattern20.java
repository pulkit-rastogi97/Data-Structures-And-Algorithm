import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int n = scan.nextInt();
		
		for(int row = 1; row <= n; row++) {
			for(int column = 1; column <= n; column++) {
				//print 1st and last column
				if(column == 1 || column == n) {
					System.out.print("*\t");
				}
				else if(row > n/2 && (row == column || row + column == n + 1)) {
					System.out.print("*\t");
				}else {
					System.out.print(" \t");
				}
			}
			
			System.out.println();
		}
		
		
		scan.close();
	}
}
