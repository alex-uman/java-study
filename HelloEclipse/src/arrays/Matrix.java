package arrays;

import java.util.Arrays;

class IntMatrix {

	private int[][] matrix;

	IntMatrix(int x, int y) {

		checkForDimmentions(x, y);

		matrix = new int[x][y];

	}

	IntMatrix(int x, int y, int value) {

		this(x, y);

		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				matrix[i][j] = value;

	}

	IntMatrix(IntMatrix anotherMatrix) {

		this(anotherMatrix.matrix.length, anotherMatrix.matrix[0].length);

		for (int i = 0; i < anotherMatrix.matrix.length; i++)
			for (int j = 0; j < anotherMatrix.matrix[0].length; j++)
				this.matrix[i][j] = anotherMatrix.matrix[i][j];

	}

	static IntMatrix getRandomMatrix(int x, int y, int range) {

		IntMatrix randomMatrix = new IntMatrix(x, y);

		int min, max;

		if (range < 0) {

			min = range;
			max = 0;

		} else {

			min = 0;
			max = range;

		}

		for (int i = 0; i < x; i++)

			for (int j = 0; j < y; j++)

				randomMatrix.matrix[i][j] = min + (int) (Math.random() * (max - min + 1));

		return randomMatrix;

	}

	static IntMatrix transpose(IntMatrix origin) {

		IntMatrix transpose = new IntMatrix(origin.matrix[0].length, origin.matrix.length);

		for (int i = 0; i < origin.matrix.length; i++)
			for (int j = 0; j < origin.matrix[0].length; j++)
				transpose.matrix[j][i] = origin.matrix[i][j];

		return transpose;

	}

	public boolean equals(Object obj) {

		if (!(obj instanceof IntMatrix))

			return false;

		obj = (IntMatrix) obj;

		return equals(obj);

	}

	String dimensions() {

		return this.matrix.length + "x" + this.matrix[0].length;
	}

	boolean equals(IntMatrix anotherMatrix) {

		if (this.equals(anotherMatrix))

			return true;

		if (!this.dimensions().equals(anotherMatrix.dimensions()))

			return false;

		for (int i = 0; i < this.matrix.length; i++)

			for (int j = 0; j < this.matrix[0].length; j++)

				if (this.matrix[i][j] != anotherMatrix.matrix[i][j])

					return false;

		return true;

	}

	void checkForDimmentions(int x, int y) {

		if (x < 1 || y < 1)
			throw new IllegalArgumentException("Matrix dimentions has to be natural numbers");

	}

	void checkForOutOfBounds(int x, int y) {

		if (this.matrix.length < x || this.matrix[0].length < y)

			throw new IllegalArgumentException("The target element exceeds the bounds of the matrix!");

	}

	void set(int x, int y, int value) {

		checkForOutOfBounds(--x, --y);

		this.matrix[x][y] = value;

	}

	int get(int x, int y) {

		checkForOutOfBounds(--x, --y);

		return this.matrix[x][y];

	}

	public String toString() {

		String stringValue = "";

		for (int[] string : matrix)
			stringValue += Arrays.toString(string) + '\n';

		return stringValue;

	}

}

public class Matrix {

	public static void main(String[] args) {

		System.out.println("Eine Matrize mit 2 Zeilen und 3 Spalten erstelen und anzeigen:");
		System.out.println();

		IntMatrix m1 = new IntMatrix(2, 3);

		System.out.println(m1);

		System.out.println();
		System.out.println(
				"Eine Matrize mit 5 Zeilen und 3 Spalten erstellen,\nalle Elemente der Matrize mit dem Wert 100 initialisieren\nund anzeigen:");
		System.out.println();

		IntMatrix m2 = new IntMatrix(5, 3, 100);

		System.out.println(m2);

		System.out.println();
		System.out.println("Die Position (1, 2) in der ersten Matrize mit der Wert 3 belegen\nund dann anzeigen:");
		System.out.println();

		m1.set(1, 2, 3);
		System.out.println(m1.get(1, 2));

		System.out.println();
		System.out.println("Diese Matrize ganz anzeigen:");
		System.out.println();

		System.out.println(m1);

		System.out.println();
		System.out.println(
				"Eine Matrize mit 4 Zeilen und 6 Spalten erstellen,\nalle Elemente zufällig in bereich von 0 biss 200 initialisieren\nund anzeigen:");
		System.out.println();

		IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);

		System.out.println(m3);

		System.out.println();
		System.out.println("Und noch ein Mal:");
		System.out.println();

		m3 = IntMatrix.getRandomMatrix(4, 6, 200);

		System.out.println(m3);

		System.out.println();
		System.out.println("Prüfen, ob zwei Matrizen gleich sind:");
		System.out.println();

		IntMatrix m411 = IntMatrix.getRandomMatrix(2, 3, 10);
		IntMatrix m412 = IntMatrix.getRandomMatrix(3, 2, 10);

		System.out.println(m411);
		System.out.println("und");
		System.out.println();
		System.out.println(m412);
		System.out.println("sind" + (m411.equals(m412) ? "" : " nicht") + " gleich");
		System.out.println();

		IntMatrix m421 = IntMatrix.getRandomMatrix(2, 3, 10);
		IntMatrix m422 = IntMatrix.getRandomMatrix(2, 3, 10);

		System.out.println();
		System.out.println(m421);
		System.out.println("und");
		System.out.println();
		System.out.println(m422);
		System.out.println("sind" + (m421.equals(m422) ? "" : " nicht") + " gleich");
		System.out.println();

		IntMatrix m431 = IntMatrix.getRandomMatrix(3, 5, 10);
		IntMatrix m432 = new IntMatrix(m431);

		System.out.println();
		System.out.println(m431);
		System.out.println("und");
		System.out.println();
		System.out.println(m432);
		System.out.println("sind" + (m431.equals(m432) ? "" : " nicht") + " gleich");
		System.out.println();

		System.out.println();
		System.out.println("Zwei ungleiche Matrizen");
		System.out.println();
		System.out.println(m1);
		System.out.println("und");
		System.out.println();
		System.out.println(m2);
		System.out.println("zu einem Array hinzufügen\nund die zweite Matrize anzeigen:");
		System.out.println();

		IntMatrix[] somethingWeird = { m1, m2 };

		System.out.println(somethingWeird[1]);

		System.out.println();
		System.out.println("Diese Matrize:");
		System.out.println();
		System.out.println(m431);
		System.out.println("transponieren\nund anzeigen:");
		System.out.println();
		System.out.println(IntMatrix.transpose(m431));
		System.out.println();

	}

}
