package Exceptions;

import java.util.Scanner;
import java.time.LocalDate;

public class DatumConsole {

	public static void main(String[] Args) {

		LocalDate date = inputDate();

		System.out.println("\n" + date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear());

	}

	static LocalDate inputDate() {

		LocalDate date = null;

		System.out.println("Bite ein Datum (YYYY-MM-DD) eingeben:\n");

		String dateAsString = getUserInput();

		try {
			date = LocalDate.parse(dateAsString);

		} catch (Exception e) {
			System.out.println("\n\"" + dateAsString + "\" ist kein Datum!");
			return inputDate();
		}

		return date;

	}

	static String getUserInput() {

		Scanner console = new Scanner(System.in);
		Scanner line = new Scanner(console.nextLine());

		if (!line.hasNext()) {
			System.out.println("Sie haben nix angegeben! Bitte nochmals versuchen!\n");
			return getUserInput();
		}

		String string = line.next();

//		console.close();
		line.close();

		return string;
	}

}
