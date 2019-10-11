package rough;

import java.util.Scanner;

public class PrimeNoForAParticularValue {
	public static void main(String[] args) {
		System.out.println("Enter a no: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 2; i < x; i++) {
			boolean isPrime = true;
			if (x % i == 0) {
				isPrime = false;
				System.out.println(x + "is not prime");
				break;
			}
			if (isPrime == true) {
				System.out.println(x + "is a prime no");
				break;
			}
		}
	}
}