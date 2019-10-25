package Exam;

public class StringBackwards {

	public static void main(String[] Args) {

		String string = "Heute ist Mittwoch";

		String outstring = "";

		for (int i = string.length() - 1; i >= 0; i--)

			outstring += string.charAt(i);

		System.out.println(outstring);

	}

}
