package string;

public class SB {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("0");

		for (int i = 1; i < 1000; i++)

			sb.append(i);

		String string = sb.toString();

		System.out.println(string);

	}

}
