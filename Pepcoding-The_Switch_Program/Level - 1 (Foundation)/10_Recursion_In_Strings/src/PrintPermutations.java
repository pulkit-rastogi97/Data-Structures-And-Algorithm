public class PrintPermutations {
	
	public static void main(String[] args) {
		String str = Helper.inputString();
		printPermutations(str, "");
	}

	private static void printPermutations(String str, String answerSoFar) {
		if(str.length() == 0) {
			System.out.println(answerSoFar);
			return;
		}
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String restOfQuestion = str.substring(0, i) + str.substring(i + 1);
			printPermutations(restOfQuestion, answerSoFar + ch);
		}
	}
}
