package string;

public class NameGenerator {

	public static void main(String[] args) {

		String[] silbenSet = { "ber", "mar", "man", "rich", "sau", "tra", "un", "be", "dich", "berg", "stimm", "stub",
				"ger", "licht", "ner", "bert", "reb", "kopf", "tim", "er" };

		String[] namenList = nameArray(silbenSet, 50);

		printStringArray(namenList);

	}

	static String nameGen(String[] silbenSet, int silbenAnzahl) {

		int randomSilbe;

		String[] name = new String[silbenAnzahl];

		for (int i = 0; i < silbenAnzahl;) {

			randomSilbe = (int) (Math.random() * silbenSet.length);

//			System.out.println(silbenSet[randomSilbe]);

			if (i > 0) {

				int repeat = 0;

				for (int j = 0; j < i - 1; j++)
					if (name[j].equals(silbenSet[randomSilbe]))
						repeat++;

				if (repeat > 0) {
					if ((Math.random() * 101) <= (25 / repeat)) {
						if (name[i - 1].equals(silbenSet[randomSilbe])) {
							if (Math.random() * 101 <= 2)
								name[i++] = silbenSet[randomSilbe];
						}

						else
							name[i++] = silbenSet[randomSilbe];
					}

				} else
					name[i++] = silbenSet[randomSilbe];

			} else
				name[i++] = silbenSet[randomSilbe];

		}

		return stringArrayToName(name);

	}

	static String nameGen(String[] silbenSet) {

		return nameGen(silbenSet, (int) (2 + Math.random() * 3));

	}

	static String stringArrayToName(String[] nameSet) {

		String name = "";

		nameSet[0] = nameSet[0].substring(0, 1).toUpperCase() + nameSet[0].substring(1);

		for (String silbe : nameSet)

			name += silbe;

		return name;

	}

	static String[] nameArray(String[] silbenSet, int count) {

		if (silbenSet[0] == null || silbenSet.length == 0 || count < 1)
			throw new IllegalArgumentException("Die Parameter für nameArray() sind falsch angegeben!");

		String[] namenList = new String[count];

		for (int i = 0; i < count; i++)
			namenList[i] = nameGen(silbenSet);

		return namenList;

	}

	static void printStringArray(String[] stringArray) {

		if (stringArray[0] == null || stringArray.length == 0)
			throw new IllegalArgumentException("Dre Parameter für printStringArray() ist falsch angegeben!");

		for (String string : stringArray)

			System.out.println(string);

	}

}
