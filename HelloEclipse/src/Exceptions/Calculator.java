package Exceptions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		for (;;)
			System.out.println(getOperation());

	}

	static Double getOperation() {

		Double result = 0.0;
		Double x, y;

		Scanner operation = getUserInput();

		String stringX = getNext(operation);
		if (stringX == null)
			return getOperation();

		checkForQuit(stringX);

		String operand = getNext(operation);
		if (operand == null)
			return getOperation();

		String stringY = getNext(operation);
		if (stringY == null)
			return getOperation();

		x = getDouble(stringX);
		if (x == null)
			return getOperation();

		y = getDouble(stringY);
		if (y == null)
			return getOperation();

		switch (operand) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		case "*":
			result = x * y;
			break;
		case "/":
			result = x / y;
			break;
		case ":":
			result = x / y;
			break;
		default:
			System.out.println("So was tut man mit den Zahlen nicht!\nBitte nochmals versuchen!");
			return getOperation();
		}

		return result;
	}

	static Scanner getUserInput() {

		Scanner console = new Scanner(System.in);
		Scanner line = new Scanner(console.nextLine());
		console = null;

		if (!line.hasNext()) {
			System.out.println("Sie haben nix angegeben! Bitte nochmals versuchen!\n");
			return getUserInput();
		}

		return line;
	}

	static Double getDouble(String string) {

		Double number;

		try {
			number = Double.parseDouble(string);
		}

		catch (NumberFormatException e) {
			System.out.println(string + " ist keine Zahl!\nVersuchen Sie bitte nocmals!");
			return null;
		}

		return number;
	}

	static String getNext(Scanner line) {

		if (!line.hasNext()) {
			System.out.println("Sie haben sicherlich nicht alles angegeben!\nVersuchen Sie bitte nocmals!");
			return null;
		}

		return line.next();
	}

	static void checkForQuit(String string) {

		if (string.substring(0, 1).toLowerCase().contentEquals("q")) {
			System.out.println("-exit-");
			System.exit(0);
		}
	}

}