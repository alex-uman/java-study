package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Affe {

	private String name;
	private Double groesse;

	Affe(String name, double groesse) {
		this.name = name;
		this.groesse = groesse;
	}

	Affe(String name) {
		this(name, 0);
	}

	double getGroesse() {
		return groesse;
	}

	public String toString() {
		return name + (groesse <= 0 ? "" : ", " + groesse + " cm gross");
	}

	public static class GroesseCmp implements Comparator<Affe> {

		public int compare(Affe a1, Affe a2) {
			return (int) (a1.getGroesse() - a2.getGroesse());
		}
	}

}

public class Affen {

	public static void main(String[] args) {

		ArrayList<Affe> affen = new ArrayList<>();

		affen.add(new Affe("Mikcey"));
		affen.add(new Affe("Cheetha", 40));
		affen.add(new Affe("Tschi-tschi", 42));
		affen.add(new Affe("Calligula", 35));

		Affe.GroesseCmp groesseCmp=new Affe.GroesseCmp();

		Collections.sort(affen, groesseCmp);

		for (int i = 0; i < affen.size(); i++)
			System.out.println(i + 1 + ". " + affen.get(i));

	}

}
