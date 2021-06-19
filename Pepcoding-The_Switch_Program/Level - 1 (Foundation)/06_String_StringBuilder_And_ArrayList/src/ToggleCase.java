
public class ToggleCase {

	private static String toogleCase(String str) {
		if (str == null || str.length() == 0)
			return "";

		StringBuilder toggledString = new StringBuilder();

		int i = 0;
		int n = str.length();

		while (i < n) {
			char ch = str.charAt(i);
			// if it is UPPERCASE
			if (ch >= 'A' && ch <= 'Z') {
				toggledString.append((char)(ch - 'A' + 'a'));
			} else {
				toggledString.append((char)(ch - 'a' + 'A'));
			}

			i++;
		}
		return toggledString.toString();
	}
	
	public static void main(String[] args) {
		String str = "pepCODinG";
		System.out.println(toogleCase(str));

	}

}
