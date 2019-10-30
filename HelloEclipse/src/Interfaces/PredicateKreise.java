package Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class PredicateKreise {

	static class Kreis {
		private int radius;

		public Kreis(int radius) {
			this.radius = radius;
		}

		public int getRadius() {
			return radius;
		}

		@Override
		public String toString() {
			return "Kreis. R = " + radius;
		}
	}

	public static void main(String[] args) {

		/*
		 * A1.
		 * 
		 * Folgende Kreise in einer ArrayList speichern: R = 3, R = 17, R = 2, R = 22, R
		 * = 8
		 * 
		 * A2. Definieren Sie ine Predicate für Kreise, mit dem Kreise mit dem Radius >
		 * 10 akzeptiert werden.
		 * 
		 * Testen Sie den Predicate in einer foreach-Schleife, die nur die Kreise
		 * ausgibt, die das Predicate akzeptiert
		 * 
		 */

		ArrayList<Kreis> kreise = new ArrayList<>(
				Arrays.asList(new Kreis(3), new Kreis(17), new Kreis(2), new Kreis(22), new Kreis(8)));

		printAl(kreise);
		System.out.println();

		Predicate<Integer> checkRadius = r -> r > 10;

		for (Kreis i : kreise)
			if (checkRadius.test(i.getRadius()))
				System.out.println(i);

		System.out.println();
		System.out.println();

		Function<Integer, Integer> doubler = x -> x == null ? -1 : x * 2;
		
		System.out.println(doubler.apply(null));

	}

	static void printAl(List list) {

		for (Object i : list)
			System.out.println(i);
	}

}
