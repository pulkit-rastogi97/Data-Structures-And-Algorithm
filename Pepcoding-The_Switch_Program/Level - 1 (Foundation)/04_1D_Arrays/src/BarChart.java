
public class BarChart {

	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();
		//printInitialBarChart(arr);
		printActualBarChart(arr);
		
	}
	
//	private static void printInitialBarChart(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i]; j++) {
//				System.out.print("*\t");
//			}
//			System.out.println();
//		}
//	}
	
	private static void printActualBarChart(int[] arr) {
		int rows = getMaxValue(arr);
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i + arr[j] >= rows) {
					System.out.print("*\t");
				}else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
	
	private static int getMaxValue(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int x : arr) {
			if(max < x) {
				max = x;
			}
		}
		return max;
	}
}
