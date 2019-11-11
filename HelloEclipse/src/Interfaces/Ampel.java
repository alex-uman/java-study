package Interfaces;

enum Farbe {
	ROT, GELB, GRUEN
}

class Ampelfarbe {

	private Farbe farbe;

	Ampelfarbe(Farbe farbe) {
		this.farbe = farbe;
	}

	public String toString() {

		return farbe.getDeclaringClass().getEnumConstants().toString();
//		
//		if (farbe == Farbe.ROT)
//			return "ROT";
//		if (farbe == Farbe.GELB)
//			return "GELB";
//		return "GRUEN";
	}
}

public class Ampel {

	public static void main(String[] args) {

		Ampelfarbe af = new Ampelfarbe(Farbe.ROT);
		
		System.out.println(af);

	}

}
