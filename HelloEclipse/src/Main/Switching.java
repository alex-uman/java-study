package Main;

public class Switching {

	static String charCheck(char ch) {

		if (ch < 'a' || ch > 'z') return "'" + ch + "' ist kein englischer Kleinbuchstabe!";
		
		String retValue;

		switch (ch) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'y':
			retValue = "'" + ch + "' ist ein Vokal";
			break;

		default:
			retValue = "'" + ch + "' ist ein Konsonant";
			break;

		}

		return retValue;

	}

	static String germanChar(char ch) {

		String retValue;

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == 'ä' || ch == 'ö' || ch == 'ü' || ch == 'Ä'
				|| ch == 'Ö' || ch == 'Ü' || ch == 'ß')
			retValue = "'" + ch +"' ist ein deutscher Buchstabe";

		else
			retValue = "'" + ch +"' ist kein deutscher Buchstabe!";

		return retValue;

	}

	static String ampleSwitch(String farbe) {

		String retValue;

		switch (farbe) {

		case "Rot":
			retValue = "Rot. Bitte warten";
			break;

		case "Gelb":
			retValue = "Gelb. Gleich get es los";
			break;

		case "Grün":
			retValue = "Grün. Weg frei";
			break;

		default:
			retValue = farbe + "... Fehler! Diese Farbe gibt es nicht.";

		}

		return retValue;

	}

	static String ampleIf(String farbe) {

		if (farbe == "Rot")
			return "Rot. Bitte warten";

		else if (farbe == "Gelb")
			return "Gelb. Gleich get es los";

		else if (farbe == "Grün")
			return "Grün. Weg frei";

		else
			return farbe + "... Fehler! Diese Farbe gibt es nicht.";

	}

}
