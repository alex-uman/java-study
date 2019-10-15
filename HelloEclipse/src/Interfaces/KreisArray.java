package Interfaces;

import java.util.Arrays;

class Kreis2 implements Comparable<Kreis2> {

	private int radius;

	Kreis2(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public String toString() {
		return "Kreis mit Radius " + radius;
	}

	@Override
	public int compareTo(Kreis2 kreis) {

		if (this.radius < kreis.radius)
			return -1;
		if (this.radius > kreis.radius)
			return 1;

		return 0;
	}
}

class KreisSet {

	private Kreis2[] set;

	KreisSet(int count) {
		set = new Kreis2[count];
	}

	void randomSet() {

		final int RANGE = 10;

		for (int i = 0; i < set.length; i++) {
			set[i] = new Kreis2((int) (1 + (Math.random() * RANGE)));
		}

		Arrays.sort(set);
	}

	Kreis2[] getSet() {
		return set;
	}

	public String toString() {

		String string = "";

		for (Kreis2 figur : set)
			string += figur + "\n";
		return string;

	}

}

public class KreisArray {

	public static void main(String[] args) {

		KreisSet set = new KreisSet(10);

		set.randomSet();

		System.out.println(set);

	}

}
