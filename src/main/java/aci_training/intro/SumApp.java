package aci_training.intro;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		String a = input.nextLine();
//		String b = input.nextLine();
//		
//		int x = Integer.parseInt(a);
//		int y = Integer.parseInt(b);
		
		System.out.println("first number please");
		int x = input.nextInt();
		System.out.println("2nd number please");
		int y = input.nextInt();
		
		TestApp.sum(x, y);

	}

}
