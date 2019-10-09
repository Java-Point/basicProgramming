package max;

public class Max1 {

	public static int large() {
		int[] x = { 12, 23, 2 };
		int max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Large: " + large());
	}

}
