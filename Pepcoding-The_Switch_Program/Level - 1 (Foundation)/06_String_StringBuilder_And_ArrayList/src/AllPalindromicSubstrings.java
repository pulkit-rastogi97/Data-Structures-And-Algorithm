import java.util.Scanner;

public class AllPalindromicSubstrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		printAllPalindromicSubstrings(str);
	}

	private static void printAllPalindromicSubstrings(String str) {
		if(str == null || str.length() == 0)
			return;
		int n = str.length();
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(isPalindrome(str.substring(i, j + 1))) {
					System.out.println(str.substring(i, j + 1));
				}
			}
		}
		
	}
	
	private static boolean isPalindrome(String str) {
		int i = 0; 
		int j = str.length() - 1;
		boolean isPalindrome = true;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}
		return isPalindrome;
	}

}
