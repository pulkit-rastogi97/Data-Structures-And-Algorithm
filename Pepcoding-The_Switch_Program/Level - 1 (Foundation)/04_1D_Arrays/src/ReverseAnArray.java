
public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();
		
		reverseArray(arr);
		OutputUtils.printArray(arr);
	}

	private static void reverseArray(int[] arr) {
		if(arr == null || arr.length == 1)
			return;
		
		int left = 0;
		int right = arr.length - 1;
		
		/**
		 * 1. Won't have any impact if we run for left == right, as same index gets swapped.
		 * 2. If right > left, then actual array values will be there, reverse will be overidden.
		 */
		while(left < right) {
			swap(arr, left, right);
			left++;
			right--;
		}
		
	}
	
	private static void swap(int[] arr, int left, int right) {
		if(arr == null || arr.length < 2)
			return;
		
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
	}
}
