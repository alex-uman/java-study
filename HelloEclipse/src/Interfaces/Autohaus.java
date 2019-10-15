package Interfaces;

import java.util.Arrays;

class Auto implements Comparable<Auto> {

	private String hersteller;
	private int baujahr;

	Auto(String hersteller, int baujahr) {
		this.hersteller = hersteller;
		this.baujahr = baujahr;
	}

	@Override
	public int compareTo(Auto auto) {

		int vergleich = this.hersteller.compareTo(auto.hersteller);

		if (vergleich == 0)
			vergleich = this.baujahr - auto.baujahr;

		return vergleich;
	}

	@Override
	public String toString() {
		return hersteller + ", " + baujahr;
	}

}

public class Autohaus {

	public static void main(String[] args) {

		Auto a1 = new Auto("VW", 1992);
		Auto a2 = new Auto("Audi", 1992);
		Auto a3 = new Auto("VW", 1976);
		Auto a4 = new Auto("BMW", 1953);

		Auto[] list = { a1, a2, a3, a4 };

		Arrays.sort(list);

		System.out.println(print(list));
		
//		System.out.println(Arrays.deepToString(list));

	}

	static String print(Auto[] list) {

		String out = "Autos:\n------\n\n";

		for (Auto auto : list)
			out += auto.toString() + '\n';

		return out;

	}

}
