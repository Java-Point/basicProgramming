package armstrong;

public class Armstrong {

	public static void main(String[] args) {
		int x = 153, z = x, r = 0, m = 0;
		while (x > 0) {
			m = x % 10;
			x = x / 10;
			r += m * m * m;
		}

		if (r == z) {
			System.out.println(z + " is a palindrome no.");
		} else
			System.out.println(z + " isn't a palindrome no.");

	}
}
