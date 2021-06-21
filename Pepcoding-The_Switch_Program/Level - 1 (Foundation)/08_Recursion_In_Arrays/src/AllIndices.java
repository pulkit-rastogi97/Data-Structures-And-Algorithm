
public class AllIndices {
	public static void main(String[] args) {
        int[] arr = ArrayHelper.InputArray();
        int x = ArrayHelper.InputInt();
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
	}
	
	
	private static int[] allIndices(int[] arr, int x, int idx, int fsf) {
		if(idx == arr.length) {
			return new int[fsf];
		}
		
		if(arr[idx] == x)
			fsf++;
		
		int[] ans = allIndices(arr, x, idx + 1, fsf);
		
		if(arr[idx] == x) {
			ans[fsf - 1] = idx;
		}
		
		return ans;
	}

}
