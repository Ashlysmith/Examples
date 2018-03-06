package week3.day3.appcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapDemo {

	public static void main(String args[]) {

		// This is how to declare HashMap /
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Smith");
		hmap.put(51, "Smith");
		hmap.put(3, "Anuj");
		hmap.put(6, "Anuj");

		Iterator<Integer> hMapIterator = hmap.keySet().iterator();
		while (hMapIterator.hasNext()) {
			Integer code = hMapIterator.next();
			System.out.println(code + ": " + hmap.get(code));
			// System.out.println(code);
		}

		/* Get values based on key */
		String var = hmap.get(49);
		// hmap.
		// hmap.put(49, "smith2");
		System.out.println("Value at index 2 is: " + var);

		/* Remove values based on key */
		hmap.remove(3);
		System.out.println("Map key and values after removal:");

		Iterator<Map.Entry<Integer, String>> mapIterator = hmap.entrySet().iterator();
		while (mapIterator.hasNext()) {
			Map.Entry<Integer, String> entry = mapIterator.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
