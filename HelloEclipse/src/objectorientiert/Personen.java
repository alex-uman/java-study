package objectorientiert;

class Person {

	private String vorname = "-unbekannt-";
	private String nachname;
	private int geburtsjahr = -1;
	private int plz = -1;

	Person(String vorname, String nachname, int geburtsjahr, int plz) {

		if (vorname == null || vorname.isEmpty())
			throw new IllegalArgumentException("Es mus ein Vorname existieren!");

		if (nachname == null || nachname.isEmpty())
			throw new IllegalArgumentException("Es mus ein Nachname existieren!");

		if (geburtsjahr < 0)
			throw new IllegalArgumentException("Das Geburtsjahr kann nicht negativ sein!");

		if (plz < 10000 || plz > 99999)
			throw new IllegalArgumentException("PLZ soll 5-stellig sein!");

		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
		this.plz = plz;

	}

	Person(String vorname, String nachname, int geburtsjahr) {

		if (vorname == null || vorname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Vorname existieren!");

		if (nachname == null || nachname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Nachname existieren!");

		if (geburtsjahr < 0)
			throw new IllegalArgumentException("Das Geburtsjahr kann nicht negativ sein!");

		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;

	}

	Person(String nachname, int geburtsjahr) {

		if (nachname == null || nachname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Nachname existieren!");

		if (geburtsjahr < 0)
			throw new IllegalArgumentException("Das Geburtsjahr kann nicht negativ sein!");

		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;

	}

	Person(String vorname, String nachname) {

		if (vorname == null || vorname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Vorname existieren!");

		if (nachname == null || nachname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Nachname existieren!");

		this.vorname = vorname;
		this.nachname = nachname;

	}

	Person(String nachname) {

		if (nachname == null || nachname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Nachname existieren!");

		this.nachname = nachname;

	}

	public String toString() {

		return (vorname == "-unbekannt-" ? "" : vorname + " ") + nachname
				+ (geburtsjahr == -1 ? "" : ", Geburtsjahr: " + geburtsjahr) + (plz == -1 ? "" : ", PLZ: " + plz);

	}

	public boolean equals(Object compare) {

		Person person = (Person) compare;

		return vorname.equals(person.vorname) && nachname.contentEquals(person.nachname)
				&& geburtsjahr == person.geburtsjahr && plz == person.plz;

	}

	public String getVorname() {

		return vorname;

	}

	public String getNachname() {

		return nachname;

	}

	public int getgeburtsjahr() {

		return geburtsjahr;

	}

	public int getPLZ() {

		return plz;

	}

	public void setVorname(String vorname) {

		if (vorname == null || vorname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Vorname existieren!");

		this.vorname = vorname;

	}

	public void setNachname(String nachname) {

		if (nachname == null || nachname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Nachname existieren!");

		this.nachname = nachname;

	}

	public void setGeburtsjahr(int geburtsjahr) {

		if (geburtsjahr < 0)
			throw new IllegalArgumentException("Das Geburtsjahr kann nicht negativ sein!");

		this.geburtsjahr = geburtsjahr;

	}

	public void setPLZ(int plz) {

		if (plz < 10000 || plz > 99999)
			throw new IllegalArgumentException("PLZ soll 5-stellig sein!");

		this.plz = plz;

	}

}

public class Personen {

	public static void main(String[] args) {

		Person p1 = new Person("Dietrich", "Humboldt", 1992, 43128);
		Person p2 = new Person("Dietrich", "Humboldt", 1992, 43128);
		Person p3 = new Person("Mayer", 1965);

		printCompare(p1, p2);

		System.out.println();
		System.out.println();

		printCompare(p1, p3);

		System.out.println();
		System.out.println();

		System.out.println(getMusterman());

	}

	public static void printCompare(Person pA, Person pB) {

		System.out.println(pA);
		System.out.println("und");
		System.out.println(pB);
		System.out.println();
		System.out
				.println(pA.equals(pB) ? "scheinen eine Person zu sein" : "sind offensichtlich verschiedene Personen");

	}

	public static Person getMusterman() {

		Person person = new Person("Max", "Mustermann", 1960, 12345);

		return person;

	}

}
