package arrays;

class Hafen {

	private String name;
	private Schiff[] besetzt = new Schiff[100];

	Hafen(String name) {

		this.name = name;

	}

	int getFree() {

		for (int i = 0; i < 100; i++) {

			if (besetzt[i] == null)

				return 100 - i;

		}

		return 0;

	}

	boolean checkSchiff(Schiff schiff) {

		for (int i = 0; i < 100; i++) {

			if (besetzt[i] == null)

				return false;

			if (besetzt[i].getName() == schiff.getName())

				return true;

		}

		return false;
	}

	boolean checkSchiff(String schiff) {

		for (int i = 0; i < 100; i++) {

			if (besetzt[i] == null)

				return false;

			if (besetzt[i].getName() == schiff)

				return true;

		}

		return false;
	}

//	boolean checkFreeSlot(int number) {
//
//		return (besetzt[number] == null);
//
//	}

	void addSchiff(Schiff schiff) {

		if (checkSchiff(schiff)) {

			System.out.println(
					schiff + " steht bereits in dem Hafen " + name + " und kann nicht nochmalls hinzugefügt werden!");

			return;

		}

		for (int i = 0; i < 100; i++) {

			if (besetzt[i] == null) {

				besetzt[i] = new Schiff();
				besetzt[i] = schiff;

				int frei = 99 - i;

				System.out.println(besetzt[i] + " steht jetzt in dem Hafen " + name + ". Es sind "
						+ ((frei > 0) ? "noch " + frei + " Plätze frei" : "keine freie Plätze in dem Hafen mehr!"));

				return;

			}

		}

		System.out.println(("Der Hafen " + name + " ist voll und kann keine neuen Schiffe empfangen!"));

	}

	void addSchiff(String schiff) {

		if (checkSchiff(schiff)) {

			System.out.println("Das Schiff namens '" + schiff + "' steht bereits in dem Hafen " + name
					+ " und kann nicht nochmalls hinzugefügt werden!");

			return;

		}

		for (int i = 0; i < 100; i++) {

			if (besetzt[i] == null) {

				besetzt[i] = new Schiff(schiff);

				int frei = 99 - i;

				System.out.println(besetzt[i] + " steht jetzt in dem Hafen " + name + ". Es sind "
						+ ((frei > 0) ? "noch " + frei + " Plätze frei" : "keine freie Plätze in dem Hafen mehr!"));

				return;

			}

		}

		System.out.println(("Der Hafen " + name + " ist voll und kann keine neuen Schiffe empfangen!"));

	}

	void addSchiff() {

		for (int i = 0; i < 100; i++) {

			if (besetzt[i] == null) {

				besetzt[i] = new Schiff("?");

				int frei = 99 - i;

				System.out.println(besetzt[i] + " steht jetzt in dem Hafen " + name + ". Es sind "
						+ ((frei > 0) ? "noch " + frei + " Plätze frei" : "keine freie Plätze in dem Hafen mehr!"));

				return;

			}

		}

		System.out.println(("Der Hafen " + name + " ist voll und kann keine neuen Schiffe empfangen!"));

	}

	void report() {

		int free = getFree();

		System.out.println("Hafen " + name + " (Schiffe: " + (100 - free) + ". Freie Plätze: " + free + ")");

		if (free == 100)

			return;

		System.out.println();
		System.out.println("Schiffe im Hafen:");
		System.out.println();

		for (int i = 0; i < 100; i++) {

			if (besetzt[i] == null)

				return;

			System.out.println((i + 1) + ". " + besetzt[i]);

		}

	}

}

class Schiff {

	private String name;

	Schiff(String name) {

		this.name = name;

	}

	Schiff() {

		name = "?";
	}

	public String toString() {

		return (name == "?") ? "Ein unbekantes Schiff" : "Das Schiff namens '" + name + "'";

	}

	void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return name;

	}

}

public class Schiffe {

	public static void main(String[] args) {

		Hafen aHafen = new Hafen("Braunstock");

		Schiff aSchiff1 = new Schiff("Santa Anette");
		Schiff aSchiff2 = new Schiff();

		aHafen.addSchiff(aSchiff1);
		aHafen.addSchiff(aSchiff2);
		aHafen.addSchiff("Blaue Ente");
		aHafen.addSchiff("AG-128-5D");
		aHafen.addSchiff();
		aHafen.addSchiff();
		aHafen.addSchiff();
		aHafen.addSchiff();
		aHafen.addSchiff();
		aHafen.addSchiff();
		aHafen.addSchiff();
		aHafen.addSchiff();
		aHafen.addSchiff("AG-128-5D");
		aHafen.addSchiff(aSchiff1);

		System.out.println();
		System.out.println();

		aHafen.report();

	}

}
