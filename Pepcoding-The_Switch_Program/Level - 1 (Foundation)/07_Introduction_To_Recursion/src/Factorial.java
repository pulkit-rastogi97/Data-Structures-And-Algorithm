import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.print(factorial(n));
	}

	public static int factorial(int n) {
		if(n == 0)
			return 1;
		
		//faith work
		int smallerFactorial = factorial(n - 1);
		//my work
		int result = n * smallerFactorial;
		return result;
	}
}
