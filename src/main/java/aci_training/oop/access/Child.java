package aci_training.oop.access;

public class Child extends Member {

	public Child(String name) {
		super(name);
	}

	public Child() {
		super();
	}

	@Override
	public int getAge() {
		if ("noname".equals(getName())) {
			return super.getAge();
		}
		return 5;
	}
	
	public void scream() {
		System.out.println("!!!!!!!");
	}

}
