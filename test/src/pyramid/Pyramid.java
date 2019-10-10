package pyramid;

public class Pyramid {

	public static void main(String[] args) {
		String name = "Rakesh";
		char[] ch = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			ch[i] = name.charAt(i);
			System.out.println(ch);
		}
		// OR

		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
