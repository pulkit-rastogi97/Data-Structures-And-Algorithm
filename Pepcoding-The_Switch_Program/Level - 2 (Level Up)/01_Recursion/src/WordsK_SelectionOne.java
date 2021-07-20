import java.util.HashSet;
import java.util.Scanner;

public class WordsK_SelectionOne {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int k = scn.nextInt();
		scn.close();
		HashSet<Character> unique = new HashSet<>();
		String ustr = "";
		for (char ch : str.toCharArray()) {
			if (unique.add(ch) == true) {
				ustr += ch;
			}
		}
		
		combination(0, ustr, 0, k, "");
	}

	public static void combination(int i, String ustr, int ssf, int ts, String asf) {
		if(i == ustr.length()) {
			if(ssf == ts)
				System.out.println(asf);
			return;
		}
		
		//yes call
		if(ssf < ts)
			combination(i + 1, ustr, ssf + 1, ts, asf + ustr.charAt(i));
		
		//no call
		combination(i + 1, ustr, ssf, ts, asf);
	}
}
