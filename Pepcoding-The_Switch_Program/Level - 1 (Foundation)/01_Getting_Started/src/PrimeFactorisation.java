import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		
		//will run for 2,3,4,5,6,.... sqrt(n).
		//but for 4, 6, inner loop will not run as number won't be divisible by them.
		for(int div = 2; div * div <= n; div++) {
			while(n % div == 0) {
				n = n / div;
				System.out.print(div + " ");
			}
		}
		
		if(n != 1) {
			System.out.print(n);
		}
		
		scan.close();
	}
}
