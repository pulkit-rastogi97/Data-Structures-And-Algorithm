import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int space = 0;
		int star = n;
		
		for(int i = 0; i < n; i++) {
			
			//print spaces
			for(int sp = 0; sp < space; sp++) {
				System.out.print(" \t");
			}
			
			//print star
			for(int st = 0; st < star; st++) {
				if(i > 0 && i < n / 2) {
					if(st > 0 && st < star - 1) {
						System.out.print(" \t");
					}else {
						System.out.print("*\t");
					}
				}else {
					System.out.print("*\t");
				}
			}
			
			//hit enter
			System.out.println();
			
			//manage count
			if(i < n / 2) {
				space++;
				star-=2;
			}else {
				star+=2;
				space--;
			}
			
		}
		scan.close();
	}
}
