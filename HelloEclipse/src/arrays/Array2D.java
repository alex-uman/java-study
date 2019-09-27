package arrays;

public class Array2D {

	public static void main(String[] args) {

		int x = 5;
		int y = 8;

		System.out.println("Ein Array [" + x + "][" + y + "] erstellen und herausgeben:");
		System.out.println();

		int[][] array = createArray(x, y);
		printArray(array);

		System.out.println();
		System.out.println();

		int posX = 1;
		int posY = 1;
		int value = 5;

		System.out.println("In diesem Array auf der Stelle (" + posX + "," + posY + ") den Wert " + value
				+ " speichern und herausgeben:");
		System.out.println();

		array[1][1] = 5;
		printArray(array);

		System.out.println();
		System.out.println();

		value = 2;

		System.out.println("Alle Positionen in dem Array mit dem Wert " + value + " belegen und herausgeben:");
		System.out.println();

		for (int i = 0; i < array.length; i++)

			for (int j = 0; j < array[i].length; j++)

				array[i][j] = value;

		printArray(array);

		System.out.println();
		System.out.println();

		System.out
				.println("Diesen Array so herausgeben, dass alle Positionen in einer Zeile mit Commas getrennt sind:");
		System.out.println();

		printArrayWithCommas(array);

		System.out.println();
		System.out.println();

		char frame = 'X';

		System.out.println("Ein char-Array [" + x + "][" + x + "] erstellen, mit Leerzeichen und '" + frame
				+ "' am Rand füllen und herausgeben:");
		System.out.println();

		char[][] frameArray = createBorderArray(x, frame);
		printArray(frameArray);

	}

	static void checkForPositiveArrayDimmension(int length) {

		if (length < 1)

			throw new IllegalArgumentException("Array dimmensions has to be natural numbers!");
	}

	static int[][] createArray(int x, int y) {

		checkForPositiveArrayDimmension(x);
		checkForPositiveArrayDimmension(y);

		return new int[x][y];

	}

	static void printArray(int[][] array) {

		for (int[] i : array) {

			for (int j : i)

				System.out.print(j + " ");

			System.out.println();

		}

	}

	static void printArrayWithCommas(int[][] array) {

		for (int[] i : array) {

			System.out.print(i[0]);

			for (int j = 1; j < i.length; j++)

				System.out.print(", " + i[j]);

			System.out.println();

		}

	}

	static char[][] createBorderArray(int x, char ch) {

		checkForPositiveArrayDimmension(x);

		char[][] array = new char[x][x];

		int bodyX = x - 1;

		for (int i = 0; i < x; i++) {

			array[i][0] = ch;
			array[i][bodyX] = ch;

		}

		for (int j = 1; j < bodyX; j++) {

			array[0][j] = ch;

			for (int i = 1; i < bodyX; i++)

				array[i][j] = ' ';

			array[bodyX][j] = ch;

		}

		return array;

	}

	static void printArray(char[][] array) {

		for (char[] i : array) {

			for (char j : i)

				System.out.print(j);

			System.out.println();

		}

	}

}
