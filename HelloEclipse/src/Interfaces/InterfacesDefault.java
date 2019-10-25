package Interfaces;

interface Sum {

	default int add(int a, int b) {
		return a + b;
	}
}

interface Container {
	/*
	 * Speichert x im Container. Liefert die neue Containergröße zurück.
	 */
	int add(int x);

	/*
	 * Überladen. Speichert im Container x, danach y. Liefert die neue
	 * Containergröße zurück.
	 */

	default int add(int x, int y) {
		return x + y;
	}
}

class TestContainer implements Sum, Container {

	private int size = 0;

	public int add(int a) {
		return ++size;
	}

	public int add(int a, int b) {
		return Sum.super.add(a, b);
	}

}

public class InterfacesDefault {

	public static void main(String[] args) {

//		int sum = Sum.add(1, 2);

	}

}
