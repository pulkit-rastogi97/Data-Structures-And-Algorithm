import java.util.Scanner;

public class BenjaminBulbs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i * i <= n; i++) {
			System.out.print(i * i + " ");
		}
		
		scan.close();
	}
}
