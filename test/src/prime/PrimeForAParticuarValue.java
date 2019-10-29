package test;

import java.util.Scanner;

public class PrimeForAParticuarValue {

	public static void main(String[] args) {
		int m, n;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no: ");
		n = sc.nextInt();
		for (int i = 2; i <= n / 2; i++) {
			m = n % i;
			if (m == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(n + " no is prime.");
		} else
			System.out.println(n + " no isn't prime.");
	}
}
