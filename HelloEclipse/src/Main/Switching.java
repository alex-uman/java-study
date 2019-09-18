package Main;

public class Switching {

	static String charCheck (char ch) {
		
		
		String retValue;
		

		switch (ch){
			
			case 'a':
			case 'e':
			case 'i':
			case 'j':
			case 'o':
			case 'q':
			case 'u':
			case 'y': retValue = "Das ist ein Vokal und nähmlih die Buchstabe '" + ch + "'"; break;
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'z': retValue = "Das ist ein Konsonant und nähmlih die Buchstabe '" + ch + "'"; break;
			default: retValue = "Das ist keine englische Kleinbuchstabe!"; break;
	
		}
		
		
		return retValue;
		
	}
	
	
	
	static String germanChar (char ch) {
		
		
		String retValue;
		
		if((ch>64 && ch<91)||(ch>96 && ch<123)||(ch>96 && ch<123)||(ch>96 && ch<123)||ch=='ä'||ch=='ö'||ch=='ü'||ch=='Ä'||ch=='Ö'||ch=='Ü'||ch=='ß') retValue = "Das ist '" + ch +"'";
			
		else retValue = "Das ist keine deutsche Buchstabe!";
			
		
		return retValue;
		
	}
	
	
	
	static String ampleSwitch (String farbe) {
	
		
		String retValue; 
		
		
		switch (farbe) {
		
			case "Rot": retValue =  "Rot. Bitte warten"; break;
			
			case "Gelb": retValue =  "Gelb. Gleich get es los"; break;
		
			case "Grün": retValue =  "Grün. Weg frei"; break;
		
			default: retValue =  farbe + "... Fehler! Diese Farbe gibt es nicht.";
		
		}
		
		return retValue;
		
	}	
	    	
		
	    
	static String ampleIf (String farbe) {
			
			
		if(farbe=="Rot") return "Rot. Bitte warten";
				
		else if(farbe=="Gelb") return "Gelb. Gleich get es los";
			
			else if(farbe=="Grün") return "Grün. Weg frei";
			
				else return farbe + "... Fehler! Diese Farbe gibt es nicht.";
       
	}

}
