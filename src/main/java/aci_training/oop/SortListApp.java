package aci_training.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListApp {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ion");
		list.add("dan");
		list.add("vali");
		
		Collections.sort(list); 
		
		System.out.println(list);
		
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2) * -1;
			}
		};
//		
//		Collections.sort(list, comparator);
		
		System.out.println(list);

	}

}
