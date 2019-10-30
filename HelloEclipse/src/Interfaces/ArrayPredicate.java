package Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Austronaut {

	private String name;

	Austronaut(String name) {
		this.name = name;
	}

	public String toString() {
		return "Austronaut " + name;
	}

}

public class ArrayPredicate {

	public static void main(String[] args) {

		String[] namen = { "Tom", "Jerry", "Peter", "Paul", "Mary", "Ute" };

		List<Austronaut> listA = buldMannschaft(namen, n -> n.length() < 4 ? new Austronaut(n) : new Austronaut("???"));

		printAL(listA);

	}

	static List<Austronaut> buldMannschaft(String[] namen, Function<String, Austronaut> param) {

		List<Austronaut> listB = new ArrayList<>();

		for (String i : namen)
			listB.add(param.apply(i));

		return listB;

	}

	static void printAL(List list) {

		list.forEach(i -> System.out.println(i));
	}

}
