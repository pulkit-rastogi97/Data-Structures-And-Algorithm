
public class PrintIncreasingDecreasing {

	public static void main(String[] args) {
		int n = 9;
		printDecreasingIncreasing(n);

	}

	private static void printDecreasingIncreasing(int n) {
		
		if(n == 0)
			return;
		
		System.out.println(n);
		printDecreasingIncreasing(n - 1);
		System.out.println(n);
		
	}

}
