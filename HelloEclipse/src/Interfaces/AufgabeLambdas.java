package Interfaces;

import java.util.*;

public class AufgabeLambdas {

	public interface IntOperation {
		int execute(int x, int y);
	}

	static class Sum implements IntOperation {
		public int execute(int x, int y) {
			return x + y;
		}
	}

	static class Max implements IntOperation {
		public int execute(int x, int y) {
			return x < y ? y : x;
		}
	}

	public interface CompString extends Comparator<String> {

		public int compare(String s1, String s2);

	}

	public interface ListPair {
		List<Integer> accept(List<Integer> list1, List<Integer> list2);
	}

	interface Processor {
		String getCPU(CPU cpu);
	}

	static class CPU {

		private int anzahlKerne;
		private String hersteller;

		CPU(int anzahlKerne, String hersteller) {
			this.anzahlKerne = anzahlKerne;
			this.hersteller = hersteller;
		}

		public String getHersteller() {
			return hersteller;
		}

		public int getAnzahlKerne() {
			return anzahlKerne;
		}

//		public String toString() {
//			return "CPU " + hersteller + ", " + anzahlKerne + " Kerne";
//		}

	}

	public static void main(String[] args) {

//		
//		Aufgabe A1
//

		System.out.println();
		System.out.println("***** A1 *****");
		System.out.println();

		IntOperation op1 = new Sum();
		System.out.println(op1.execute(2, 3));

		IntOperation op2 = (x, y) -> x + y;
		System.out.println(op2.execute(2, 3));

		IntOperation op3 = new Max();
		System.out.println(op3.execute(-6, 17));

		IntOperation op4 = (x, y) -> x < y ? y : x;
		System.out.println(op4.execute(-6, 17));

//		
//		Aufgabe A2
//

		System.out.println();
		System.out.println();
		System.out.println("***** A2 *****");
		System.out.println();

		System.out.println("String List erstellen:");
		System.out.println();

		ArrayList<String> strings = new ArrayList<>(
				Arrays.asList("rewerew", "teteteew", "thrtzedw", "hrfzr", "aqrfwr"));

		printAL(strings);

		System.out.println();
		System.out.println("List nach Stringlänge aufsteigend sortieren:");
		System.out.println();

		CompString cmp = (x, y) -> x.length() - y.length();

		Collections.sort(strings, cmp);

		printAL(strings);

		System.out.println();
		System.out.println("List nach Stringlänge absteigend sortieren:");
		System.out.println();

		cmp = (x, y) -> y.length() - x.length();

		Collections.sort(strings, cmp);

		printAL(strings);

//		
//		Aufgabe A3
//

		System.out.println();
		System.out.println();
		System.out.println("***** A3 *****");
		System.out.println();

		System.out.println("List-1:");
		System.out.println();

		List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 33));

		printAL(list1);

		System.out.println();
		System.out.println();
		System.out.println("List-2:");
		System.out.println();

		List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 36, 754));

		printAL(list2);

		System.out.println();
		System.out.println();
		System.out.println("List-3 = List-1 + List-2:");
		System.out.println();

		ListPair combiner = (x, y) -> {
			List<Integer> z = new ArrayList<>(list1);
			x.addAll(list2);
			return x;
		};

		List<Integer> list3 = combiner.accept(list1, list2);

		printAL(list3);

//		
//		Aufgabe A4
//

		System.out.println();
		System.out.println();
		System.out.println("***** A4 *****");
		System.out.println();

		ArrayList<CPU> cpu = new ArrayList<>(
				Arrays.asList(new CPU(1, "Intel"), new CPU(1, "AMD"), new CPU(4, "Intel"), new CPU(6, "AMD")));

		Processor cpuName = x -> "CPU " + x.getHersteller() + ", " + x.getAnzahlKerne() + " Kern"
				+ (x.getAnzahlKerne() == 1 ? "" : "e");

		for (CPU i : cpu)
			System.out.println(cpuName.getCPU(i));

	}

	static void printAL(List list) {

		for (Object i : list)
			System.out.println(i.toString());
	}

}
