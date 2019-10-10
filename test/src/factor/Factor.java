package factor;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			System.out.println("Enter a no to see find the factor: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int num = 1;
			for (int i = 1; i <= a; i++) {
				num = num * i;
			}
			System.out.println("The factorial value is: " + num);
		}
	}
}