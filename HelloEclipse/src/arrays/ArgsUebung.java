package arrays;

public class ArgsUebung {

	public static void main(String... args) {

		printArgsN2("aaa", "bbb", "ccc");
		System.out.println();
		System.out.println();
		printArgsN1("aaa", "bbb", "ccc");
		System.out.println();
		System.out.println();
		printArgsN1("aaa");
		
	}
	
	static void printArgsN1(String arg1, String... arg2) {

		System.out.print(arg1);

		for (String str : arg2)

			System.out.print(", " + str);

	}

	static void printArgsN2(String... arg) {

		if (arg.length == 0)

			throw new IllegalArgumentException("the methode printArgsN2 needs at least one argument");

		System.out.print(arg[0]);

		for (int i = 1; i < arg.length; i++)

			System.out.print(", " + arg[i]);

	}

}
