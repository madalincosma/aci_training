package aci_training.oop.model;

public class Child extends Member {

	private boolean hasAttention;
	private boolean hasToys;
	private boolean hasCandy;

	public Child(String name) {
		super(name);
	}

	@Override
	public boolean isHappy() {
		return hasAttention && hasToys && hasCandy;
	}

	@Override
	public void play(Member other) {
		this.hasAttention = true;
	}
	
	public void recieve(String item) {
		if ("batman".equals(item)) {
			this.hasToys = true;
		}
		if ("barbie".equals(item)) {
			this.hasToys = true;
		}
		if ("chocolate".equals(item)) {
			this.hasCandy = true;
		}
	}

}
