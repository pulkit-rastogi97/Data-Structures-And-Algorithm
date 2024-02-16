
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();
		int data = InputUtils.takeIntInput();

		int index = binarySearch(arr, data);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int data) {
		if (arr == null)
			return -1;

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] < data) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return -1;
	}
}
