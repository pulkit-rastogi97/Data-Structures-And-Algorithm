import java.util.ArrayList;

public class Kpc {
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
	public static void main(String[] args) {
		String str = Helper.inputString();
		ArrayList<String> kpc = getKPC(str);
		System.out.println(kpc);
	}

	private static ArrayList<String> getKPC(String str) {
		if(str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(str);
			return bres;
		}
		
		int idx = str.charAt(0) - '0';
		String code = codes[idx];
		ArrayList<String> rres = getKPC(str.substring(1));
		ArrayList<String> myRes = new ArrayList<>();
		
		for(int i = 0; i < code.length(); i++) {
			char ch = code.charAt(i);
			for(String s : rres) {
				myRes.add(ch + s);
			}
		}
		
		return myRes;
		
	}

}
