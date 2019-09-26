package arrays;

public class ArrayAufgabe {

	public static void main(String[] args) {

		System.out.println("#### A1, A2");
		System.out.println();

		int[] arrayA1 = createArray(30, -40, 8);

		printArray(arrayA1);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("#### A3");
		System.out.println();

		char[] arrayA2 = deutscheUmlaute();

		printArray(arrayA2);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("#### A4");
		System.out.println();

		char[] arrayA3 = deutscheBuchstaben();

		printArray(arrayA3);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("#### A5");
		System.out.println();

	}

	static int[] createArray(int min, int max, int length) {

		if (max < min) {

			int varX = min;
			min = max;
			max = varX;

		}

		int[] array = new int[length];

		for (int i = 0; i < length; i++)

			array[i] = min + (int) (Math.random() * (max - min + 1));

		return array;

	}

	static void printArray(int[] array) {

		for (int i : array)

			System.out.print(i + " ");

	}

	static void printArray(char[] array) {

		for (char i : array)

			System.out.print(i + " ");

	}

	static char[] deutscheUmlaute() {

		char[] array = { 'ä', 'ö', 'ü' };

		return array;

	}

	static char[] deutscheBuchstaben() {

		char[] array = new char[30];

		char c = 'a';

		for (int i = 0; i < 26; i++)

			array[i] = c++;

		array[26] = 'ä';
		array[27] = 'ö';
		array[28] = 'ü';
		array[29] = 'ß';

		return array;

	}

}
