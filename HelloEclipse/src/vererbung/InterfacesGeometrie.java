
package vererbung;

import java.util.Random;

interface Figur2 {

	double getFlaeche();

}

class Rechteck2 implements Figur2 {

	private int seiteA, seiteB;

	Rechteck2(int seiteA, int seiteB) {
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}

	Rechteck2() {
		this(0, 0);
	}

	public int getSeiteA() {
		return seiteA;
	}

	public int getSeiteB() {
		return seiteB;
	}

	public void setSeiteA(int seiteA) {
		this.seiteA = seiteA;
	}

	public void setSeiteB(int seiteB) {
		this.seiteB = seiteB;
	}

	public double getFlaeche() {
		return seiteA * seiteB;
	}

	public String toString() {
		return "Rechteck " + seiteA + "x" + seiteB + "";
	}
}

class Kreis2 implements Figur2 {

	private int radius;

	Kreis2(int radius) {
		this.radius = radius;
	}

	Kreis2() {
		this(0);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getFlaeche() {
		return 314 * radius * radius * 0.01;
	}

	public String toString() {
		return "Kreis mit Radius " + radius;
	}
}

class FigurSet2 {

	private Figur2[] set;

	FigurSet2(int count) {

		set = new Figur2[count];
	}

	void randomSet() {

		final int RANGE = 10;

		for (int i = 0; i < set.length; i++) {
			if (new Random().nextBoolean()) {
				set[i] = new Rechteck2((int) (1 + (Math.random() * RANGE)), (int) (1 + (Math.random() * RANGE)));
			} else {
				set[i] = new Kreis2((int) (1 + (Math.random() * RANGE)));
			}
		}
	}

	Figur2[] getSet() {
		return set;
	}

	public String toString() {

		String string = "";

		for (Figur2 figur : set)
			string += figur + "\n";
		return string;

	}

}

public class InterfacesGeometrie {

	final static int COUNT = 100;

	public static void main(String[] args) {

		FigurSet2 figurSet = new FigurSet2(COUNT);

		figurSet.randomSet();

//		System.out.println(figurSet);

		getFlaechen(figurSet);

	}

	static void getFlaechen(FigurSet2 figurSet) {

		for (Figur2 figur : figurSet.getSet())
			if (figur != null)
				System.out.println(figur + "  Fläche: " + figur.getFlaeche());
	}
}
