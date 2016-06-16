package aci_training.oop.model;

public class Family {

	private Member[] members;
	private int count;
	private String name;

	public Family(Man man, Woman woman, int howMany) {
		this.members = new Member[howMany];

		this.members[0] = man;
		this.members[1] = woman;
		woman.marry(this);
		this.count = 2;
		this.name = man.getName() + " " + woman.getName();
	}

	public void newChild(Child child) {
		addMember(child);
	}

	public void addPet(Pet pet) {
		addMember(pet);

	}

	public int getIncome() {
		int income = 0;
		for (int i=0; i < count; i++) {
			income += members[i].getIncome();
		}

		return income;
	}

	public boolean isHappy() {
		boolean isHappy = true;
		for (int i=0; i < count; i++) {
			isHappy = isHappy && members[i].isHappy();
		}
		return isHappy;
	}

	private void addMember(Member member) {
		if (count < this.members.length) {
			this.members[this.count++] = member;
		}
	}

	@Override
	public String toString() {
		return "Family '" + name + "' has income " + getIncome() + " is happy " + isHappy();
	}

}
 