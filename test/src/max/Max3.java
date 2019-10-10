package max;

public class Max3 {

	public static void main(String[] args) {
		int[] x = { 123, 231, 242, 2342, 4234, 2342 };
		Arrays.sort(x);
		int x1 = x[0], x2 = x[0], x3 = x[0];
		for (int i = 1; i < x.length; i++) {
			if (x[i] > x1) {
				x3 = x2; // 231, 242
				x2 = x1; // 231, 242, 2342
				x1 = x[i]; // x1 = 231 =x[i], 242, 2342, 4234
			}
		}
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}

}
