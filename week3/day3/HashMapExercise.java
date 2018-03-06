package week3.day3.appcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 Write a method called find Duplicates() that will take Array Of Strings and will 
 Print the duplicate elements. Use Hash Map.
String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
 ***/
public class HashMapExercise {


	public static void findDuplicates(String[] names) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		ArrayList<String> duplicates = new ArrayList<String>();
		
		
		
	//	ArrayList<String> duplicates = new ArrayList<String>();
		
		for (String name : names) {

			Integer count = hmap.get(name);
			
			if(hmap.get(name)== null) {
				hmap.put(name, count);
				
			} else {
				hmap.put(name,++count);
			}
			System.out.println(hmap);
			Iterator<Map.Entry<String, Integer>> mapIterator = hmap.entrySet().iterator();
			while (mapIterator.hasNext()) {
				
				Map.Entry<String, Integer> entry = mapIterator.next();
				//if (entry.getKey() == null) {

					System.out.println(" duplicate " + entry.getValue());
				//}
			}
		}
	//	return duplicates;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		findDuplicates(names);
		


	}

}
