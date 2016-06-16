package aci_training.enums;

public class EnumsApp {
	
	private static final String FEMALE = "female";
	private static final String MALE = "male";

	public static void main(String[] args) {

		Gender sex = Gender.FEMALE;
		Gender sex1 = Gender.valueOf("MALE");
		
		process(sex);
		process(sex1);
		
		process(FEMALE);
		process("abs");
		
		for (Gender gender: Gender.values()) {
			System.out.println(gender);
		}
	}

	private static void process(Gender sex) {
		System.out.println(sex.name());
		System.out.println(sex.ordinal());
		System.out.println(sex.getPreferredColor());
	}

	private static void process(String sex) {
		System.out.println(sex);
	}

}
