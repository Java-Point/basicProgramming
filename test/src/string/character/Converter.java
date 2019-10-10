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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name to reverse");
		String name1 = sc.next();
		StringBuilder sb = new StringBuilder();
		sb = sb.append(name);
		sb = sb.reverse();
		System.out.println("The reversed name will be: " + sb);
	}
}
