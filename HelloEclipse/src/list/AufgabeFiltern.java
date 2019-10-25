package list;

import java.util.ArrayList;
import java.util.function.Predicate;

public class AufgabeFiltern {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(12);
		intList.add(13);
		intList.add(14);
		intList.add(15);
		intList.add(-4);
		intList.add(77);

		System.out.println(intList);

		System.out.println();
		System.out.println(filtern(intList, i -> !(i % 2 == 0)));

		System.out.println();
		System.out.println(filtern(intList, i -> (i % 2 == 0)));

		System.out.println();
		System.out.println(filtern(intList, i -> !(i > 0)));

		System.out.println();
		System.out.println(filtern(intList, i -> (i > 0)));

	}

	static ArrayList<Integer> filtern(ArrayList<Integer> intList, Predicate<Integer> param)

	{
		ArrayList<Integer> newList = new ArrayList<>(intList);

		newList.removeIf(param);

		return newList;

	}

}
