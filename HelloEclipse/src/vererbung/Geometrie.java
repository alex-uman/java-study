package vererbung;

class Figur {

	private int x, y;

	Figur(int x, int y) {

		this.x = x;
		this.y = y;

	}

	Figur() {

		this(0, 0);

	}

	void setX(int x) {

		this.x = x;
	}

	void setY(int y) {

		this.y = y;
	}

	int getX() {

		return x;
	}

	int getY() {

		return y;
	}

	String getTyp() {

		return getClass().getSimpleName();
	}

	void verschieben(int x, int y) {

		this.x += x;
		this.y += y;

	}

	void bewegen(int x, int y) {

		this.x = x;
		this.y = y;

	}

	public float getFlaeche() {

		return 0;

	}

	String getFigur() {

		return "";

	}

	@Override
	public String toString() {

		return getFigur() + "platziert am [" + x + "," + y + "]";

	}
}

class Rechteck extends Figur {

	private int seiteA, seiteB;

	Rechteck(int seiteA, int seiteB, int x, int y) {

		super(x, y);

		this.seiteA = seiteA;
		this.seiteB = seiteB;

	}

	Rechteck(int seiteA, int seiteB) {

		super();

		this.seiteA = seiteA;
		this.seiteB = seiteB;

	}

	public float getFlaeche() {

		return seiteA * seiteB;

	}

	String getFigur() {

		return "Rechteck " + seiteA + "x" + seiteB + ", ";

	}

//	public String toString() {
//
//		return getFigur() + ", " + super.toString();
//
//	}

}

class Kreis extends Figur {

	private int radius;

	Kreis(int radius, int x, int y) {

		super(x, y);

		this.radius = radius;

	}

	Kreis(int radius) {

		super();

		this.radius = radius;

	}

	public float getFlaeche() {

		return (float) Math.PI * radius * radius;

	}

	String getFigur() {

		return "Kreis mit Radius " + radius + ", ";

	}

//	public String toString() {
//
//		return getFigur() + ", " + super.toString();
//
//	}
}

class FigurSet {

	private Figur[] set;

	FigurSet(int count) {

		set = new Figur[count];
	}

	void randomSet() {

		final int RANGE = 10;

		for (int i = 0; i < set.length; i++) {

			if ((int) (Math.random() * 2) == 0) {

//				set[i] = (Rechteck) set[i];
				set[i] = new Rechteck((int) (1 + (Math.random() * RANGE)), (int) (1 + (Math.random() * RANGE)));

			}

			else {

//				set[i] = (Kreis) set[i];
				set[i] = new Kreis((int) (1 + (Math.random() * RANGE)));

			}

		}

	}

	Figur[] getSet() {

		return set;

	}

	public String toString() {

		String string = "";

		for (Figur figur : set)

			string += figur + "\n";

		return string;

	}

}

public class Geometrie {

	final static int COUNT = 100;

	public static void main(String[] args) {

//		Rechteck aRechteck = new Rechteck(3, 4, 0, 0);
//
//		aRechteck.bewegen(12, -7);
//
//		System.out.println(aRechteck.getTyp() + ": " + aRechteck);
//
//		Kreis aKreis = new Kreis(4, 0, 0);
//
//		aKreis.verschieben(32, 2);
//		aKreis.verschieben(1, -1);
//
//		System.out.println(aKreis.getTyp() + ": " + aKreis);

		FigurSet figurSet = new FigurSet(COUNT);

		figurSet.randomSet();

		System.out.println(figurSet);

		getFlaechen(figurSet);

	}

	static void getFlaechen(FigurSet figurSet) {

		for (Figur figur : figurSet.getSet())

			if (figur != null)

				System.out.println(figur.getFigur() + "Flaeche: " + figur.getFlaeche());

	}

}
