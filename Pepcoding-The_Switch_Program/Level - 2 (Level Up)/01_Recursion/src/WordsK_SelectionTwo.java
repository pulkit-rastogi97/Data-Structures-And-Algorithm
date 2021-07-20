import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class WordsK_SelectionTwo {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int k = Integer.parseInt(br.readLine());

		HashSet<Character> unique = new HashSet<>();
		String ustr = "";
		for (char ch : str.toCharArray()) {
			if (unique.add(ch) == true) {
				ustr += ch;
			}
		}
		
		combination(ustr, 0, k, "", -1);
	}

	private static void combination(String ustr, int ssf, int ts, String asf, int lastCharacter) {
		if(ssf == ts) {
			System.out.println(asf);
			return;
		}
		
		for(int i = lastCharacter + 1; i < ustr.length(); i++) {
			char ch = ustr.charAt(i);
			combination(ustr, ssf + 1, ts, asf + ch, i);
		}
		
	}
}
