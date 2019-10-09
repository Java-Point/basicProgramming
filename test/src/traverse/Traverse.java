package traverse;

import java.util.ArrayList;
import java.util.ListIterator;

public class Traverse {
	public static void main(String[] args) {
//		***using iterator***
		ArrayList<String> list = new ArrayList<String>();
		list.add("R");
		list.add("A");
		list.add("K");
		list.add("E");
		list.add("S");
		list.add("H");
		ListIterator<String> iterator = list.listIterator();

		System.out.println("In forward:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			System.out.println();
		}
		System.out.println("In backward:");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
			System.out.println();
		}

//		***using StringBuilder***
		{
			String name = "Rakesh";
			StringBuilder sb = new StringBuilder();
			sb.append(name);
			sb = sb.reverse();
			System.out.println(sb);
		}
	}
}
