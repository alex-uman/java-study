package vererbung;

public class MultiComma {

	public static void main(String[] args) {

		Object[] a5 = { 1, 0.5D, 1.11, "asd", 7.7F };

		print(a5);

	}

	static void print(Object[] object) {

		Object[] array = new Object[object.length];

		System.out.println("Check for floats and doubles");
		System.out.println("----------------------------");

		for (int i = 0; i < object.length; i++) {

			System.out.print(object[i] + " -> ");

			if (object[i] instanceof Float || object[i] instanceof Double) {

				array[i] = object[i];

				System.out.println(array[i]);

			}

			else

				System.out.println("NO!");

		}

	}

}
