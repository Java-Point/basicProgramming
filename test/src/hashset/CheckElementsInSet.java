package hashset;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CheckElementsInSet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("F");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an element to check: ");
		String str = sc.next();
		if (set.contains(str)) {
			System.out.println("Element exists in set.");
		} else
			System.out.println("Element doesn't exist in set.");
	}
}
