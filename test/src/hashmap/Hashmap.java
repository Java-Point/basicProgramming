package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("One", "Rakesh");
		map.put("Two", "Rajat");
		map.put("Three", "Ramesh");
		map.put("Four", "Rajesh");
		for (Map.Entry<String, String> map1 : map.entrySet()) {
			System.out.println("Sl: " + map1.getKey() + "\n" + " Name: " + map1.getValue());
		}
	}
}
