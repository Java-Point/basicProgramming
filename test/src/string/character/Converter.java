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
	}
}
