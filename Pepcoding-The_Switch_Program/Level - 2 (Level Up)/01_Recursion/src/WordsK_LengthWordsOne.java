import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class WordsK_LengthWordsOne {

	public static void main(String[] args) throws Exception {
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
		Character[] slots = new Character[k];
		permutation(0, ustr, 0, slots);

	}

	private static void permutation(int i, String ustr, int ssf, Character[] slots) {
		   if(i == ustr.length()) {
	            // print
	            if(ssf == slots.length) {
	                for(char c : slots) {
	                    System.out.print(c);
	                }
	                System.out.println();
	            }
	            return;
	        }
		   
		   
		//yes call
		for(int v = 0; v < slots.length; v++) {
			if(slots[v] == null) {
				slots[v] = ustr.charAt(i);
				permutation(i + 1, ustr, ssf + 1 ,slots);
				slots[v] = null;
			}
		}
		
		//no call
		permutation(i + 1, ustr, ssf, slots);
		
	}

}
