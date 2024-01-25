import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int star = 1;
		int space = n / 2;

		for (int r = 0; r < n; r++) {

			int column = 0;
			
			// print space
			for(int sp = 0; sp < space; sp++) {
				System.out.print(" \t");
				column++;
			}

			// print star
			for(int st = 0; st < star; st++) {
				if(column < (n - 1)/ 2 && r != n / 2) {
					System.out.print(" \t");
				}else {
					System.out.print("*\t");
				}
				
				column++;
			}

			// print space
			for(int sp = 0; sp < space; sp++) {
				System.out.print(" \t");
				column++;
			}
			
			// hit enter
			System.out.println();

			// manage count
			if(r < n / 2) {
				star += 2;
				space--;
			}else {
				star -= 2;
				space++;
			}

		}

		scan.close();
	}
}
