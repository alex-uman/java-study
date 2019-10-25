
package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Sportart implements Comparable<Sportart> {
	private String name;
	private Boolean olympisch;

	Sportart(String name, Boolean olympisch) {
		this.name = name;
		this.olympisch = olympisch;
	}

	Sportart(String name) {
		this(name, false);
	}

	public String getName() {
		return name;
	}

	public Boolean getOlympisch() {
		return olympisch;
	}

	public String toString() {
		return name + " ist " + (olympisch ? "" : "nicht ") + "olympisch";
	}

	@Override

	public boolean equals(Object compare) {

		if (!(compare instanceof Sportart)) {
			return false;
		}

		Sportart newOne = (Sportart) compare;

		return this.name.equals(newOne.getName()) && this.olympisch.equals(newOne.getOlympisch());

	}

	@Override

	public int compareTo(Sportart compare) {

		int value = this.name.compareTo(compare.getName());

		if (value != 0)
			return value;

		return this.olympisch.compareTo(compare.getOlympisch());

	}

}

public class ArrayListUebung {

	public static void main(String[] args) {

//
//		A1
//		

		System.out.println();
		System.out.println(
				"###### A1.\n\nEine ArrayList mit 20 zufälligen Integer aus dem Bereich [-100 ... 100] erzeugen\nund die Elemente der Liste durchnummeriert untereinander ausgeben:");
		System.out.println();

		ArrayList<Integer> listA1 = new ArrayList<>();

		for (int i = 0; i < 20; i++)
			listA1.add((int) (Math.random() * 201) - 100);

		for (int i = 0; i < listA1.size(); i++)
			System.out.printf("%4s%5d%n", ("N." + (i + 1)), listA1.get(i));

//
//		A2		
//		

		System.out.println();
		System.out.println();
		System.out.println(
				"###### A2.\n\nEine ArrayList mit folgenden Strings: \"mo\", \"di\", \"mi\", \"o\", \"fr\" erzeugen\nund die Elemente der Liste mit der foreach-Schleife ausgeben:");
		System.out.println();

		ArrayList<String> listA2 = new ArrayList<>();

		listA2.add("mo");
		listA2.add("di");
		listA2.add("mi");
		listA2.add("do");
		listA2.add("fr");

		for (String day : listA2)
			System.out.println(day);

//
//		A3		
//		

		System.out.println();
		System.out.println();
		System.out.println(
				"###### A3.\n\nEine ArrayList mit folgenden Werten: 10, 20, 30, 40, 50, 60, 70, 80. erzeugen\nund jedes zweite Element der Liste ausgeben:");
		System.out.println();

		ArrayList<Integer> listA3 = new ArrayList<>();

		for (int i = 10; i < 81; i += 10)
			listA3.add(i);

		for (int i = 0; i < listA3.size(); i++)
			System.out.println(listA3.get(++i));

//
//		A4		
//		

		System.out.println();
		System.out.println();
		System.out.println(
				"###### A4.\n\nEine ArrayList mit folgenden Werten: 10, 20, 30, 40, 50, 60, 70, 80. erzeugen\nund die Elemete der Liste rückwärts ausgeben:");
		System.out.println();

		for (int i = listA3.size() - 1; i > -1; i--)
			System.out.println(listA3.get(i));

//
//		A5		
//		

		System.out.println();
		System.out.println();
		System.out.println(
				"###### A5.\n\nEine ArrayList mit 20 zufälligen Integer aus dem Bereich [-100 ... 100] erzeugen,\ndie Liste sortieren und ausgeben:");
		System.out.println();

		ArrayList<Integer> listA5 = new ArrayList<>();

		for (int i = 0; i < 20; i++)
			listA5.add((int) (Math.random() * 201) - 100);

		Collections.sort(listA5);

		for (int i : listA5)
			System.out.printf("%4d%n", i);

//
//		A6		
//		

		System.out.println();
		System.out.println();
		System.out.println(
				"###### A6.\n\nEine ArrayList mit 20 zufälligen Integer aus dem Bereich [10 ... 15] erzeugen,\nmit `indexOf` nach dem Wert 12 suchen und alles ausgeben:");
		System.out.println();

		ArrayList<Integer> listA6 = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			listA6.add((int) (Math.random() * 6) + 10);

		for (int i : listA6)
			System.out.printf("%3d%n", i);

		int index = listA6.indexOf(12);

		System.out.println();
		System.out.println(index < 0 ? "Es gibt keine 12 in dieser Liste!"
				: "12 befindet sich in dieser Liste " + (index == listA6.lastIndexOf(12) ? "" : "zum ersten Mal ")
						+ "am " + (++index) + ". Platz");

//
//		A7		
//	

		System.out.println();
		System.out.println();
		System.out.println(
				"###### A7.\n\nEine ArrayList mit 10 zufälligen Integer aus dem Bereich [0 ... 50] erzeugen,\nmit `Collections.binarySearch` nach dem Wert 12 suchen und alles ausgeben:");
		System.out.println();

		ArrayList<Integer> listA7 = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			listA7.add((int) (Math.random() * 51));

		for (int i : listA7)
			System.out.printf("%3d%n", i);

		index = Collections.binarySearch(listA7, 12);

		System.out.println();
		System.out.println(index < 0 ? "Es gibt keine 12 in dieser Liste!"
				: "12 befindet sich in dieser Liste zum ersten Mal (falls mehrmals) " + "am " + (++index) + ". Platz");

//
//		A8		
//	

		System.out.println();
		System.out.println();
		System.out.println(
				"###### A8.\n\nEine ArrayList mit 10 zufälligen Integer aus dem Bereich [0 ... 50] erzeugen,\nund ausgeben:");
		System.out.println();

		ArrayList<Integer> listA8 = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			listA8.add((int) (Math.random() * 51));

		for (int i : listA8)
			System.out.printf("%3d%n", i);

		System.out.println();
		System.out.println("Die ungeraden Werte mit `remove(int)` entfernen\nund die Liste ausgeben:");
		System.out.println();

		for (int i = listA8.size() - 1; i > -1; i--)
//			if ((double) (listA8.get(i) / 2) != (double) listA8.get(i) / 2)
			if (listA8.get(i) % 2 != 0)
				listA8.remove(i);

		for (int i : listA8)
			System.out.printf("%3d%n", i);

//
//		A9		
//	

		System.out.println();
		System.out.println();
		System.out.println(
				"###### A9.\n\nEine ArrayList mit 10 zufälligen Integer aus dem Bereich [0 ... 50] erzeugen,\nund ausgeben:");
		System.out.println();

		ArrayList<Integer> listA9 = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			listA9.add((int) (Math.random() * 51));

		for (int i : listA9)
			System.out.printf("%3d%n", i);

		System.out.println();
		System.out.println("Die ungeraden Werte mit `set`\ndurch 0 ersetzen und die Liste ausgeben:");
		System.out.println();

		for (int i = 0; i < listA9.size(); i++)
			if (listA9.get(i) % 2 != 0)
				listA9.set(i, 0);

		for (int i : listA9)
			System.out.printf("%3d%n", i);

//
//		A10		
//	

		System.out.println();
		System.out.println();
		System.out.println("###### A10.\n\nEine ArrayList von der Klasse Sportart erstellen und ausgeben:");
		System.out.println();

		ArrayList<Sportart> listA10 = new ArrayList<>();

		listA10.add(new Sportart("Domino"));
		listA10.add(new Sportart("Schwimmen", true));
		listA10.add(new Sportart("Schachspielen", false));
		listA10.add(new Sportart("Fechten", true));
		listA10.add(new Sportart("Reiten", true));

		for (Sportart i : listA10)
			System.out.println(i);

		System.out.println();
		System.out.println("Mit der Methode `contains` nach `Ringen` suchen:");
		System.out.println();

		Sportart ringen = new Sportart("Schachspielen", false);

		System.out.println(listA10.contains(ringen));

		System.out.println(Collections.binarySearch(listA10, ringen));

//
//		A11		
//		

		System.out.println();
		System.out.println();
		System.out.println("###### A11.");
		System.out.println();

		ArrayList<String> listA11 = new ArrayList<>();

		listA11.add("mo");
		listA11.add("fr");
		listA11.add("di");
		listA11.add("fr");
		listA11.add("mi");
		listA11.add("fr");
		listA11.add("do");
		listA11.add("fr");

		for (String i : listA11)
			System.out.println(i);

		while (listA11.remove("fr")) {
		}

		System.out.println();
		for (String i : listA11)
			System.out.println(i);

//
//		A12		
//		

		System.out.println();
		System.out.println();
		System.out.println("###### A12.");
		System.out.println();

		ArrayList<int[]> listA12 = new ArrayList<>();

		listA12.add(new int[] { 1, 2, 3 });
		listA12.add(new int[] { -7, -5 });
		listA12.add(new int[] { 101, 202, 303 });

		for (int[] i : listA12)
			System.out.println(Arrays.toString(i));

	}

}
