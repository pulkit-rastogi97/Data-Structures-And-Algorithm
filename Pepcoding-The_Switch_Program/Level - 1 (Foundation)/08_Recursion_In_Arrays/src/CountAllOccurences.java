
public class CountAllOccurences {

	public static void main(String[] args) {
        int[] arr = ArrayHelper.InputArray();
        int x = ArrayHelper.InputInt();
        
        int count = countAllOccurrences(arr, 0, x);
        System.out.println(count);
	}
	
	private static int countAllOccurrences(int[] arr, int idx, int data) {
		if(idx == arr.length)
			return 0;
		
		int count = countAllOccurrences(arr, idx + 1, data);
		if(arr[idx] == data)
			count++;
		return count;
	}
}
