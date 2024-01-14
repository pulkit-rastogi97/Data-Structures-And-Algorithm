import java.util.Scanner;

public class InverseANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int result = 0;
		int index = 1;
		while(n != 0) {
			int r = n % 10;
			n /= 10;
			
			int number = (int)Math.pow(10, r - 1) * index;
			
			result += number;
			index++;
		}
		
		System.out.println(result);
		
		scan.close();
	}
}
