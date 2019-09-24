package Objectorientiert;

class Rechteck {

	int breite, hoehe;

	public String toString() {

		return "Rechteck (" + breite + " X " + hoehe + ")";

	}

	void random(int von, int bis) {

		double rndm = Math.random();
		breite = (int) (von * (1.0 - rndm) + bis * rndm);

		rndm = Math.random();
		hoehe = (int) (von * (1.0 - rndm) + bis * rndm);

	}

	void set(int breite, int hoehe) {

		this.breite = breite;
		this.hoehe = hoehe;

	}

	static void set(Rechteck rechteck, int breite, int hoehe) {

		rechteck.breite = breite;
		rechteck.hoehe = hoehe;

	}

}

class Kreis {

	int radius;

	public String toString() {

		return "Kreis. R = " + radius;

	}

}

public class Geometrie {

	public static void main(String[] args) {

		Rechteck[] rechtecks = new Rechteck[100];

		randomRechtecks(rechtecks, 1, 20);
		printRechtecks(rechtecks);

		System.out.println();
		System.out.println();

		rechtecks[3].set(8, 5);
		System.out.println(rechtecks[3]);

		System.out.println();

		Rechteck.set(rechtecks[7], 9, 2);
		System.out.println(rechtecks[7]);

		Kreis kreis = new Kreis();

		kreis.radius = 5;

		System.out.println();
		System.out.println();
		
		System.out.println(kreis);

	}

	static void randomRechtecks(Rechteck[] rechtecks, int von, int bis) {

		if (von > bis) {

			int tmp = bis;
			bis = von;
			von = tmp;
		}

		int n = rechtecks.length;

		for (int i = 0; i < n; i++) {

			rechtecks[i] = new Rechteck();
			rechtecks[i].random(von, bis);

		}

	}

	static void printRechtecks(Rechteck[] rechtecks) {

		int n = rechtecks.length;

		for (int i = 0; i < n; i++) {

			System.out.println((i + 1) + ". " + rechtecks[i]);

		}

	}

}
