import java.util.Scanner;

/**
 * 
 * @author pulkit-rastogi97
 *
 */
public class InputUtils {

	private static Scanner scan = new Scanner(System.in);
	
	public static int[] takeArrayInput() {
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	public static int takeIntInput() {
		return scan.nextInt();
	}
}
