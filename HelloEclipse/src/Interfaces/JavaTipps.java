package Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class JavaTipp {

	private String tipp;
	private ArrayList<String> themen = new ArrayList<>();

	JavaTipp(String tipp, String thema1) {
		this(tipp, thema1, "", "");
	}

	JavaTipp(String tipp, String thema1, String thema2) {
		this(tipp, thema1, thema2, "");
	}

	JavaTipp(String tipp, String thema1, String thema2, String thema3) {

		checkMandatoryTipp(tipp);

		this.tipp = tipp;

		this.addThema(thema1);
		this.addThema(thema2);
		this.addThema(thema3);

		this.checkThemen();

	}

	public ArrayList<String> getThemen() {
		return themen;
	}

	public String getTipp() {
		return tipp;
	}

	public String toString() {
		return tipp;
	}

	private void addThema(String thema) {
		if (!thema.isBlank())
			this.getThemen().add(thema);
	}

	private void checkThemen() {
		if (this.getThemen().size() == 0)
			throw new IllegalArgumentException("Ein Tipp muß mindestens zu einem Thema zugeordnet werden!");
	}

	private void checkMandatoryTipp(String tipp) {
		if (tipp.isBlank())
			throw new IllegalArgumentException("Ein Tipp darf nicht leer sein!");
	}

}

public class JavaTipps {

	public static void main(String[] args) {

		JavaTipp[] tipps = {
				new JavaTipp("Mit dem Schlüsselwort 'implements' kann eine Klasse ein Interface realisieren.",
						"Vererbung", "Klassen", "Interfaces"),
				new JavaTipp("Eine Klasse kann nur eine andere Klasse erweitern.", "Vererbung", "Klassen"),
				new JavaTipp("Statische Methoden werden mit dem Klassennamen aufgerufen.", "Klassen", "Methoden",
						"static"),
				new JavaTipp("Alle Attribute in einem neuen Objekt werden im Konstruktor initialisiert.", "Klassen",
						"Konstruktoren", "Attribute"),
				new JavaTipp("Beim Überschreiben darf die Sichtbarkeit nicht verschärft werden.", "Klassen", "Methoden",
						"Überschreiben"),
				new JavaTipp("Alle Elemente in einem Interface sind immer 'public'.", "Interfaces", "Sichtbarkeiten") };

		Predicate<JavaTipp> param;

//		
//		###### A3
//		

		System.out.println();
		System.out.println("###### A3");
		System.out.println("---------");
		System.out.println();
		System.out.println("Alle Tipps");
		System.out.println("----------");

		Predicate<JavaTipp> alleTipps = i -> true;
		param = alleTipps;
		search(tipps, param);
		System.out.println();

//		
//		###### A4
//		

		System.out.println();
		System.out.println("###### A4");
		System.out.println("---------");
		System.out.println();
		System.out.println("Tipp etnhält 'Klasse'");
		System.out.println("---------------------");

		Predicate<JavaTipp> enthaeltKlasse = i -> i.getTipp().contains("Klasse");
		param = enthaeltKlasse;
		search(tipps, param);
		System.out.println();

//		
//		###### A5
//		

		System.out.println();
		System.out.println("###### A5");
		System.out.println("---------");
		System.out.println();
		System.out.println("Mit 2 Themen");
		System.out.println("------------");

		Predicate<JavaTipp> zweiThemen = i -> i.getThemen().size() == 2;
		param = zweiThemen;
		search(tipps, param);
		System.out.println();

//		
//		###### A6
//		

		System.out.println();
		System.out.println("###### A6");
		System.out.println("---------");
		System.out.println();
		System.out.println("Mit Thema 'Klassen'");
		System.out.println("-------------------");

		Predicate<JavaTipp> themaKlassen = i -> i.getThemen().contains("Klassen");
		param = themaKlassen;
		search(tipps, param);
		System.out.println();

//		
//		###### A7
//		

		System.out.println();
		System.out.println("###### A7");
		System.out.println("---------");
		System.out.println();
		System.out.println("Mit Thema 'Klassen', aber ohne Thema 'Vererbung'");
		System.out.println("------------------------------------------------");

		Predicate<JavaTipp> notThemaVererbung = i -> !i.getThemen().contains("Vererbung");
		param = themaKlassen.and(notThemaVererbung);
		search(tipps, param);
		System.out.println();

//		
//		###### A8
//		

		System.out.println();
		System.out.println("###### A8");
		System.out.println("---------");
		System.out.println();
		System.out.println("Ethält Apostroph");
		System.out.println("----------------");

		Predicate<JavaTipp> enthaeltApostroph = i -> i.getTipp().contains("'");
		param = enthaeltApostroph;
		search(tipps, param);
		System.out.println();

		System.out.println();
		System.out.println("Keine 'Klasse' niergenwo");
		System.out.println("------------------------");

		Predicate<JavaTipp> keineKlasse = i -> !i.getTipp().contains("Klasse") && !i.getThemen().contains("Klasse");
		param = keineKlasse;
		search(tipps, param);
		System.out.println();

	}

	static void search(JavaTipp[] tipps, Predicate<JavaTipp> param) {

		ArrayList<JavaTipp> filtered = new ArrayList<>();

		for (JavaTipp i : tipps)
			if (param.test(i))
				filtered.add(i);

		if (filtered.size() == 0)
			System.out.println("Nix gefunden!");
		else
			printList(filtered);

	}

	static void printList(List list) {

		list.forEach(i -> System.out.println("\n" + i));
	}

}
