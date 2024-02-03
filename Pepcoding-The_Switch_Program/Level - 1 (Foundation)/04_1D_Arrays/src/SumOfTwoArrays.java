
/**
 * 
 * @author pulkit-rastogi97
 *
 */
public class SumOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = InputUtils.takeArrayInput();
		int[] arr2 = InputUtils.takeArrayInput();

//		int[] sum = add(arr1, arr2);
		int[] sum = addBetterMathematicalApproach(arr1, arr2);
		OutputUtils.printArray(sum);
	}

	private static int[] add(int[] arr1, int[] arr2) {
		// create sum array with 1 extra size of max of both array, to handle 9999 +
		// 9999 case.
		int maxLength = arr1.length > arr2.length ? arr1.length : arr2.length;
		int[] sumArray = new int[maxLength + 1];

		int carry = 0;

		for (int i = maxLength - 1; i >= 0; i--) {
			int num1 = 0;
			int num2 = 0;
			if (i < arr1.length) {
				num1 = arr1[i];
			}

			if (i < arr2.length) {
				num2 = arr2[i];
			}

			int res = num1 + num2 + carry;

			int sum = res % 10;
			carry = res / 10;

			sumArray[i + 1] = sum;
		}

		sumArray[0] = carry;
		return sumArray;
	}

	private static int[] addBetterMathematicalApproach(int[] arr1, int[] arr2) {
		int maxLength = arr1.length > arr2.length ? arr1.length : arr2.length;
		// create sum array with 1 extra size of max of both array, to handle 9999 +
		// 9999 case when 1 carry is left at last.
		int[] sumArray = new int[maxLength + 1];

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = sumArray.length - 1;
		int carry = 0;

		while (k >= 0) {
			
			int num1 = i >= 0 ? arr1[i] : 0;
			int num2 = j >= 0 ? arr2[j] : 0;

			int res = num1 + num2 + carry;

			sumArray[k] = res % 10;
			carry = res / 10;

			i--;
			j--;
			k--;
		}

		//can contain trailing Zeros
		return sumArray;
	}
}
