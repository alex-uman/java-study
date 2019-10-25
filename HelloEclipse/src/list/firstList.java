package list;

import java.util.Arrays;
import java.util.ArrayList;

public class firstList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

//		list.add("mo");
//		list.add("fr");
//		list.add("di");
//		list.add("fr");
//		list.add("mi");
//		list.add("fr");
//		list.add("do");
//		list.add("fr");
//
//		System.out.println(list);
//
//		while (list.remove("fr")) {
//		}
//
//		System.out.println(list);

		String[] array = { "mo", "di", "mi" };

		for (String string : array)
			list.add(string);

		System.out.println(Arrays.toString(array));
		System.out.println(list);

	}

}
