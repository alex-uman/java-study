package list;

import java.util.ArrayList;
import java.util.Comparator;

class CompareLength implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {
		return string1.length() - string2.length();
	}

}

public class AufgabeSort {

	public static void main(String[] args) {
		ArrayList<String> woche = new ArrayList<>();

		woche.add("montag");
		woche.add("di");
		woche.add("mittw.");
		woche.add("freitagabend");
		woche.add("samstag");

		Comparator<String> length = new CompareLength();

		woche.sort(length);

		for (String i : woche)
			System.out.println(i);

	}

}
