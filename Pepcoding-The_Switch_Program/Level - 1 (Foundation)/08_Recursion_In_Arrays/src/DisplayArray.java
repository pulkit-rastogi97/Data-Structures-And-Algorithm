
public class DisplayArray {
	
	public static void main(String[] args) throws Exception {
       int[] arr = ArrayHelper.InputArray();
       displayArr(arr, 0);
    }

    private static void displayArr(int[] arr, int idx){
        if(arr == null || arr.length == 0 || idx < 0 || idx == arr.length)
        	return;
    	System.out.println(arr[idx]);
    	displayArr(arr, idx + 1);
    }

}
