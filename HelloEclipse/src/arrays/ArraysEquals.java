package arrays;

public class ArraysEquals {

	static int NUMBER_OF_TESTS = 100000;

	public static void main(String[] args) {

		int[] arrayA = { 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33,
				22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73,
				50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21,
				25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35,
				75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64,
				32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33,
				22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73 };
		int[] arrayB = { 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33,
				22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73,
				50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21,
				25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35,
				75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64,
				32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73, 50, 35, 75, 33,
				22, 21, 25, 64, 32, 73, 50, 35, 75, 33, 22, 21, 25, 64, 32, 73 };

		System.out.println(
				"The mid time for the While-loop at " + NUMBER_OF_TESTS + " tests: " + midTimeOfWhile(arrayA, arrayB));

		System.out.println();

		System.out.println(
				"The mid time for the For-loop at " + NUMBER_OF_TESTS + " tests: " + midTimeOfFor(arrayA, arrayB));

	}

	static void checkForArrayLengthEquality(int[] arrayA, int[] arrayB) {

		if (arrayA.length != arrayB.length)

			throw new IllegalArgumentException("Both arrays has to be of the same length!");
	}

	static boolean equalsMitWhile(int[] arrayA, int[] arrayB) {

		checkForArrayLengthEquality(arrayA, arrayB);

		int i = 0;

		while (i < arrayA.length) {

			if (arrayA[i] != arrayB[i])

				return false;

			i++;
		}

		return true;

	}

	static boolean equalsMitFor(int[] arrayA, int[] arrayB) {

		checkForArrayLengthEquality(arrayA, arrayB);

		for (int i = 0; i < arrayA.length; i++)

			if (arrayA[i] != arrayB[i])

				return false;

		return true;

	}

	static double midTimeOfWhile(int[] arrayA, int[] arrayB) {

		checkForArrayLengthEquality(arrayA, arrayB);

		double midTime = 0;

		for (int i = 0; i < NUMBER_OF_TESTS; i++) {

			midTime -= System.currentTimeMillis();

			equalsMitWhile(arrayA, arrayB);

			midTime += System.currentTimeMillis();

		}

		return midTime / NUMBER_OF_TESTS;
	}

	static double midTimeOfFor(int[] arrayA, int[] arrayB) {

		checkForArrayLengthEquality(arrayA, arrayB);

		double midTime = 0;

		for (int i = 0; i < NUMBER_OF_TESTS; i++) {

			midTime -= System.currentTimeMillis();

			equalsMitWhile(arrayA, arrayB);

			midTime += System.currentTimeMillis();

		}

		return midTime / NUMBER_OF_TESTS;
	}

}
