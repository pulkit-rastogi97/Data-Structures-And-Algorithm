
public class StringCharacterDifference {

	public static void main(String[] args) {
		String str = "pEpCoding";
		System.out.println(characterDifference(str));

	}

	private static String characterDifference(String str) {
		if(str == null || str.length() == 0)
			return "";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		int i = 1;
		int n = str.length();
		while(i < n) {
			int diff = str.charAt(i) - sb.charAt(sb.length() - 1);
			sb.append(diff);
			sb.append(str.charAt(i));
			i++;
		}
		return sb.toString();
	}

}
