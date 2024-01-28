import java.util.Scanner;

/**
 * Question: Convert a number of any base to decimal number
 * 
 * @author Dell
 *
 */
public class ConvertAnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int base = scan.nextInt();

		int result = convertAnyBaseToDecimal(number, base);
		System.out.println(result);

		scan.close();
	}

	private static int convertAnyBaseToDecimal(int number, int base) {
		int result = 0;
		int pow = 1;  // base to the power 0 = 1

		while (number != 0) {
			int rem = number % 10; // get last digit
			number = number / 10;

			result += rem * pow;
			pow *= base;
		}

		return result;
	}

}
