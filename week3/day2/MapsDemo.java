package week3.day2.appcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsDemo {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = mapsDemo();
		System.out.println(hashMap);
	}

	public static Map<Integer, String> mapsDemo() {
		// Stores in pair, key -> value : Entry
		Map<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("Key is: " + mentry.getKey() + " & Value is : ");
			System.out.println(mentry.getValue());
		}

		String var = hmap.get(2);
		System.out.println("Value at index 2 is :" + var);

		// Keys are unique, value can be duplicated
		hmap.remove(3);
		hmap.put(2, "BMW");
		hmap.put(4, "Merc");
		String value4 = hmap.get(4);
		System.out.println(value4);
		String value2 = hmap.get(2);
		System.out.println(value2);
		return hmap;
	}
}
