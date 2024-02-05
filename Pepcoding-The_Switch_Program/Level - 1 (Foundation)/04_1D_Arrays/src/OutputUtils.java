
/**
 * 
 * @author pulkit-rastogi97
 *
 */
public class OutputUtils {

	public static void printArray(int[] arr) {
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
	
	public static void printArray(int start, int end, int[] arr) {
		for(int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
