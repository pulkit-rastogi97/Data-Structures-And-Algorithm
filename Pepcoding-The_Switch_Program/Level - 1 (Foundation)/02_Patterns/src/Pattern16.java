import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int spaces = n + 2;
		int stars = 1;

		for (int r = 0; r < n; r++) {
			
			// print star
			for (int c = 0; c < stars; c++) {
				System.out.print(c + 1 + "\t");
			}

			// print space
			for (int c = 0; c < spaces; c++) {
				System.out.print(" \t");
			}

			// print star
			if (r == n - 1) {
				stars--;
			}
			for (int c = stars; c > 0; c--) {
				System.out.print(c +"\t");
			}

			System.out.println();

			stars++;
			spaces -= 2;
		}

		scan.close();
	}
}
