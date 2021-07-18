import java.io.*;
import java.util.*;

public class PermutationWordsOne {

	public static void generateWords(int cb, int tb, HashMap<Character, Integer> fmap, String asf) {
		if (cb == tb + 1) {
			System.out.println(asf);
		}
		for (char ch : fmap.keySet()) {
			if (fmap.get(ch) > 0) {
				int oldFreq = fmap.get(ch);
				fmap.put(ch, oldFreq - 1);
				generateWords(cb + 1, tb, fmap, asf + ch);
				fmap.put(ch, oldFreq);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		HashMap<Character, Integer> fmap = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (fmap.containsKey(ch)) {
				fmap.put(ch, fmap.get(ch) + 1);
			} else {
				fmap.put(ch, 1);
			}
		}

		generateWords(1, str.length(), fmap, "");
	}

}