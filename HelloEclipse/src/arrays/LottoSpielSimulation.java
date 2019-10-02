package arrays;

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

	int getAnzahlKugelGesamt() {

		return anzahlKugelGesamt;

	}

	int[] getKugeln() {

		return kugel;

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

		LottoSpiel lotto = new LottoSpiel(7, 49);

		lotto.ziehen();

		System.out.println(lotto);

		LottoTipp tipp = new LottoTipp(7, 49);

		tipp.abgeben();

		System.out.println(tipp);

		System.out.println("Gewinn: " + lotto.vergleichen(tipp));

	}

}
