import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

	static Scanner scan = new Scanner(System.in);
	
	public static String inputString() {
		return scan.next();
	}
	
	public static void display(ArrayList<Object> arr) {
		System.out.println(arr);
	}
}
