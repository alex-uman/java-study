package Main;

public class Methoding {

	static void printFromTo(int from, int to) {

		int direction = 1;

		if (from > to)

			direction = -1;

		System.out.println(from + " -> " + to);

		to += direction;

		while (from != to) {

			System.out.print(from + " ");

			from += direction;

		}

		System.out.println();
		System.out.println();

	}

	static int sum(int valA, int valB) {

		long result = (long) valA + valB;

		int intResult = (int) result;

		System.out.println();
		System.out.print(valA + " + " + valB + " = ");

		if (result != intResult)

			System.out.print(" -> unmöglich für ein Integer! - > ");

		return intResult;

	}

	static int sumFromTo(int from, int to) {

		int direction = 1;

		if (from > to)

			direction = -1;

		System.out.println();
		System.out.print("die Summe von " + from + " bis " + to + " ist ");

		to += direction;

		long sumValue = 0;

		while (from != to) {

			sumValue += from;

			from += direction;

		}

		int intResult = (int) sumValue;

		if (sumValue != intResult)

			System.out.print(" -> unmöglich für ein Integer! - > ");

		return intResult;

	}

	static void zeichneRechteck(int breite, int hoehe) {

		breite = Math.abs(breite);
		hoehe = Math.abs(hoehe);

		System.out.println();
		System.out.println(breite + "x" + hoehe);
		System.out.println();

		if (breite == 0 || hoehe == 0) {
			System.out.println("Nix tu tun!");
		}

		else {

			for (int y = 0; y < hoehe; y++) {

				for (int x = 0; x < breite; x++) {

					System.out.print("*");

				}

				System.out.println();
			}

		}

	}

	static void zeichneRechteckBoolean(int breite, int hoehe, boolean fuellen) {

		breite = Math.abs(breite);
		hoehe = Math.abs(hoehe);

		System.out.println();
		System.out.println(breite + "x" + hoehe + ", " + fuellen);
		System.out.println();

		if (breite == 0 || hoehe == 0) {

			System.out.println("Nix tu tun!");
		}

		else {

			for (int y = 1; y <= hoehe; y++) {

				for (int x = 1; x <= breite; x++) {

					if (y > 1 && y < hoehe && x > 1 && x < breite && !fuellen)

						System.out.print(" ");

					else

						System.out.print("*");

				}

				System.out.println();
			}

		}

	}

	/**
	 * Die Methode gibt ein Kalender vür eine Jahr aus, es wird dabei errechned, ob
	 * es 29 Februar da gibt.
	 * 
	 * @param jahr
	 */

	static void printRandom(int n, int von, int bis) {

		n = Math.abs(n);

		System.out.println(n + " Zufallszahlen zwishen " + von + " und " + bis);

		if (n == 0)

			System.out.println("Nix zu tun!");

		else {

			if (von > bis) {

				int tmp = bis;
				bis = von;
				von = tmp;
			}

			for (int i = 0; i < n; i++) {

				double rndm = Math.random(); // Math.nextDown(1.0);

				System.out.print((int) (von * (1.0 - rndm) + bis * rndm) + " ");

			}

			System.out.println();

		}

		System.out.println();

	}

	static void Kalender(int jahr) {
		jahr = Math.abs(jahr);

		System.out.println("Kalender " + jahr);
		System.out.println("--------------");
		System.out.println();

		for (int monat = 1; monat < 13; monat++) {

			System.out.print("Monat " + monat + ":");

			switch (monat) {
			case 4:
			case 6:
			case 9:
			case 11:

				for (int tag = 1; tag < 31; tag++)

					System.out.print(" " + tag);

				System.out.println();
				System.out.println();

				break;

			case 2:

				for (int tag = 1; tag < 29; tag++)

					System.out.print(" " + tag);

				if (jahr % 4 == 0)

					System.out.print(" 29");

				System.out.println();
				System.out.println();

				break;

			default:

				for (int tag = 1; tag < 32; tag++)

					System.out.print(" " + tag);

				System.out.println();
				System.out.println();

			}

		}

		System.out.println();

	}

	static int getFakultaet(int fakValue) {

		fakValue = Math.abs(fakValue);

		long sumValue = 1;

		for (int i = 0; i < fakValue;) {

			sumValue *= ++i;

		}

		int intResult = (int) sumValue;

		if (sumValue != intResult)

			System.out.print(" -> unmöglich für ein Integer! - > ");

		System.out.println(fakValue + "! = " + intResult);

		return intResult;

	}

	static int getFakultaetRekursiv(int fakValue) {

		if (fakValue < 1) {

			System.out.println("0! = 1");

		}

		if (fakValue > 1) {

			long sumValue = (long)fakValue * getFakultaetRekursiv(fakValue - 1);

			int intResult = (int) sumValue;

			if (sumValue != intResult)

				System.out.print(" -> unmöglich für ein Integer! - > ");

			return intResult;

		}

		return 1;
		
	}

}