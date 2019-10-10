package vererbung;

class Viereck {

	private int west, nord, ost, sued; // die Seiten von einem Vierteck
	private int nordWest, nordOst, suedOst, suedWest; // die Vinkel von einem Viereck

	Viereck(int west, int nord, int ost, int sued, int nordWest, int nordOst, int suedOst, int suedWest) {

		this.west = west;
		this.nord = nord;
		this.ost = ost;
		this.sued = sued;
		this.nordWest = nordWest;
		this.nordOst = nordOst;
		this.suedOst = suedOst;
		this.suedWest = suedWest;

	}

	int getWest() {

		return west;
	}

	int getNordOst() {

		return nordOst;
	}

}

class Rechteck_ extends Viereck {
//	int west;
	Rechteck_(int vert, int hor) {

		super(vert, hor, vert, hor, 90, 90, 90, 90);

	}

}

class Quadrat extends Rechteck_ {

	Quadrat(int seite) {

		super(seite, seite);

	}

}

class Parallelogramm extends Viereck {

	Parallelogramm(int hor, int vert, int nordWest) {
		super(hor, vert, hor, vert, nordWest, 180 - nordWest, nordWest, 180 - nordWest);

	}

}

class Raute extends Parallelogramm {

	Raute(int seite, int kronVinkel) {

		super(seite, seite, kronVinkel);

	}

	int getKronVinkel() {

		return 180 - getNordOst();
	}

	int getSeitenVinkel() {

		return getNordOst();
	}

}

public class Vererbung {

	public static void main(String[] args) {

		Raute aRaute = new Raute(5, 60);

		System.out.println(aRaute.getNordOst() + "");
		System.out.println(aRaute.getKronVinkel() + "");

	}

}
