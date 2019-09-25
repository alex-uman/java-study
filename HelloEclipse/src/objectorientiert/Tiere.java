package objectorientiert;

class Hund {

	private String name, besitzer;

	private int alter;

	public Hund(String name, int alter, String besitzer) {

		super();

		this.name = name;
		this.alter = alter;
		this.besitzer = besitzer;
	}

	public Hund(String name, int alter) {

		this(name, alter, "-");
	}

	public String toString() {

		return "Der Hund namens " + name + " ist " + alter + " Jahre alt und gehört zu "
				+ (besitzer == "-" ? "niemandem" : besitzer);

	}

	public boolean equals(Object param) {

		Hund hund = (Hund) param;
		return name.equals(hund.name) && alter == hund.alter && besitzer.contentEquals(hund.besitzer);

	}

}

public class Tiere {

	public static void main(String[] args) {

		Hund h1 = new Hund("Bello", 11, "Müller");
		Hund h2 = new Hund("Bello", 11, "Müller");

		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1.equals(h2) ? "Anscheinend handelt es sich um derselben Hund"
				: "Das sind definitiv zvei verschiedene Hunde");

		System.out.println();

		Hund h3 = new Hund("Aldo", 3);

		System.out.println(h1);
		System.out.println(h3);
		System.out.println(h1.equals(h3) ? "Anscheinend handelt es sich um derselben Hund"
				: "Das sind definitiv zvei verschiedene Hunde");

	}

}
