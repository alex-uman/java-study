package vererbung;

class Person {

	private String name, id;

	Person(String name, String id) {

		this.name = name;
		this.id = id;

	}

	Person(String name) {

		this(name, null);

	}

	void setID(String id) {

		this.id = id;

	}

	String getName() {

		return name;

	}

	String getID() {

		return id;

	}

	public String toString() {

		String string = "Name: " + name;

		if (id != null)

			string += ", ID: " + id;

		return string;

	}

}

class Dozent extends Person {

	Dozent(String name, String id) {

		super(name, id);

	}

	Dozent(String name) {

		super(name, null);

	}

	@Override
	public String toString() {

		return "Dozent:\n" + super.toString();

	}

}

class Teilnehmer extends Person {

	Teilnehmer(String name, String id) {

		super(name, id);

	}

	Teilnehmer(String name) {

		super(name, null);

	}

	@Override
	public String toString() {

		return "Teilnehmer:\n" + super.toString();

	}
}

class Lerngruppe {

	private int kurs;
	private Dozent dozent;
	private Teilnehmer[] teilnehmer = new Teilnehmer[12];

	Lerngruppe(int kurs) {

		this.kurs = kurs;

	}

	void setDozent(Dozent dozent) {

		this.dozent = dozent;

	}

	int checkForEmpty() {

		for (int i = 0; i < this.teilnehmer.length; i++)

			if (this.teilnehmer[i] == null)

				return i;

		return -1;

	}

	void addTeilnehmer(Teilnehmer teilnehmer) {

		int number = this.checkForEmpty();

		if (number >= 0)

			this.teilnehmer[number] = teilnehmer;

		else

			System.out.println("Die Gruppe ist bereits voll!");

	}

	void addTeilnehmer(String name, String id) {

		this.addTeilnehmer(new Teilnehmer(name, id));

	}

	void addTeilnehmer(String name) {

		this.addTeilnehmer(name, null);

	}

}

public class JavaKurs {

	public static void main(String[] args) {

		Dozent d1 = new Dozent("Dieter Krause");
		d1.setID("125");

		System.out.println(d1);

	}

}
