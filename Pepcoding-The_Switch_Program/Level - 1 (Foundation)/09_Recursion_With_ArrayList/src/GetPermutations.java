import java.util.ArrayList;

public class GetPermutations {
	public static void main(String[] args) {
		String str = Helper.inputString();
		ArrayList<String> permutations = getPermutations(str);
		System.out.println(permutations);
	}

	private static ArrayList<String> getPermutations(String str) {
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add(str);
			return baseResult;
		}
		
		ArrayList<String> myRes = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String restOfQuestion = str.substring(0, i) + str.substring(i + 1);
			ArrayList<String> rres = getPermutations(restOfQuestion);
			for(String s : rres) {
				myRes.add(ch + s);
			}
		}
		return myRes;
	}

}
