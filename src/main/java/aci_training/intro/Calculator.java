package aci_training.intro;

import java.util.Scanner;

public class Calculator {


	public static int calculate(String operation, int iOp1, int iOp2) {
		switch (operation) {
		case "*":
			return iOp1 * iOp2;
		case "/":
			return iOp1 / iOp2;
		case "+":
			return iOp1 + iOp2;
		case "-":
			return iOp1 - iOp2;
		case "%":
			return iOp1 % iOp2;

		default:
			System.out.println("ERROR!!! invalid operation");
			return 0;
		}
	}

	public static int convert(String s) {
		return Integer.parseInt(s);

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// init console
		Scanner input = new Scanner(System.in);
		String line;
		
		/*
		 * ask for operation
		 * perform
		 * display
		 * repeat
		 */
		do {
			System.out.println("Please introduce operation. To quit type q");
			line = input.nextLine();
			String[] items = line.split(" ");
			if (items.length < 2) {
				continue;
			}			
			int result = convert(items[0]);
			for (int i = 1; i < items.length - 1; i += 2) {
				int iOp = convert(items[i + 1]);
				result = calculate(items[i], result, iOp);
			}
			System.out.println("result = " + result);
		} while (!line.equals("q"));
		input.close();
		
	}

}
