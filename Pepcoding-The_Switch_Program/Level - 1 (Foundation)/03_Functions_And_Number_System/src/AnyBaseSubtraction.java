import java.util.Scanner;

/**
 * 
 * n2 >= n1
 * 
 * @author pulkit-rastogi97
 *
 */
public class AnyBaseSubtraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int base = scan.nextInt();

		int difference = subtract(n2, n1, base);
		System.out.println(difference);

		scan.close();
	}

	private static int subtract(int n2, int n1, int base) {
		int difference = 0;
		int borrow = 0;
		int pow = 1;

		while (n1 != 0 || n2 != 0 || borrow != 0) {

			int rem1 = n1 % 10;
			n1 /= 10;
			int rem2 = n2 % 10;
			n2 /= 10;

			int res = rem1 - rem2 - borrow;
			if (res < 0) {
				res += base;
				borrow = 1;
			} else {
				borrow = 0;
			}

			difference += res * pow;
			pow *= 10;

		}

		return difference;
	}
}
