import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int outer_space = n / 2;
		int inner_space = -1;
		
		for(int i = 0; i < n; i++) {
			
			for(int os = 0; os < outer_space; os++) {
				System.out.print(" \t");
			}
			
			System.out.print("*\t");
			
			for(int is = 0; is < inner_space; is++) {
				System.out.print(" \t");
			}
			
			if(i > 0 && i < n - 1) {
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i < n / 2) {
				outer_space--;
				inner_space += 2;
			}else {
				outer_space++;
				inner_space -= 2;
			}
			
		}
		
		
		scan.close();
	}
}
