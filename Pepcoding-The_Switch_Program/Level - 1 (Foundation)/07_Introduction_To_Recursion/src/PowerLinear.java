import java.util.Scanner;

public class PowerLinear {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        System.out.print(power(x, n));
    }

    private static int power(int x, int n){
    	if(n == 0)
    		return 1;
    	
        return x * power(x, n - 1);
    }
}
