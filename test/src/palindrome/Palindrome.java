package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("\t" + "For String");
		String name = "Rakesh";
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb = sb.reverse();
		if (sb.toString().equals(name)) {
			System.out.println(name + " is palindrome");
		} else
			System.out.println(name + " isn't palindrome");

		System.out.println("\t" + "For Integer");
		int x = 121;
		int z = x; // as x value will change in while loop so z will be compared with r.
		int m, n = 0;
		while (x > 0) {
			m = x % 10; // 1..2..1
			x = x / 10; // 12..1..0
			n = n * 10 + m; // 1..12..121
		}
		if (n == z) {
			System.out.println(z + " is palindrome");
		} else
			System.out.println(z + " isn't palindrome");

	}
}