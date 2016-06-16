package aci_training.oop.model;

public class Pet extends Member {

	private boolean hasToys;
	private boolean hasAttention;

	public Pet(String name) {
		super(name);
	}

	@Override
	public boolean isHappy() {
		return hasToys && hasAttention;
	}
	
	public void pet() {
		this.hasAttention = true;
	}	
	
	public void play(Object object) {
		this.hasToys = true;
		this.hasAttention = true;
	}
	
	

}
