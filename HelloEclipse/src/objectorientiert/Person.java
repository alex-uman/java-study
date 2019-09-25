package objectorientiert;

public class Person {

	private String vorname = "-unbekannt-";
	private String nachname;
	private int geburtsjahr = -1;
	private int plz = -1;

	Person() {
	}

	Person(String vorname, String nachname, int geburtsjahr, int plz) {

		this(vorname, nachname, geburtsjahr);

		if (plz < 10000 || plz > 99999)
			throw new IllegalArgumentException("PLZ soll 5-stellig sein!");

		this.plz = plz;

	}

	Person(String vorname, String nachname, int geburtsjahr) {

		this(vorname, nachname);

		if (geburtsjahr < 0)
			throw new IllegalArgumentException("Das Geburtsjahr kann nicht negativ sein!");

		this.geburtsjahr = geburtsjahr;

	}

	Person(String nachname, int geburtsjahr) {

		this(nachname);

		if (geburtsjahr < 0)
			throw new IllegalArgumentException("Das Geburtsjahr kann nicht negativ sein!");

		this.geburtsjahr = geburtsjahr;

	}

	Person(String vorname, String nachname) {

		this(nachname);

		if (vorname == null || vorname.isEmpty())
			throw new IllegalArgumentException("Es muss ein Vorname existieren!");

		this.vorname = vorname;

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

	public int getGeburtsjahr() {

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

	public static PersonBuilder newPersonBuilder() {

		return new Person().new PersonBuilder();

	}

	public class PersonBuilder {

		private PersonBuilder() {

		}

		public PersonBuilder vorname(String vorname) {

			Person.this.vorname = vorname;
			return this;

		}

		public PersonBuilder nachname(String nachname) {

			Person.this.nachname = nachname;
			return this;

		}

		public PersonBuilder geburtsjahr(int geburtsjahr) {

			Person.this.geburtsjahr = geburtsjahr;
			return this;

		}

		public PersonBuilder plz(int plz) {

			Person.this.plz = plz;
			return this;

		}

		public Person build() {

			return Person.this;

		}

	}

	public static void main(String[] args) {

		Person person1 = new Person("Dietrich", "Humboldt", 1992, 43128);
		Person person2 = new Person("Dietrich", "Humboldt", 1992, 43128);
		Person person3 = new Person("Mayer", 1965);

		printCompare(person1, person2);

		System.out.println();
		System.out.println();

		printCompare(person1, person3);

		System.out.println();
		System.out.println();

		System.out.println(getMusterman());

		Person p = Person.newPersonBuilder().vorname("John").nachname("Doe").geburtsjahr(1987).build();

		System.out.println();
		System.out.println();
		System.out.println(p);

	}

	public static void printCompare(Person personA, Person personB) {

		System.out.println(personA);
		System.out.println("und");
		System.out.println(personB);
		System.out.println();
		System.out.println(
				personA.equals(personB) ? "scheinen eine Person zu sein" : "sind offensichtlich verschiedene Personen");

	}

	public static Person getMusterman() {

		Person person = new Person("Max", "Mustermann", 1960, 12345);

		return person;

	}

}
