import java.util.Scanner;

public class DigitsOfANumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//1. Get number of digits.
		int tempN = n;
		int numberOfDigits = 0;
		while(tempN != 0) {
			tempN /= 10;
			numberOfDigits++;
		}
		
		//2. assign the divisor first time
		int div = (int) Math.pow(10, numberOfDigits - 1);
		
		//3. Calculate and print digits from left to right.
		while(div > 0) {
			int q = n / div;
			int r = n % div;
			
			System.out.println(q);
			
			div /= 10;
			n = r;
		}
		
		scan.close();
	}
}
