package aci_training.enums;

public enum Gender {
	TRANS("pink"),MALE("blue"),FEMALE("red");
	
	private String color;
	
	private Gender(String color){
		this.color = color;
	}
	
	public String getPreferredColor() {
		return color;
	}

}
