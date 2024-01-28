import java.util.Scanner;

/**
 * 
 * @author pulkit-rastogi97
 *
 */
public class AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int base = scan.nextInt();

		int product = multiply(n1, n2, base);
		System.out.println(product);

		scan.close();
	}

	private static int multiply(int n1, int n2, int base) {
		int product = 0;
		int pow = 1;

		while (n2 != 0) {

			int rem = n2 % 10;
			n2 /= 10;

			int digitMultiply = product(n1, rem, base);
			
			product = add(product, digitMultiply * pow, base);
			pow *= 10;

		}

		return product;
	}

	private static int product(int n1, int n, int base) {
		int product = 0;
		int pow = 1;
		int carry = 0;

		while (n1 != 0 || carry != 0) {

			int rem = n1 % 10;
			n1 /= 10;

			int res = rem * n + carry;

			product += (res % base) * pow;
			pow *= 10;
			carry = res / base;
		}

		return product;
	}
	
	private static int add(int n1, int n2, int base) {
		int sum  = 0;
		int carry = 0;
		int pow = 1;
		
		while(n1 != 0 || n2 != 0 || carry != 0) {
			
			int rem1 = n1 % 10;
			int rem2 = n2 % 10;
			
			n1 /= 10;
			n2 /= 10;
			
			int res = rem1 + rem2 + carry;
			
			sum += (res % base) * pow;
			pow *= 10;
			carry = res / base;
		}
		
		return sum;
	}
}
