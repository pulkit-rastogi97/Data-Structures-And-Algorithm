
public class LastIndex {

	public static void main(String[] args) {
		int[] arr = ArrayHelper.InputArray();
		int x = ArrayHelper.InputInt();
		
		int idx = findLastIndex(arr, 0, x);
		System.out.println(idx);
	}
	
	private static int findLastIndex(int[] arr, int idx, int x) {
		if(idx == arr.length)
			return -1;

		int foundAt = findLastIndex(arr, idx + 1, x);
		if(foundAt == -1)
			if(arr[idx] == x)
				foundAt = idx;
		
		return foundAt;
		
	}
}
