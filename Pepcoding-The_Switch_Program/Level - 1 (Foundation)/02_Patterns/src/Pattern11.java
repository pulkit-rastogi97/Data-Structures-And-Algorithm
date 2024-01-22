import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int num = 1;
		int col = 1;
		
		for(int i = 0; i < n; i++) {
			for(int c = 0; c < col; c++) {
				System.out.print(num++ + "\t");
			}
			System.out.println();
			col++;
		}
		scan.close();
	}
}
