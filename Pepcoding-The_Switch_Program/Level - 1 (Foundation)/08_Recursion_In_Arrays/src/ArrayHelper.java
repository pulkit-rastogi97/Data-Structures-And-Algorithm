import java.util.Scanner;

public class ArrayHelper {

	static Scanner scan = new Scanner(System.in);

	public static int[] InputArray() {
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();
		return arr;
	}
	
	public static int InputInt() {
		return scan.nextInt();
	}
}
