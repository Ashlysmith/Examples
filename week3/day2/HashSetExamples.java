package week3.day2.appcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExamples {

	public static Set<String> hashSetExample() {
		// HashSet - Does not maintain order
		Set<String> hset = new HashSet<String>();

		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		// Addition of duplicate elements
		hset.add(null);
		hset.add(null);

		// System.out.println(set);
		System.out.println("Hash");

		System.out.println(hset);
		System.out.println(hset.size());

		for (String item : hset) {
			System.out.println(item);
		}
		return hset;
	}

	public static Set<String> linkedHashSetExample() {
		// LinkedHashSet - It maintains the order in which the elements are added
		Set<String> lHSet = new LinkedHashSet<String>();
		lHSet.add("BMW");
		lHSet.add("Audi");
		lHSet.add("Honda");
		System.out.println("Linked");
		System.out.println("*****");
		for (String item : lHSet) {
			System.out.println(item);
		}
		return lHSet;
	}

	public static void main(String[] args) {

		// HashSet - Does not maintain order
		Set<String> hsetResult = hashSetExample();
		System.out.println("Hash Set");
		System.out.println(hsetResult);

		Set<String> linkedhsetResult = hashSetExample();
		System.out.println("Linked Hash Set");
		System.out.println(linkedhsetResult);

	}
}
