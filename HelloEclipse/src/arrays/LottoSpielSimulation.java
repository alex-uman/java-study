package arrays;

import java.util.Scanner;
import java.util.Arrays;

class LottoSpiel {

	private int[] kugel;
	private int anzahlKugelGesamt;

	LottoSpiel(int anzahlKugel, int anzahlKugelGesamt) {

		kugel = new int[anzahlKugel];

		this.anzahlKugelGesamt = anzahlKugelGesamt;

	}

	int[] generateRow(int anzahlKugelGesamt) {

		int[] row = new int[anzahlKugelGesamt];

		for (int i = 0; i < anzahlKugelGesamt;)

			row[i] = ++i;

		return row;

	}

	int[] removeOneNull(int[] oldRow) {

		int[] newRow = new int[oldRow.length - 1];

		int j = 0;

		for (int i = 0; i < oldRow.length; i++)

			if (oldRow[i] != 0)

				newRow[j++] = oldRow[i];

		return newRow;

	}

	void ziehen() {

		int[] row = generateRow(anzahlKugelGesamt);

		int gesamt = anzahlKugelGesamt;

		for (int i = 0; i < kugel.length; i++) {

			int random = (int) (Math.random() * gesamt);

			gesamt--;

			kugel[i] = row[random];

			row[random] = 0;

			row = removeOneNull(row);
		}

		Arrays.sort(kugel, 0, 7);

	}

	int getAnzahlKugelGesamt() {

		return anzahlKugelGesamt;

	}

	int[] getKugeln() {

		return kugel;

	}

	int vergleichen(LottoTipp tipp) {

		if (anzahlKugelGesamt != tipp.getAnzahlKugelGesamt() || kugel.length != tipp.getKugeln().length) {

			System.out.println("Dieser Tipp passt zu diesem Lotto nicht! ");

			return -1;

		}

		double gewinn = 0;

		for (int i = 0; i < kugel.length; i++)

			for (int j : tipp.getKugeln())

				if (kugel[i] == j)

					gewinn++;

		gewinn = Math.pow(10, --gewinn);

		return (int) gewinn;

	}

	public String toString() {

		String lottoSet = "";

		for (int i = 1; i < kugel.length; i++)

			lottoSet += ", " + kugel[i];

		return "Spiel " + kugel.length + " aus " + anzahlKugelGesamt + ". [" + kugel[0] + lottoSet + "]";
	}

}

class LottoTipp {

	private int[] kugel;
	private int anzahlKugelGesamt;

	LottoTipp(int anzahlKugel, int anzahlKugelGesamt) {

		kugel = new int[anzahlKugel];

		this.anzahlKugelGesamt = anzahlKugelGesamt;

	}

	void abgeben() {

		LottoSpiel lotto = new LottoSpiel(kugel.length, anzahlKugelGesamt);

		lotto.ziehen();

		kugel = lotto.getKugeln();

	}

	void eingeben() {

		System.out.println("Sie spielen Lotto " + kugel.length + " aus " + anzahlKugelGesamt
				+ "\nBitte den Tipp eingeben (durch Leerzeichen getrennt):\n");

		int[] kugel = new int[this.kugel.length];

		boolean granted;

		Scanner konsole, string;

		String next;

		for (;;) {

			granted = true;

			konsole = new Scanner(System.in);

			string = new Scanner(konsole.nextLine());

			if (granted) {

				for (int i = 0; i < this.kugel.length; i++) {

					if (string.hasNext()) {

						next = string.next();

						int number = checkForNatural(next);

						if (number < 1 || number > anzahlKugelGesamt) {

							System.out.println("Falsche Angabe! Versuchen Sie nochmals!");

							granted = false;

							break;

						}

						for (int j = 0; j < i; j++) {

							if (kugel[j] == number) {

								System.out.println("Die Zahlen dürfen sich nicht wiederholen! Versuchen Sie nochmals!");

								granted = false;

								break;

							}

						}

						if (!granted)

							break;

						kugel[i] = number;

					}

					else {

						granted = false;

						System.out.println("Sie haben zu wenig Zahlen angegeben! Versuchen Sie nochmals!");

						break;

					}

				}

				if (granted) {

					String check = "Sie haben angegeben:";

					for (int i : kugel)

						check += " " + i;

					System.out.println(check + "\nist das richtig (j/n)?");

					konsole = new Scanner(System.in);

					if (konsole.nextLine().equals("j")) {

						string.close();

						konsole.close();

						this.kugel = kugel;

						return;

					}

					else

						System.out.println("Ok versuchen Sie nochmals!");

				}

			}

		}

	}

	int checkForNatural(String string) {

		int number;

		try {

			number = Integer.parseInt(string);
		}

		catch (NumberFormatException e) {

			return -1;

		}

		return number;

	}

	int getAnzahlKugelGesamt() {

		return anzahlKugelGesamt;

	}

	int[] getKugeln() {

		return kugel;

	}

	long statistic(int count) {

		int result = 0;

		LottoSpiel lotto = new LottoSpiel(7, 49);

		for (int i = 9; i < count; i++) {

			lotto.ziehen();

			result += lotto.vergleichen(this);

		}

		return result;

	}

	public String toString() {

		String lottoSet = "";

		for (int i = 1; i < kugel.length; i++)

			lottoSet += ", " + kugel[i];

		return "Tipp " + kugel.length + " aus " + anzahlKugelGesamt + ". [" + kugel[0] + lottoSet + "]";
	}

}

public class LottoSpielSimulation {

	public static void main(String[] args) {

		LottoTipp tipp = new LottoTipp(7, 49);

//		tipp.abgeben();

		tipp.eingeben();

		System.out.println(tipp);

		System.out.println();

		LottoSpiel lotto = new LottoSpiel(7, 49);

		lotto.ziehen();

		System.out.println(lotto);

		System.out.println();

		System.out.println("Gewinn: " + lotto.vergleichen(tipp));

		System.out.println();

		int count = 100000;

		System.out.println("Diesen Tipp " + count + " mal durchlaufen zu lassen hat einen Gesamtgewinn "
				+ tipp.statistic(count) + " gebracht");

	}

}
