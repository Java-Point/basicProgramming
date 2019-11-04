package prime;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Prime {

	public static void main(String[] args) {

		System.out.println("*****Java7*****");
		for (int i = 2; i < 100; i++) {

			boolean isPrime = true;

			for (int j = 3; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
				}
			}
			// print the number
			if (isPrime == true) {
				System.out.print(i + " ");
			}
		}
		
		//OR
		
		final IntPredicate isPrime = n -> {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};
		System.out.println("*****Java8*****");
		IntStream.range(1, 100).filter(isPrime).forEach(System.out::println);
	}
}
