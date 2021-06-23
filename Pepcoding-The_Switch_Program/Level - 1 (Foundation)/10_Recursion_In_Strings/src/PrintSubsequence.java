
public class PrintSubsequence {
    public static void main(String[] args) throws Exception {
    	String str = Helper.inputString();
    	printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0) {
        	System.out.println(ans);
        	return;
        }
    	
    	//yes call
    	printSS(str.substring(1), ans + str.charAt(0));
    	
    	//no call
    	printSS(str.substring(1), ans);
    }

}
