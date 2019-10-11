package vererbung;

import java.util.Arrays;

class Wochentag {

	String string;

	Wochentag(String string) {

		this.string = string;

	}

	public String toString() {

		return string;

	}
}

public class ArrayUebung {

	public static void main(String[] args) {

		String[] days = createDaysArray();

		System.out.println(Arrays.toString(days));

		System.out.println(wochentag(0));

		System.out.println(new Wochentag("mo"));

		Wochentag[] wochentagArray = konvertieren(days);

		System.out.println(Arrays.toString(wochentagArray));

	}

	static String[] createDaysArray() {

		return new String[] { "mo", "di", "mi", "do", "fr", "sa", "so" };

	}

	static String wochentag(int tag) {

		if (tag > -1 && tag < 7)

			return createDaysArray()[tag];

		return "???";

	}

	static Wochentag[] konvertieren(String[] arr) {

		Wochentag[] array = new Wochentag[arr.length];

		for (int i = 0; i < arr.length; i++)
			array[i] = new Wochentag(arr[i]);

		return array;

	}

}
