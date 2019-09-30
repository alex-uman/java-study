package arrays;

public class DimVersuch {

	public static void main(String[] args) {

		char[][] a1 = new char[3][];
		char[] a00 = { 'a', '3' };
		char[] a01 = { 'd' };
		char[] a02 = { 's' };

		a1[0] = a00;
		a1[1] = a01;
		a1[2] = a02;

		printArray(a1);

		a1[0] = a02;

		printArray(a1);

		a02[0] = 'w';

		printArray(a1);
		
		a1[0] = a00;
		a1[1] = a00;
		a1[2] = a00;

		printArray(a1);

	}

	static int[][] createArray(int rows, int cols) {

		return new int[rows][cols];

	}

	static void printArray(int[][] array) {

		for (int[] i : array) {

			for (int j : i)

				System.out.print(j + " ");

			System.out.println();

		}

	}

	static void printArray(char[][] array) {

		for (char[] i : array) {

			for (char j : i)

				System.out.print(j + " ");

			System.out.println();

		}

	}

}
