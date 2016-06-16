package aci_training.oop.access;

public class InheritApp {

	public static void main(String[] args) {
		Child noname = new Child();
		
		Member gigel = new Child("gigel");

		
		System.out.println(noname.getName());
		System.out.println(gigel.getName());
		
		noname.scream();
		//gigel).scream(); // does not work!
		((Child)gigel).scream();
	}

}
