import java.util.ArrayList;

public class GetStairPath {

	public static void main(String[] args) throws Exception {
		int n = Helper.inputInt();
		System.out.println(getStairPathsOptimized(n));
	}

	private static ArrayList<String> getStairPaths(int n) {
		if(n == 0) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add("");
			return arr;
		}
		
		ArrayList<String> myRes = new ArrayList<String>();
		
		if(n - 1>= 0) {
			ArrayList<String> rres = getStairPaths(n - 1);
			for(String s : rres) {
				myRes.add("1" + s);
			}
		}
			
		if(n - 2 >= 0) {
			ArrayList<String> rres = getStairPaths(n - 2);
			for(String s : rres) {
				myRes.add("2" + s);
			}
		}
			
		if(n - 3 >= 0) {
			ArrayList<String> rres = getStairPaths(n - 3);
			for(String s : rres) {
				myRes.add("3" + s);
			}
		}
		
        return myRes;
    }
	
	//No. of lines optimized
	private static ArrayList<String> getStairPathsOptimized(int n) {
		if(n == 0) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add("");
			return arr;
		}
		
		ArrayList<String> myRes = new ArrayList<String>();
		ArrayList<String> rres = null;
		for(int i = 1; n - i >= 0 && i <= 3; i ++) {
			rres = getStairPaths(n - i);
			for(String s : rres) {
				myRes.add(i + s);
			}
		}
        return myRes;
	}

}
