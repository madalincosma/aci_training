package aci_training.oop.model;

public class Woman extends Member {	

	private Family family;
	private int salary;

	public Woman(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	public void marry(Family family) {
		this.family = family;
	}

	@Override
	public boolean isHappy() {
		return family.getIncome() > 10000;
	}

	@Override
	public int getIncome() {
		return this.salary;
	}

	@Override
	public void play(Member other) {
		if (other instanceof Man) {
			Man man = (Man) other;
			man.spend(500);
		}
	}

}
