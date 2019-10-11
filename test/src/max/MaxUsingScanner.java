package rough;

import java.util.Arrays;
import java.util.Scanner;

public class MaxUsingScanner {
	public static void main(String[] args) {
		int max1 = 0, max2 = 0, max3 = 0;
		System.out.println("Enter values: ");
		Scanner sc = new Scanner(System.in);
		int[] x = new int[5];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		for (int j = 0; j < x.length; j++) {
			if (x[j] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = x[j];
			}
		}
		System.out.println("1st Max: " + max1);
		System.out.println("2nd Max: " + max2);
		System.out.println("3rd Max: " + max3);
	}
}