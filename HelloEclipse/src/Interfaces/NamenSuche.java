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

		value = this.nachname.compareTo(person.nachname);

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

	public static void main(String[] args) {

		Person[] list = { new Person("Paul", "Smith"), new Person("Paul", "Black"), new Person("John", "Smith"),
				new Person("John", "Black"), new Person("Paul", "Black", 1982), new Person("John", "Smith", 2000),
				new Person("John", "Smith", 1990) };

		System.out.println(print("Personen, unsortiert:\n---------------------", list));

		System.out.println();

		Arrays.sort(list);

		System.out.println(print("Personen, sortiert:\n-------------------", list));

		System.out.println();

		printFound(list, new Person("John", "Black"));

		System.out.println();

		Arrays.sort(list, Comparator.reverseOrder());

		System.out.println(print("Personen, rückwärts sortiert:\n-----------------------------", list));

		System.out.println();

		printFound(list, new Person("John", "Smith"));

	}

	static void printFound(Person[] list, Person search) {

		System.out.println(
				"Suche nach " + search + ": " + (Arrays.binarySearch(list, search) < 0 ? "nicht " : "") + "gefunden");

	}

	static String print(String title, Person[] list) {

		String out = "";
		if (title != null)
			out = title;

		for (Person person : list)
			out += '\n' + person.toString();

		return out;

	}

	static String print(Person[] list) {

		return print(null, list);

	}
}
