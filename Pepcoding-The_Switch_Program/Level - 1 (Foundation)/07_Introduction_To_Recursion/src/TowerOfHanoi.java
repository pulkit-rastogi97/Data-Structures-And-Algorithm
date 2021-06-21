import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		//no. of disks
		int n = scan.nextInt();
		int src = scan.nextInt();
		int dst = scan.nextInt();
		int helper = scan.nextInt();
		toh(n, src, dst, helper);
		scan.close();
	}

	public static void toh(int n, int src, int dst, int helper) {
		if(n == 0)
			return;
		
		//expectation -> move (n-1) disks from src to helper.
		toh(n - 1, src, helper, dst);
		
		//Self work -> move nth disk from src to dst.
		System.out.println(n + "[" + src + " -> " + dst + "]");
		
		//faith
		toh(n - 1, helper, dst, src);
	}
}
