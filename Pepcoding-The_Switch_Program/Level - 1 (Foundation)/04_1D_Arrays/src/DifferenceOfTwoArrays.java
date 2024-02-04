
/**
 * 
 * @author pulkit-rastogi97
 *
 */
public class DifferenceOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = InputUtils.takeArrayInput();
		int[] arr2 = InputUtils.takeArrayInput();

		int[] difference = calculateDifference(arr1, arr2);
		OutputUtils.printArray(difference);
	}

	/**
	 * As per questions criteria, arr2 is always greater than or equal to arr1.
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	private static int[] calculateDifference(int[] arr1, int[] arr2) {
		int[] diff = new int[arr2.length];

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = diff.length - 1;
		int borrow = 0;

		while (k >= 0) {

			int num1 = i >= 0 ? arr1[i] : 0;
			int num2 = j >= 0 ? arr2[j] : 0;

			int res = num2 - num1 - borrow;

			if (res < 0) {
				res += 10; // as decimal number base is 10.
				borrow = 1;
			} else {
				borrow = 0;
			}

			diff[k] = res % 10;
			
			i--;
			j--;
			k--;
		}
		
		return diff;
	}
}
