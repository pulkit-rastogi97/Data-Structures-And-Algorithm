import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) {
		String str = Helper.inputString();
		ArrayList<String> subsequences = getSS(str);
		System.out.println(subsequences);
	}

	private static ArrayList<String> getSS(String str) {
		if(str.length() == 0){
			ArrayList<String> bres = new ArrayList<>();
			bres.add(str);
			return bres;
		}
		
		char ch = str.charAt(0);
		ArrayList<String> rres = getSS(str.substring(1));
		ArrayList<String> myRes = new ArrayList<>();
		//no call (excluding ch)
		for(String s : rres) {
			myRes.add(s);
		}
		
		//yes call (including ch)
		for(String s : rres) {
			myRes.add(ch + s);
		}
		
		return myRes;
	}

}
