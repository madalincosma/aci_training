package aci_training.intro;

import aci_training.oop.model.Man;

public class HelloWorld {

	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		Man john = new Man("john doe", 2500);
		
		int x = Integer.parseInt(a);		
		int y = Integer.parseInt(b);
		
		int val= (x > 0)? 5 : 10;
		
		System.out.println(val);
	}

}
