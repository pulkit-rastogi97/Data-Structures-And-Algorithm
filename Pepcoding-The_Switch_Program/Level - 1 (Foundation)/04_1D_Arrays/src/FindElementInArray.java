
public class FindElementInArray {

	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();
		int number = InputUtils.takeIntInput();
		
		int index = findNumberInArray(arr, number);
		System.out.println(index);
	}

	private static int findNumberInArray(int[] arr, int number) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == number) {
				index = i;
				break;
			}
		}
		return index;
	}
}
