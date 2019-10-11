package string.character;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		String name = "Rakesh";
		char[] ch = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			ch[i] = name.charAt(i);
			System.out.println(ch[i]);
		}
		System.out.println("OR");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("w");
		arr.add("w");
		arr.add("e");
		ListIterator<String> it = arr.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			System.out.println();
		}
		System.out.println("\t" + "AND");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
			System.out.println();
		}
	}
}
