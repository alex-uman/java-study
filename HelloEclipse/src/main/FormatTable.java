package main;

public class FormatTable {

	public static void main(String[] args) {

		int[] array = randomArray(10, -10000, 10000);

		printArray(array);

	}

	static int[] randomArray(int count, int min, int max) {

		int[] array = new int[count];

		for (int i = 0; i < count; i++)

			array[i] = min + (int) (Math.random() * (max - min + 1));

		return array;

	}

	static void printArray(int[] array) {

		printTwoRowTableString("Nr.", "Wert");

		for (int i = 0; i < array.length; i++)

			printTwoRowTableString(i + 1, array[i]);

	}

	static void printTwoRowTableString(String r1, String r2) {
		System.out.printf("|%5s |%8s |%n", r1, r2);
	}

	static void printTwoRowTableString(String r1, int r2) {
		printTwoRowTableString(r1, String.valueOf(r2));
	}

	static void printTwoRowTableString(int r1, String r2) {
		System.out.printf("|   %02d |%8s |%n", r1, r2);
	}

	static void printTwoRowTableString(int r1, int r2) {
		printTwoRowTableString(r1, String.valueOf(r2));
	}
}
