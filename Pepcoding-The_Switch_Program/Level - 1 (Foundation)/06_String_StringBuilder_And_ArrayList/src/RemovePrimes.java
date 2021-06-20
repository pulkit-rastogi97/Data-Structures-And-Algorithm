import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		removePrimes(al);
		System.out.println(al);
		scn.close();
	}

	private static void removePrimes(ArrayList<Integer> al) {
		for(int i = al.size() - 1; i >= 0; i--) {
			if(isPrime(al.get(i))) {
				al.remove(i);
			}
		}
	}
	
	private static boolean isPrime(Integer n) {
		boolean isPrime = true;
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
