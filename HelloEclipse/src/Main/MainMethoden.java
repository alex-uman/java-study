package Main;

public class MainMethoden {

	public static void main(String[] args) {

		System.out.println("*****************");
		System.out.println("*** Aufgabe 1 ***");
		System.out.println("*****************");
		System.out.println();

		Methoding.printFromTo(2, 2);

		Methoding.printFromTo(2, 10);

		Methoding.printFromTo(8, 3);

		System.out.println();
		System.out.println("*****************");
		System.out.println("*** Aufgabe 2 ***");
		System.out.println("*****************");

		System.out.print(Methoding.sum(2, 2));
		System.out.println();

		System.out.print(Methoding.sum(2, 10));
		System.out.println();

		System.out.print(Methoding.sum(2, -10));
		System.out.println();

		System.out.print(Methoding.sum(2, Integer.MAX_VALUE));
		System.out.println();

		System.out.println();
		System.out.println();
		System.out.println("*****************");
		System.out.println("*** Aufgabe 3 ***");
		System.out.println("*****************");

		System.out.print(Methoding.sumFromTo(2, 2));
		System.out.println();

		System.out.print(Methoding.sumFromTo(2, 10));
		System.out.println();

		System.out.print(Methoding.sumFromTo(2, -10));
		System.out.println();

		System.out.print(Methoding.sumFromTo(2, Integer.MAX_VALUE));
		System.out.println();

		System.out.println();
		System.out.println();
		System.out.println("*****************");
		System.out.println("*** Aufgabe 4 ***");
		System.out.println("*****************");

		Methoding.zeichneRechteck(5, 4);

		Methoding.zeichneRechteck(4, 5);

		Methoding.zeichneRechteck(5, 1);

		Methoding.zeichneRechteck(5, 0);

		System.out.println();
		System.out.println();
		System.out.println("*****************");
		System.out.println("*** Aufgabe 5 ***");
		System.out.println("*****************");

		Methoding.zeichneRechteckBoolean(5, 4, true);

		Methoding.zeichneRechteckBoolean(4, 5, false);

		Methoding.zeichneRechteckBoolean(5, 1, true);

		Methoding.zeichneRechteckBoolean(1, 5, false);

		Methoding.zeichneRechteckBoolean(5, 0, true);

		System.out.println();
		System.out.println();
		System.out.println("*****************");
		System.out.println("*** Aufgabe 6 ***");
		System.out.println("*****************");
		System.out.println();

		Methoding.printRandom(3, 2, 4);
		
		Methoding.printRandom(5, 4, -2);
		
		Methoding.printRandom(0, 4, 2);
		
		Methoding.printRandom(1, 20, 20);

	}

}
