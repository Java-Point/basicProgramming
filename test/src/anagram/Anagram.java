package anagram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String x = "xRaarx";
		String y = "rarax";
		char[] a = null;
		char[] b;
		boolean isAnagram = true;
		if (x.length() != y.length()) {
			isAnagram = false;
		} else
		a = x.toLowerCase().toCharArray();
		b = y.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		isAnagram = Arrays.equals(a, b);
		if (isAnagram == true) {
			System.out.println(x + " and " + y + " are anagram.");
		} else
			System.out.println(x + " and " + y + " aren't anagram.");
	}
}
