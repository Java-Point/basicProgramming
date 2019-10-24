package com.practice.duplicates;

import java.util.*;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		String name = "Abccdedfdgf";
		char[] chara = name.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for (Character ch : chara) {
			set.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for (Character cha : set) {
			sb.append(cha);
		}
		System.out.println(sb);
	}
}
