package main;

import java.util.Arrays;
import java.util.Comparator;

public class PesonenSortFormat {

	static final String[] SILBEN_NACHNAME = { "ber", "mar", "man", "rich", "sau", "tra", "un", "be", "dich", "berg",
			"stimm", "stub", "ger", "licht", "ner", "bert", "reb", "kopf", "tim", "er" };
	static final String[] SILBEN_VORNAME = { "tom", "as", "mar", "red", "rod", "rick", "be", "rich", "pet", "er" };
	static final int JAHR_MIN = 1920;
	static final int JAHR_MAX = 2019;
	static final int SILBEN_MIN = 2;
	static final int SILBEN_MAX = 4;
	static final int PERSONEN_COUNT = 10;

	static class PersonUtils {

		public static String generiereName(String[] silbenSet, int silbenAnzahl) {

			int randomSilbe;

			String[] name = new String[silbenAnzahl];

			for (int i = 0; i < silbenAnzahl;) {

				randomSilbe = (int) (Math.random() * silbenSet.length);

				if (i > 0) {

					int repeat = 0;

					for (int j = 0; j < i; j++)
						if (name[j].equals(silbenSet[randomSilbe]))
							repeat++;

					if (repeat > 0) {
						if ((Math.random()) <= (0.25 / repeat)) {
							if (name[i - 1].equals(silbenSet[randomSilbe])) {
								if (Math.random() <= 0.02)
									name[i++] = silbenSet[randomSilbe];
							}

							else
								name[i++] = silbenSet[randomSilbe];
						}

					} else
						name[i++] = silbenSet[randomSilbe];

				} else
					name[i++] = silbenSet[randomSilbe];

			}

			return stringArrayToName(name);

		}

		public static String generiereName(String[] silbenSet) {

			return generiereName(silbenSet, SILBEN_MIN + (int) (Math.random() * (SILBEN_MAX - SILBEN_MIN + 1)));

		}

		private static String stringArrayToName(String[] nameSet) {

			String name = "";

			nameSet[0] = nameSet[0].substring(0, 1).toUpperCase() + nameSet[0].substring(1);

			for (String silbe : nameSet)

				name += silbe;

			return name;

		}

		public static Person[] generatePersonen(int count) {

			if (count < 1)

				throw new IllegalArgumentException("Es soll minesten ein Person geben!");

			Person[] personen = new Person[count];

			for (int i = 0; i < personen.length; i++)
				personen[i] = new Person();

			return personen;

		}

		public static void printPersonen(Person[] personen) {

			printPerson("Nr.", "Vorname", "Nachname", "Geb.Jahr");
			printPerson("", "", "", "");

			for (int i = 0; i < personen.length; i++)
				printPerson(i + 1, personen[i].getVorname(), personen[i].getNachname(), personen[i].getGeburtsjahr());

		}

		private static void printPerson(String r1, String r2, String r3, String r4) {
			System.out.printf("|%4s |%18s |%18s |%9s |%n", r1, r2, r3, r4);
		}

		private static void printPerson(int r1, String r2, String r3, int r4) {
			System.out.printf("|  %02d |%18s |%18s |%9d |%n", r1, r2, r3, r4);
		}

	}

	static class Person implements Comparable<Person> {

		String nachname, vorname;

		int geburtsjahr;

		Person(String nachname, String vorname, int geburtsjahr) {

			if (geburtsjahr < 0)
				throw new IllegalArgumentException("Geburtsjahr falsch angegeben!");

			this.geburtsjahr = geburtsjahr;

			if (nachname == "" || nachname == null)
				this.nachname = PersonUtils.generiereName(SILBEN_NACHNAME);
			else
				this.nachname = nachname;

			if (vorname == "" || vorname == null)
				this.vorname = PersonUtils.generiereName(SILBEN_VORNAME);
			else
				this.vorname = vorname;

		}

		Person() {
			this(null, null);
		}

		Person(String nachname) {
			this(nachname, null);
		}

		Person(String nachname, String vorname) {
			this(nachname, vorname, JAHR_MIN + (int) (Math.random() * (JAHR_MAX - JAHR_MIN + 1)));
		}

		Person(String nachname, int geburtsjahr) {
			this(nachname, null, geburtsjahr);
		}

		Person(int geburtsjahr) {
			this(null, null, geburtsjahr);
		}

		public String getNachname() {
			return nachname;
		}

		public String getVorname() {
			return vorname;
		}

		public int getGeburtsjahr() {
			return geburtsjahr;
		}

		public int compareTo(Person person) {

			int value = this.nachname.compareTo(person.nachname);

			if (value != 0)
				return value;

			value = this.vorname.compareTo(person.vorname);

			if (value != 0)
				return value;

			return this.geburtsjahr - person.geburtsjahr;

		}
	}

	static class CompareBack implements Comparator<Person> {

		@Override
		public int compare(Person person1, Person person2) {
			return person2.compareTo(person1);
		}

	}

	public static void main(String[] args) {

		System.out.println("\nEine Liste von " + PERSONEN_COUNT + " Personen erstellen und ausgeben:\n");

		Person[] personen = PersonUtils.generatePersonen(PERSONEN_COUNT);
		PersonUtils.printPersonen(personen);

		System.out.println("\n\nDie Liste alphabetich anordnen und ausgeben:\n");

		Arrays.parallelSort(personen);
		PersonUtils.printPersonen(personen);

		System.out.println("\n\nDie Liste rückwärts alphabetich anordnen und ausgeben:\n");

		Arrays.parallelSort(personen, new CompareBack());
		PersonUtils.printPersonen(personen);

	}

}
