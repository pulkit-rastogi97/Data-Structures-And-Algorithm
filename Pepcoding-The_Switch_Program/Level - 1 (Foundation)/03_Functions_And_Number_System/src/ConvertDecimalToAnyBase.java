import java.util.Scanner;

/**
 * Question: Convert a decimal number to the provided base number
 * 
 * @author Dell
 *
 */
public class ConvertDecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int base = scan.nextInt();

		int result = convertDecimalToAnyBase(number, base);
		System.out.println(result);

		scan.close();
	}

	private static int convertDecimalToAnyBase(int number, int base) {
		int result = 0;
		
		int pow = 1;   //10 to the power 0
		
		while(number != 0) {
			int rem = number % base;
			number = number / base;
			
			result += rem * pow;
			pow *= 10;
		}
		
		return result;
	}
}
