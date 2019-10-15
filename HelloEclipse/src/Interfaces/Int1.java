package Interfaces;

interface Figur {

	int getValue();

}

class Size implements Figur {

	private int size;

	Size(int size) {
		this.size = size;
	}

	public int getValue() {
		return size;
	}

	public String toString() {
		return "Size = " + size;
	}

}

class Kreis implements Figur {

	private int radius;

	Kreis(int radius) {
		this.radius = radius;
	}

	public int getValue() {
		return radius;
	}

	public String toString() {
		return "Kreis. Radius = " + radius;
	}

}

public class Int1 {

	public static void main(String[] args) {

//		Size s1 = new Size(20);
//
//		System.out.println("Size = " + s1);
//
//		Kreis k1 = new Kreis(3);
//
//		System.out.println(k1);

		Size sA = new Size(12);
		Size sB = new Size(7);

		System.out.println(getMax(sA, sB));

		Kreis kA = new Kreis(4);
		Kreis kB = new Kreis(77);
 
		System.out.println(getMax(kA, kB));
		
		System.out.println(getMax(kA, sB));

	}

	static String getMax(Figur A, Figur B) {

		return A.getValue() > B.getValue() ? A.toString() : B.toString();

	}

}
