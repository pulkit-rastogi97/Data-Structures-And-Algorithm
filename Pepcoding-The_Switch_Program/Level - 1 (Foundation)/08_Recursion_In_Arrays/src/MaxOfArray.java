
public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = ArrayHelper.InputArray();
		int max = findMax(arr, 0);
		System.out.println(max);
	}
	
	private static int findMax(int[] arr, int idx) {
		if(idx == arr.length)
			return Integer.MIN_VALUE;
		
		int max = findMax(arr, idx + 1);
		if(max < arr[idx])
			max = arr[idx];
		return max;
	}
}
