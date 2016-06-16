package aci_training.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParseNumbersApp {

	public static void main(String[] args) {

		String number1 = "";
		String number2 = "20";

		try {
			Files.newBufferedReader(Paths.get("pom.xml"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			sum(number1, number2);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			System.out.println(e);
		}
		System.out.println(number1 + number2);

	}

	private static void sum(String number1, String number2) throws IOException {
		int n1 = 0;
		int n2 = 0;
		if (number1.isEmpty()) {
			throw new MyException();
		}
		n1 = Integer.parseInt(number1);
		n2 = Integer.parseInt(number2);

		System.out.println(n1 + n2);
		BufferedReader reader = Files.newBufferedReader(Paths.get("abc.xml"));

		try {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			reader.close();
		}

	}

}

class MyException extends RuntimeException {

}
