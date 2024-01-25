import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int n = scan.nextInt();
		
		for(int r = 0; r < n; r++) {
			
			//for every row
			int oldValue = 1;
			
			for(int c = 0; c <= r; c++) {
				System.out.print(oldValue + "\t");
				int newValue = oldValue * (r - c) / (c + 1);
				oldValue = newValue;
			}
			
			System.out.println();
		}
		
		
		
		scan.close();
	}

}
