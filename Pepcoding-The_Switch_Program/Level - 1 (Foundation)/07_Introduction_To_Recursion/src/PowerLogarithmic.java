import java.util.Scanner;

public class PowerLogarithmic {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        System.out.println("=============================================");
        long startTime = System.currentTimeMillis();
        System.out.println("Recursive Power: " + recursivePower(x, n));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken : " + (endTime - startTime));
        System.out.println("=============================================");
        startTime = System.currentTimeMillis();
        System.out.println("Iterative Power: " + iterativePower(x, n));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken : " + (endTime - startTime));
        System.out.println("=============================================");
        startTime = System.currentTimeMillis();
        System.out.println("Iterative Using Binary Operators Power: " + iterativePowerUsingBinary(x, n));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken : " + (endTime - startTime));
        System.out.println("=============================================");

    }

	private static int recursivePower(int x, int n) {
		if(n == 0)
			return 1;
		
		int halfPower = recursivePower(x, n / 2);
		int powerResult = halfPower * halfPower;
		return n % 2 == 0 ? powerResult : powerResult * x;
	}
	
	
	private static int iterativePower(int x, int n) {
		int pow = 1;
		for(int i = n; i > 0; i = i / 2) {
			if(i % 2 != 0)
				pow *= x;
			x = x * x;
		}
		return pow;
	}
	
	private static int iterativePowerUsingBinary(int x, int n) {
		int pow = 1;
		for(int i = n; i > 0; i = i >> 1) {
			if((i & 1) == 1)
				pow *= x;
			x = x * x;
		}
		return pow;
	}
}
