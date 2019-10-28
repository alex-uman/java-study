package list;

public class AufgabeStringbuilder {

	static final int COUNT = 40000;

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = " ";
		String s3 = "Welt";

		System.out.println(checkConcString(s1, s2, s3));
		System.out.println(checkConcSB(s1, s2, s3));

	}

	static double checkConcString(String s1, String s2, String s3) {

		String string = "";

		double midTime = System.currentTimeMillis();

		for (int i = 0; i < COUNT; i++)
			string += s1 + s2 + s3;

		midTime = (System.currentTimeMillis() - midTime)*100 / COUNT;

		return midTime;

	}

	static double checkConcSB(String s1, String s2, String s3) {

		StringBuilder sb = new StringBuilder();

		double midTime = System.currentTimeMillis();

		for (int i = 0; i < COUNT; i++)
			sb.append(s1).append(s2).append(s3);

		midTime = (System.currentTimeMillis() - midTime)*100 / COUNT;

		return midTime;

	}

}
