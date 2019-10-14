package sqrt;

import java.util.Scanner;

public class Sqrt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int j = sc.nextInt();
		double i = Math.sqrt(j);
		System.out.println("Result: " + i);
	}
}
