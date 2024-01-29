public class SpanOfAnArray {

	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();

		int span = findSpan(arr);
		System.out.println(span);
	}

	// calculate the diff b/w minimum and maximum number of an array
	private static int findSpan(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

			if (max < arr[i]) {
				max = arr[i];
			}
		}

		int span = max - min;
		return span;
	}
}
