import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int r = 0; r < n;  r++) {
			for(int c = 0; c < n; c++) {
				if(r + c == n - 1) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
