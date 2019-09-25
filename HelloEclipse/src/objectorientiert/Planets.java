package objectorientiert;

class Planet {

	String name;
	int x, y;

}

public class Planets {

	public static void main(String[] args) {

		Planet bora = new Planet();

		setPlanet(bora, "Bora", 23, 545);
		printPlanet(bora);

		movePlanet(bora, -3, 45);
		printPlanet(bora);

	}

	static void setPlanet(Planet pl, String name, int x, int y) {

		pl.name = name;
		pl.x = x;
		pl.y = y;

	}

	static void movePlanet(Planet pl, int x, int y) {

		pl.x += x;

		pl.y += y;

	}

	static void printPlanet(Planet pl) {

		System.out.println(pl.name + ", " + pl.x + ", " + pl.y);

	}

}