
public class InverseOfAnArray {

	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();
		
		int[] invOfArray = inverseArray(arr);
		OutputUtils.printArray(invOfArray);
	}

	private static int[] inverseArray(int[] arr) {
		int[] inverseArray = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			inverseArray[arr[i]] = i;
		}
		return inverseArray;
	}
}
