package aci_training.oop.model;

public class FamilyMgmtApp {

	public static void main(String[] args) {
		Family[] families = new Family[2];

		Man john = new Man("john doe", 2500);
		Woman marry = new Woman("marry jane", 5000);
		

		Family a = new Family(john, marry, 3);

		Man dan = new Man("dan popescu", 6000);
		Woman ioana = new Woman("ioana vasile", 5000);

		Family b = new Family(dan, ioana, 4);

		families[0] = a;
		families[1] = b;

		for (Family family : families) {
			System.out.println(family);
		}
		System.out.println();

		Child mikey = new Child("mikey");
		b.newChild(mikey);
		// families[1].newChild(mikey);

		for (Family family : families) {
			System.out.println(family);
		}
		System.out.println(mikey.getName() + " is happy " + mikey.isHappy());
		System.out.println();

		//mikey.play(dan);
		dan.play(mikey);
		mikey.recieve("batman");
		mikey.recieve("chocolate");

		for (Family family : families) {
			System.out.println(family);
		}
	}
}
