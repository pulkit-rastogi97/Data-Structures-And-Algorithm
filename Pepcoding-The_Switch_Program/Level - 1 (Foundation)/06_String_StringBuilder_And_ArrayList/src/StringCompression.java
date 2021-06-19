
public class StringCompression {

	
	//remove all duplicate occurrences of every character, so that every character appears only once in compressed string 
	//original string  : aaabbcccdeeeffgghii
	//compressed string: abcdefghi
	private static String compression1(String str) {
		if(str == null || str.length() == 0)
			return "";   //empty string
		
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		int i = 1;  //because we already appended first character (0th index)
		int n = str.length();
		while(i < n) {
			
			//if duplicate occurrence occurred
			while (i < n && str.charAt(i) == sb.charAt(sb.length() - 1)) {
				i++;  //continue
			}
			
			//if unique character occurred
			if(i < n) {
				sb.append(str.charAt(i));
				i++;
			}
		}
		
		return sb.toString();
	}
	
	
	//remove all duplicate occurrences of every character, also append no. of times it occurred, if it occurred more than 1 time.
	//original string  : aaabbcccdeeeffgghii
	//compressed string: a4b2c3de3f2g2hi2
	private static String compression2(String str) {
		if (str == null || str.length() == 0)
			return ""; // empty string

		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));

		int i = 1; // because we already appended first character (0th index)
		int n = str.length();
		while (i < n) {
			
			//for every unique character
			int count = 1;
			
			// if duplicate occurrence occurred
			while (i < n && str.charAt(i) == sb.charAt(sb.length() - 1)) {
				i++; // continue
				count++;
			}

			//if it occurred more than once
			if(count > 1)
				sb.append(count);
			
			// if unique character occurred
			if (i < n) {
				sb.append(str.charAt(i));
				i++;
			}
		}

		return sb.toString();
	}
	
	
	// How many unique character appears, if all its occurrences appears together
	// original string : aaabbcccdeeeffgghii
	// count           : 9
	private static int compression3(String str) {
		if (str == null || str.length() == 0)
			return 0; 

		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		int i = 1; // because we already appended first character (0th index)
		int n = str.length();
		int switchCount = 0;
		while (i < n) {

			// if duplicate occurrence occurred
			while (i < n && str.charAt(i) == sb.charAt(sb.length() - 1)) {
				i++; // continue
			}

			// if unique character occurred
			if (i < n) {
				sb.append(str.charAt(i));
				i++;
			}
			
			switchCount++;
		}

		return switchCount;
	}
	
	public static void main(String[] args) {
		String str = "aaabbcccdeeeffgghii";
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		System.out.println(compression3(str));
	}

}
