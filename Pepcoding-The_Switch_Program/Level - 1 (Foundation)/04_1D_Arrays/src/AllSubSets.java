
public class AllSubSets {

	public static void main(String[] args) {
		int[] arr = InputUtils.takeArrayInput();

		printAllSubsets(arr);
	}

	private static void printAllSubsets(int[] arr) {
		int totalSubsets = (int) Math.pow(2, arr.length);

		for (int i = 0; i < totalSubsets; i++) {

			int binaryNumber = getBinaryNumber(i);

			int numberOfDigits = arr.length;
			int pow = (int) Math.pow(10, numberOfDigits - 1);

			for (int j = 0; j < arr.length; j++) {

				int q = binaryNumber / pow;
				int r = binaryNumber % pow;
				binaryNumber = r;
				pow /= 10;

				if (q == 0) {
					System.out.print("-\t");
				}else {
					System.out.print(arr[j] + "\t");
				}
			}

			System.out.println();
		}

	}

	private static int getBinaryNumber(int number) {
		int binaryNumber = 0;
		
		int pow = 1;   //10 to the power 0
		
		while(number != 0) {
			int rem = number % 2;
			number = number / 2;
			
			binaryNumber += rem * pow;
			pow *= 10;
		}
		
		return binaryNumber;
	}
}
