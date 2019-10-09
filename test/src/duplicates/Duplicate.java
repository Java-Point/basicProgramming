package duplicates;

public class Duplicate {

	public static void main(String[] args) {
		int[] x = { 123, 231, 242, 2342, 4234, 2342, 2, 2 };
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.println(x[i]);
				}
			}
		}
	}
}