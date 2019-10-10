package even.number;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a no.: " + "\t");
			int x = sc.nextInt();
			if (!((x % 2) == 0)) {
				System.out.println("The no is not even");
			} else
				System.out.println("The no is even");
		}
		
		//OR
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
		System.out.println("All values: " + listOfIntegers);
		Integer max = listOfIntegers.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
		System.out.println("MAX: " + max);
	}
}
