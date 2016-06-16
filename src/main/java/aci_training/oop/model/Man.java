package aci_training.oop.model;

public class Man extends Member {

	private int salary;
	private int otherIncome;
	
	public Man(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	public Man(String name, int salary, int otherIncome) {
		super(name);
		this.salary = salary;
		this.otherIncome = otherIncome;
	}

	@Override
	public boolean isHappy() {
		return getIncome() > 3000;
	}

	@Override
	public int getIncome() {
		return salary + otherIncome;
	}

	public void spend(int money) {
		salary -= money;
	}

	@Override
	public void play(Member other) {
		other.play(this);
	}

}
