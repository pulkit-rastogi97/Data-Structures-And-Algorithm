import java.util.Scanner;

/**
 *
 *Question: Find the frequency of a digit in a number.
 *
 * @author pulkit-rastogi97
 *
 */
public class DigitAndFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();

		int freq = getFrequency(n, d);

		System.out.println(freq);

		scan.close();
	}

	private static int getFrequency(int n, int d) {
		int freq = 0;
		
		while(n != 0) {
			int rem = n % 10;
			n = n / 10;
			
			if(rem == d) {
				freq++;
			}
		}
		
		return freq;
	}
}
