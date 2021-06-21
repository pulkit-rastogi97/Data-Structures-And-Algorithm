public class DisplayArrayInReverse {
	
	public static void main(String[] args) {
		int[] arr = ArrayHelper.InputArray();
		displayArrInReverse(arr, 0);
	}

	private static void displayArrInReverse(int[] arr, int idx) {
		if(arr == null || arr.length == 0 || idx < 0 || idx == arr.length)
			return;
		
		displayArrInReverse(arr, idx + 1);
		System.out.println(arr[idx]);
		
	}

}
