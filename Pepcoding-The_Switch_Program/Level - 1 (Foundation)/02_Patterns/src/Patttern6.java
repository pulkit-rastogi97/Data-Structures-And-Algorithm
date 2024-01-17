import java.util.Scanner;

public class Patttern6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
//		n += 1;
		
		int star = (n + 1) / 2;
		int space = 1;
		
		for(int r = 1; r <= n; r++) {
			
			//print star
			for(int st = 1; st <= star; st++) {
				System.out.print("*\t");
			}
			
			//print space
			for(int sp = 1; sp <= space; sp++) {
				System.out.print("\t");
			}
			
			//print star
			for(int st = 1; st <= star; st++) {
				System.out.print("*\t");
			}
			
			System.out.println();
			
			//manage count
			if(r < (n + 1) / 2) {
				star--;
				space += 2;
			}else {
				star++;
				space -= 2;
			}
			
		}
		
		
		scan.close();
	}
}
