
public class PrintIncreasing {

	public static void main(String[] args) {
		int n = 9;
		printIncreasing(n);
	}

	private static void printIncreasing(int n) {
		if(n == 0)
			return;
		
		//print till 1 to n - 1.
		printIncreasing(n - 1);
		
		//I will print myself
		System.out.println(n);
		
	}

}
