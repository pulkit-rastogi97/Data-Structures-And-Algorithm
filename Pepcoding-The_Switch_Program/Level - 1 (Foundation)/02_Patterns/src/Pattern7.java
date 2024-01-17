import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//if we start loop from 1, logic will change. as we need to find eqn of line again.
		
		////loop for row
		for(int r = 0; r < n; r++) {
			
			for(int c = 0; c < n; c++) {
				
				//each column work
				if(r == c) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
				
			}
			
			//hit enter
			System.out.println();
			
			
		}
		
		
		scan.close();
	}
}
