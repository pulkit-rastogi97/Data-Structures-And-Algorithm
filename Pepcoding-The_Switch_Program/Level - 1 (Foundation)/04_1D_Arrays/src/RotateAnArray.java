
public class RotateAnArray {
	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();
		int k = InputUtils.takeIntInput();
		
		printKRotatedArray(arr, k);
	}

	private static void printKRotatedArray(int[] arr, int k) {
		if(arr == null || k == 0)
			return;
		
		k = k % arr.length;
		
		if(k < 0) {
			k += arr.length;
		}
		
		for(int i = 0; i < arr.length; i++) {
			int value = arr[(arr.length - k + i) % arr.length];
			System.out.print(value + " ");
		}
		
	}
}
