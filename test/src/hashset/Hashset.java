package hashset;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Rakesh");
		set.add("Ramesh");
		set.add("Rajesh");
		set.add("Rajat");
		set.add("Rahul");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
