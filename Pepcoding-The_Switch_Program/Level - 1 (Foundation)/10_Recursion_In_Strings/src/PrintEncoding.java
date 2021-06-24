
public class PrintEncoding {

	public static void main(String[] args) {
		String str = Helper.inputString();
		printEncoding(str, "");
	}

	private static void printEncoding(String str, String answerSoFar) {
		if(str.length() == 0) {
			System.out.println(answerSoFar);
			return;
		}
		
		int n1 = str.charAt(0) - '0';   //first character as int
		if(n1 == 0)
			return;	  //constraint
		
		char ch1 = (char)(n1 + 'a' - 1);  //to get alphabet corresponding to integer
		String restOfQuestion1 = str.substring(1);
		//call considering 1st character
		printEncoding(restOfQuestion1, answerSoFar + ch1);
		
		if(str.length() > 1) {
			int n2 = str.charAt(1) - '0';   //second character as int
			int num = n1 * 10 + n2;
			
			//there should be an alphabet corresponding to number
			if(num <= 26) {
				char ch2 = (char) (num + 'a' - 1);
				String restOfQuestion2 = str.substring(2);
				printEncoding(restOfQuestion2, answerSoFar + ch2);
			}
		}
	}
		
}


