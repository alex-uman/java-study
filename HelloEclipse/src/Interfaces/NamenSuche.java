package Interfaces;

import java.util.Comparator;
import java.util.Arrays;

class Person implements Comparable<Person> {

	private String vorname, nachname;
	private int geburtsjahr;

	Person(String vorname, String nachname, int geburtsjahr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}

	Person(String vorname, String nachname) {
		this(vorname, nachname, -1);
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	@Override
	public int compareTo(Person person) {

		int value = this.nachname.compareTo(person.nachname);

		if (value != 0)
			return value;

		value = this.vorname.compareTo(person.vorname);

		if (value != 0)
			return value;

		return this.geburtsjahr - person.geburtsjahr;

	}

	@Override
	public String toString() {
		return vorname + " " + nachname + (geburtsjahr > -1 ? ", geboren " + geburtsjahr : "");
	}

}

public class NamenSuche {

	static class CompareBack implements Comparator<Person> {

		@Override
		public int compare(Person person1, Person person2) {
			return person2.compareTo(person1);
		}

	}

	public static void main(String[] args) {

		Person[] list = { new Person("Paul", "Smith"), new Person("Paul", "Black", 1982),
				new Person("John", "Smith", 2000), new Person("John", "Smith", 1990), new Person("Paul", "Black"),
				new Person("John", "Smith"), new Person("John", "Black") };

		System.out.println();
		print("Personen, unsortiert:\n---------------------", list);
		System.out.println();

		Arrays.sort(list);

		System.out.println();
		print("Personen, sortiert:\n-------------------", list);
		System.out.println();

		System.out.println();
		printFound(list, new Person("John", "Black"));
		System.out.println();

		printFound(list, new Person("Johan", "Black"));
		System.out.println();

		printFound(list, new Person("", "Black"));
		System.out.println();

		printFound(list, new Person("John", "Blackes"));
		System.out.println();

		printFound(list, new Person("Paul", "Black"));
		System.out.println();

		printFound(list, new Person("Paul", "Black", 1982));
		System.out.println();

		printFound(list, new Person("Paul", "Black", 1983));
		System.out.println();

		printFound(list, new Person("John", "Smith"));
		System.out.println();

		Comparator<Person> reverce = new CompareBack();

		Arrays.sort(list, reverce);

//		Arrays.sort(list, Comparator.reverseOrder());

		System.out.println();
		print("Personen, rückwärts sortiert:\n-----------------------------", list);
		System.out.println();

		System.out.println();
		printFound(list, new Person("John", "Black"), reverce);
		System.out.println();

		printFound(list, new Person("Johan", "Black"), reverce);
		System.out.println();

		printFound(list, new Person("", "Black"), reverce);
		System.out.println();

		printFound(list, new Person("John", "Blackes"), reverce);
		System.out.println();

		printFound(list, new Person("Paul", "Black"), reverce);
		System.out.println();

		printFound(list, new Person("Paul", "Black", 1982), reverce);
		System.out.println();

		printFound(list, new Person("Paul", "Black", 1983), reverce);
		System.out.println();

		printFound(list, new Person("John", "Smith"), reverce);

	}

	static void printFound(Person[] list, Person search, Comparator<Person> compare) {

		System.out.println("Suche nach " + search + ": "
				+ (compare != null ? (Arrays.binarySearch(list, search, compare) < 0 ? "nicht " : "")
						: (Arrays.binarySearch(list, search) < 0 ? "nicht " : ""))
				+ "gefunden");

	}

	static void printFound(Person[] list, Person search) {

		printFound(list, search, null);
	}

	static void print(String title, Person[] list) {

		String out = "";
		if (title != null)
			out = title;

		for (Person person : list)
			out += '\n' + person.toString();

		System.out.println(out);

	}

	static void print(Person[] list) {

		print(null, list);

	}
}
