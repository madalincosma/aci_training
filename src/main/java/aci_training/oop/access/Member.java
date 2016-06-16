package aci_training.oop.access;

public class Member {
	
	private String name = "no-name";
	
	public Member(String name) {
		super();
		this.name = name;
	}	

	public Member() {
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return 0;
	}

}
