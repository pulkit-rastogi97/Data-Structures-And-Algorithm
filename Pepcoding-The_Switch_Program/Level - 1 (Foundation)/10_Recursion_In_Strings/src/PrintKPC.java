
public class PrintKPC {

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    public static void main(String[] args) throws Exception {
    	String str = Helper.inputString();
    	printKPC(str, "");
    }

    public static void printKPC(String str, String asf) {
        if(str.length() == 0) {
        	System.out.println(asf);
        	return;
        }
    	
    	int idx = str.charAt(0) - '0';
    	String code = codes[idx];
    	
    	for(int i = 0; i < code.length(); i++) {
    		char ch = code.charAt(i);
    		printKPC(str.substring(1), asf + ch);
    	}
    }
    
}
