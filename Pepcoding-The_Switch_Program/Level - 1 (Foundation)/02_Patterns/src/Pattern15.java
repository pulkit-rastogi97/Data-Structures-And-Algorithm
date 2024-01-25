import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int val = 1;
		int space = n / 2;
		int printNum = 1;
		for(int r = 0; r < n; r++) {

			//print space
			for(int c = 0; c < space; c++) {
				System.out.print(" \t");
			}
			
			int iv = val;
			//print vals
			for(int c = 0; c < printNum; c++) {
				System.out.print(iv + "\t");

				//manage val
				if(c < printNum / 2) {
					iv++;
				}else {
					iv--;
				}
			}
			
			
			//print space
			for(int c = 0; c < space; c++) {
				System.out.print(" \t");
			}
			
			//hit enter
			System.out.println();
			
			//manage count
			if(r < n / 2) {
				space--;
				printNum += 2;
				val++;
			}else {
				space++;
				printNum -= 2;
				val--;
			}
			
		}
		
		
		scan.close();
	}
}
