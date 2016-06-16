package aci_training.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class StatisticsApp {

	public static void main(String[] args) {
		String text = "ana are mere";
		
		Map<Character, Integer> stats = new LinkedHashMap<Character, Integer>();
		
		stats.put('a', 3);
		stats.put('n', 1);
		stats.put('e', 4);
		stats.put('r', 2);
		stats.put('m', 1);
		
		display(stats);
		
		Collection<String> collection = new ArrayList<>();
		collection.add("abc");
		collection.add("abc");
		collection.add("abc");
		
		System.out.println(collection);
		System.out.println(collection.contains("true"));
		System.out.println(collection.contains("abc"));
		collection.remove("abc");
		System.out.println(collection);
		
		
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("ion", "timi", 23));
		set.add(new Person("gigel", "timi", 23));
		set.add(new Person("ionel", "arad", 23));
		System.out.println(set);
		
		Comparator<Person> nameAddressComparator = Person.nameAddressComparator();
		TreeSet<Person> set1 = new TreeSet<>(nameAddressComparator);
		set1.addAll(set);
		System.out.println(set1);

	}

	private static void display(Map<Character, Integer> stats) {
		for (Entry<Character, Integer> c : stats.entrySet()) {
			System.out.println(c.getKey() + ":" + c.getValue());
		}
	}

}
