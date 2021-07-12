
public class TargetSumSubset {

	public static void main(String[] args) {
		int n = Helper.inputInt();
		int[] arr = Helper.inputArr(n);
		int target = Helper.inputInt();
		
		boolean canMakeTarget = isTargetReachable(0, arr, target, 0);
		System.out.println(canMakeTarget);
	}

	private static boolean isTargetReachable(int i, int[] arr, int target, int sumSoFar) {
		if(i == arr.length - 1){
			if(target == sumSoFar)
				return true;
			return false;
		}
		
		boolean result = false;
		//yes call
		result = isTargetReachable(i + 1, arr, target, sumSoFar + arr[i]);
		
		if(result == true)
			return result;
		
		//no call
		result = isTargetReachable(i + 1, arr, target, sumSoFar);

		return result;
	}
}
