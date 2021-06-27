import java.util.Scanner;

public class Helper {

	static Scanner scan = new Scanner(System.in);

	public static int inputInt() {
		return scan.nextInt();
	}
	
	public static int[] inputArr(int n) {
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	public static int[][] inputArr(int n, int m){
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++)
				arr[i][j] = scan.nextInt();
		}
		return arr;
	}
}
