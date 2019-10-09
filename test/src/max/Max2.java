package max;

public class Max2 {

	public static void main(String[] args) {
		int[] x = { 12, 23, 432, 2342, 43 };
		int x1 = x[0], x2 = x[0];
		for (int i = 1; i < x.length; i++) {
			if (x[i] > x1) {
				x2 = x1;
				x1 = x[i];
			}

		}
		System.out.println(x2);
	}

}
