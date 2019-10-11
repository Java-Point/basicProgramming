package rough;

public class Palindrome {
	public static void main(String[] args) {

		System.out.println("\t" + "For String");
		String name = "abc";
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb = sb.reverse();

		if (sb.toString().equals(name)) {
			System.out.println(name + " is palindrome");
		} else {
			System.out.println("Not palindrome");
		}

		System.out.println("\t" + "For Integer");

		int x = 121;
		int z = x; // as x value will change in while loop so to compare with r.
		int m = 10, r = 0;
		while (x > 0) {
			m = x % 10;// 1..2..1
			x = x / 10;// 12..1..0
			r = r * 10 + m;// 1..12..121
		}
		if (r == z) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not palindrome");
	}
}