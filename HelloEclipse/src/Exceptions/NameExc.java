package Exceptions;

import java.text.*;

public class NameExc {

	public static void main(String[] args) {

//		System.out.println(5 / 0);

		try {

			String name = formatName(null);

		}

		catch (Exception e) {

			throw new IllegalArgumentException("!!!", e);

		}

		System.out.println(formatName(111));

//		m();

	}

	/**
	 * @asd
	 * 
	 * 
	 */
	static String formatName(Object name) {

		if (name == null)
			return "NULL";

		if (name.toString().length() < 3)
			throw new IllegalArgumentException("der Name muss mindestens 3 Zeichen naben");

		return name.toString().toUpperCase();
	}

	static void m() throws ParseException {

		int i;

		try {
			i = 1;
		} catch (Exception e) {
			throw new ParseException("!", 1);
		}
	}

}