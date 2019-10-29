package test;

import java.util.Scanner;

public class FibonaciiEasyWay {

	public static void main(String[] args) { 
		int a = 0, b = 1, c = 0, limit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no: ");
		limit = sc.nextInt();
		System.out.print("The values are: ");
		while (limit > 0) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;
			limit--;
		}
	}
}
