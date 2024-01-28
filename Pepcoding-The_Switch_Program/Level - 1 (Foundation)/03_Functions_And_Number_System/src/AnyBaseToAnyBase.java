import java.util.Scanner;

/**
 * Question: Convert a number of any base to any other base number
 * 
 * @author pulkit-rastogi97
 *
 */
public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int currentNumberBase = scan.nextInt();
		int targetNumberBase = scan.nextInt();

		int result = convertAnyBaseToAnyBase(number, currentNumberBase, targetNumberBase);
		System.out.println(result);

		scan.close();
	}

	private static int convertAnyBaseToAnyBase(int number, int currentNumberBase, int targetNumberBase) {
		int numberInDecimal = convertAnyBaseToDecimal(number, currentNumberBase);
		int numberInTargetBase = convertDecimalToAnyBase(numberInDecimal, targetNumberBase);
		return numberInTargetBase;
	}

	private static int convertDecimalToAnyBase(int number, int base) {
		int result = 0;

		int pow = 1; // 10 to the power 0

		while (number != 0) {
			int rem = number % base;
			number = number / base;

			result += rem * pow;
			pow *= 10;
		}

		return result;
	}

	private static int convertAnyBaseToDecimal(int number, int base) {
		int result = 0;
		int pow = 1; // base to the power 0 = 1

		while (number != 0) {
			int rem = number % 10; // get last digit
			number = number / 10;

			result += rem * pow;
			pow *= base;
		}

		return result;
	}

}
