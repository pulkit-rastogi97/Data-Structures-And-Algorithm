import java.util.Scanner;

public class RotateANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int nod = 0;
		int tempN = n;
		while(tempN != 0) {
			tempN /= 10;
			nod++;
		}
		
		k = k % nod; // for k exceeding nod.
		
		if(k < 0) {
			k = k + nod; // for -ve number based rotation
		}
		
		int div = (int) Math.pow(10, k);
		
		int q = n / div; //first part of answer to be
		int r = n % div; //second part of answer
				
		int answer = q + (r * (int) Math.pow(10, nod - k));
		
		System.out.println(answer);
		
		scan.close();
	}
}
