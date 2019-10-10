package vererbung;

abstract class Tier {

	private String name = "?";
	private int alter = -1;
	private boolean gesund = true;

	Tier(String name) {

		this.name = name;

	}

	Tier(String name, int alter) {

		this(name);

		this.setAlter(alter);

	}

	Tier(String name, boolean gesund) {

		this(name);

		this.gesund = gesund;

	}

	Tier(String name, int alter, boolean gesund) {

		this(name, alter);

		this.gesund = gesund;

	}

	void setName(String name) {

		this.name = name;

	}

	void setAlter(int alter) {

		if (alter < 0)

			System.out.println("Alter ist falsch angegeben und wird nicht eingetragen!");

		else

			this.alter = alter;

	}

	void setGesund() {

		gesund = true;

	}

	void setUngesund() {

		gesund = false;

	}

	void setGesundheit(boolean gesund) {

		this.gesund = gesund;

	}

	String getName() {

		return name;

	}

	int getAlter() {

		return alter;

	}

	boolean getGesundheit() {

		return gesund;

	}

//	String getTyp() {
//
//		return getClass().getSimpleName();
//	}

	abstract String getTyp();

	abstract void laufen();

	String checkLaeuft() {

		return this.toString() + " und laeuft" + (gesund ? "" : " nicht");

	}

	public String toString() {

		return getTyp() + " " + name + (alter < 0 ? "" : " ist " + alter + " Jahre alt und") + " ist "
				+ (gesund ? "" : "un") + "gesund";

	}

}

class Hund extends Tier {

	Hund(String name) {

		super(name);

	}

	Hund(String name, int alter) {

		super(name, alter);
	}

	Hund(String name, boolean gesund) {

		super(name, gesund);

	}

	Hund(String name, int alter, boolean gesund) {

		super(name, alter, gesund);

	}

	String getTyp() {

		return "Der Hund";

	}

	void laufen() {

		System.out.println(getTyp() + " " + getName() + " laeuft");

	}

}

class Katze extends Tier {

	Katze(String name) {

		super(name);

	}

	Katze(String name, int alter) {

		super(name, alter);
	}

	Katze(String name, boolean gesund) {

		super(name, gesund);

	}

	Katze(String name, int alter, boolean gesund) {

		super(name, alter, gesund);

	}

	String getTyp() {

		return "Die Katze";

	}

	void laufen() {

		System.out.println(getTyp() + " " + getName() + " laeuft");

	}

}

public class TierePolymorphie {

	public static void main(String[] args) {

		Hund rex = new Hund("Rex", 4, true);

		Katze tom = new Katze("Tom");

		tom.setUngesund();

		print(rex);
		System.out.println();
		print(tom);

	}

	static void print(Tier tier) {

		System.out.println(tier.checkLaeuft());

	}

}
