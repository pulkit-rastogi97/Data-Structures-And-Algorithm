
public class FirstIndex {

	public static void main(String[] args) {
		int[] arr = ArrayHelper.InputArray();
		int x = ArrayHelper.InputInt();
		
		int idx = findFirstIndex(arr, 0, x);
		System.out.println(idx);
	}
	
	private static int findFirstIndex(int[] arr, int idx, int x) {
		if(idx == arr.length)
			return -1;
		
		if(arr[idx] == x)
			return idx;
		return findFirstIndex(arr, idx + 1, x);
	}
}
