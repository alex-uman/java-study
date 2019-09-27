package arrays;

class Person {

	String name;

}

public class GiraffeUebung {

	public static void main(String[] args) {

//		String[] namen = { "Tom", "Jerry", "Peter", "Paul", "Mary" };
//
//		Person[] docents = new Person[namen.length];
//
//		for (int i = 0; i < docents.length; i++) {
//
//			docents[i] = new Person();
//			docents[i].name = namen[i];
//
//			System.out.print(docents[i].name + " ");
//
//		}
//
//		System.out.println();
//
//	}

		String[] array1 = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag" };
		String[] array2 = { "Mo", "Di", "Mi", "Do", "Fr" };
		String[] array3 = { "Samstag", "Sonntag" };
		String[] array4 = { "Sa", "So" };

		String[][] array = new String[4][];

		array[0] = setToArray(array1);
		array[1] = setToArray(array2);
		array[2] = setToArray(array3);
		array[3] = setToArray(array4);

		for (String[] tagesArt : array) {

			for (String tag : tagesArt)

				System.out.print(tag + "  ");

			System.out.println();
			System.out.println();

		}

	}

	static String[] setToArray(String[] array) {

		String[] newArray = new String[array.length];

		for (int i = 0; i < newArray.length; i++)

			newArray[i] = array[i];

		return newArray;

	}

}
