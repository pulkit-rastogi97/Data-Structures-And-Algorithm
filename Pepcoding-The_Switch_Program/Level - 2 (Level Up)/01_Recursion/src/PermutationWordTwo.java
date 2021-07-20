import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PermutationWordTwo {
	public static void generateWords(int cc, String str, Character[] spots, HashMap<Character, Integer> lastOccurence) {
		if(cc == str.length()) {
			for(int i = 0; i < spots.length; i++) {
				System.out.print(spots[i]);
			}
			System.out.println();
			return;
		}
		
		//Get which level is it of character
		char ch = str.charAt(cc);
		
		//on which index, character was put last time
		int lastSpotIndex = lastOccurence.get(ch);
		
		for(int spot = lastSpotIndex + 1; spot < spots.length; spot++) {
			if(spots[spot] == null) {
				
				//place
				spots[spot] = ch;
				lastOccurence.put(ch, spot);
				
				generateWords(cc + 1, str, spots, lastOccurence);
				
				//unplace
				spots[spot] = null;
				lastOccurence.put(ch, lastSpotIndex);
			}
		}
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		Character[] spots = new Character[str.length()];
		HashMap<Character, Integer> lastOccurence = new HashMap<>();
		for (char ch : str.toCharArray()) {
			lastOccurence.put(ch, -1);
		}

		generateWords(0, str, spots, lastOccurence);
	}
}
