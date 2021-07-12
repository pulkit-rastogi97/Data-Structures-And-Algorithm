
public class TargetSumSubset {
	public static void main(String[] args) {
		int n = Helper.inputInt();
		int[] arr = Helper.inputArr(n);
		int tar = Helper.inputInt();
		
		printTargetSumSubsets(arr, 0, "", 0, tar);
	}
	
	private static void printTargetSumSubsets(int[] arr, int indx, String asf, int ssf, int tar) {
        if(indx == arr.length) {
        	if(ssf == tar) {
        		System.out.println(asf + ".");
        	}
        	return;
        }
		
		//YES call
		if(ssf + arr[indx] <= tar) {
			printTargetSumSubsets(arr, indx + 1, asf + arr[indx] + ", ", ssf + arr[indx], tar);
		}
		
		//NO call
		printTargetSumSubsets(arr, indx + 1, asf, ssf, tar);
    }
}
