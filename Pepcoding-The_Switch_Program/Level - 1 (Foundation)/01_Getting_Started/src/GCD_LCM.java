import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int dvd = n1;
		int div = n2;
				
		while(dvd % div != 0) {
			int rem = dvd % div;
			
			dvd = div;
			div = rem;   //rem will never be zero here. Hence, div can't be zero.
		}
		
		int gcd = div;
		int lcm = (n1 * n2) / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
		scan.close();
	}
}
