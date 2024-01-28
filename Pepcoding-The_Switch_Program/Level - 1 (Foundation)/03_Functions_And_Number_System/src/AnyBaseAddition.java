import java.util.Scanner;

/**
 * 
 * @author pulkit-rastogi97
 *
 */
public class AnyBaseAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int base = scan.nextInt();

		int sum = add(n1, n2, base);
		System.out.println(sum);
		scan.close();
	}
	
	private static int add(int n1, int n2, int base) {
		int sum = 0;
		int carry = 0;
		int pow = 1;
		
		while(n1 != 0 || n2 != 0 || carry != 0) {
			int rem1 = n1 % 10;
			n1 /= 10;
			int rem2 = n2 % 10;
			n2 /= 10;
			
			
			int res = rem1 + rem2 + carry;
			
			sum += (res % base) * pow;
			pow *= 10;
			
			carry = res / base;
		}
		
		return sum;
	}
}
