package list;

import java.util.ArrayList;
import java.util.function.Predicate;

public class AufgabeFiltern {

	static final Predicate<Integer> ODD = i -> (i % 2 == 0);
	static final Predicate<Integer> EVEN = i -> !(i % 2 == 0);
	static final Predicate<Integer> POSITIVE = i -> (i < 0);
	static final Predicate<Integer> NEGATIVE = i -> !(i < 0);
	static final Predicate<Integer> FIRST_IS_ONE = i -> !(((Integer)Math.abs(i)).toString().charAt(0) == '1');

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(12);
		intList.add(13);
		intList.add(14);
		intList.add(15);
		intList.add(-17);
		intList.add(0);
		intList.add(-4);
		intList.add(77);

		System.out.println(intList);

		System.out.println();
		System.out.println(filtern(intList, EVEN));

		System.out.println();
		System.out.println(filtern(intList, ODD));

		System.out.println();
		System.out.println(filtern(intList, NEGATIVE));

		System.out.println();
		System.out.println(filtern(intList, POSITIVE));

		System.out.println();
		System.out.println(filtern(intList, FIRST_IS_ONE));

	}

	static ArrayList<Integer> filtern(ArrayList<Integer> intList, Predicate<Integer> param)

	{
		ArrayList<Integer> newList = new ArrayList<>(intList);

		newList.removeIf(param);

		return newList;

	}

}
