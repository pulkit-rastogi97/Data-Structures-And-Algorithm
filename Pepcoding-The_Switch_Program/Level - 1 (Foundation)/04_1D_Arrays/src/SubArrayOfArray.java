
public class SubArrayOfArray {

	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();
		
		printAllSubArrays(arr);
	}

	private static void printAllSubArrays(int[] arr) {
		for(int startPoint = 0; startPoint < arr.length; startPoint++) {
			for(int endPoint = startPoint; endPoint < arr.length; endPoint++) {
				OutputUtils.printArray(startPoint, endPoint, arr);
				System.out.println();
			}
		}
	}
}
