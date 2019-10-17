package string;

public class StringAufgabe1 {

	public static void main(String[] args) {

		String s = "Die Note Do ist nicht dasselbe wie Do, wenn Do für Donnerstag steht";

		int lastIndex = s.lastIndexOf("Do");

		int index = 0;

		while (index < s.length()) {

			index = s.indexOf("Do", ++index);

			if (index >= 0)
				System.out.println(index);
			else
				break;

		}

		 s = "Heute ist Donnerstag. Donnerstag ist toll";

		s = s.replaceAll("Donnerstag", "Freitag");

		System.out.println(s);

	}

}
