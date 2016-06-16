package aci_training.intro;

public class TestApp {
	
	static final int MAX_AGE = 23;

	public static void main(String[] args) {
		final int xyz;
		int a;
		a= 5;
		int b = 25;
		Integer number = new Integer(5);
		
		a= a +b;
		System.out.println(a);
		double another = number.doubleValue();
		double another1 = a;
		System.out.println(another);
		xyz = a;
		System.out.println(another1);
		Integer number1 = 5;//autoboxing
		
		String astr = "25";
		String bstr = "23";
		
		int sum = Integer.parseInt(astr) + Integer.parseInt(bstr);
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
		sum(a,b);
	}

	public static void sum(Integer x,Integer y){
	
		System.out.println(x+y); 
	}
}
