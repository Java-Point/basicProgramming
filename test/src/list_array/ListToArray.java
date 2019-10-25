package list_array;

import java.util.*;

public class ListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rakesh");
		list.add("Ramesh");
		System.out.println(list);
		System.out.println("\n" + "After converted from List: " + "\n");
		Object[] obj = list.toArray();
		for (Object str : obj) {
			System.out.println(str);
		}
	}
}