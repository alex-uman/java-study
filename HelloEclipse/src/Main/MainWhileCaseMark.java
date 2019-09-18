package Main;

public class MainWhileCaseMark {
	
	public static void main(String[] args) {
		
		System.out.println("******************************");
		System.out.println("**** 0 bis 9 ohne 1 While ****");
		System.out.println("******************************");
		System.out.println();
		
		System.out.println(Whileing.countWithoutOneWhile(0,9,1));
		
		
		System.out.println();
		System.out.println();
		System.out.println("***********************************");
		System.out.println("**** 0 bis -9 ohne -1 Do While ****");
		System.out.println("***********************************");
		System.out.println();
		
		System.out.println(Whileing.countWithoutOneDoWhile(0,-9,-1));
		
		
		System.out.println();
		System.out.println();
		System.out.println("*********************************");
		System.out.println("**** 100 bis 0 mit Random(5) ****");
		System.out.println("*********************************");
		System.out.println();
		
		System.out.println(Whileing.countXtoYrandomN(100,0,5));
		
		
		System.out.println();
		System.out.println();		
		System.out.println("***********************************************");
		System.out.println("**** switch - eine englische Kleinbuchstabe ****");
		System.out.println("***********************************************");
		System.out.println();
		
		System.out.println("a - > " + Switching.charCheck('a'));
		System.out.println("c - > " + Switching.charCheck('c'));
		System.out.println("d - > " + Switching.charCheck('d'));
		System.out.println("e - > " + Switching.charCheck('e'));
		System.out.println("A - > " + Switching.charCheck('A'));
		System.out.println("+ - > " + Switching.charCheck('+'));	
		
		
		System.out.println();
		System.out.println();		
		System.out.println("***********************************************");
		System.out.println("**** switch - eine deutsche Buchstabe ****");
		System.out.println("***********************************************");
		System.out.println();
		
		System.out.println("a - > " + Switching.germanChar('a'));
		System.out.println("c - > " + Switching.germanChar('c'));
		System.out.println("E - > " + Switching.germanChar('E'));
		System.out.println("F - > " + Switching.germanChar('F'));
		System.out.println("ö - > " + Switching.germanChar('ö'));
		System.out.println("Ä - > " + Switching.germanChar('Ä'));
		System.out.println("ß - > " + Switching.germanChar('ß'));
		System.out.println("+ - > " + Switching.germanChar('+'));	
		
		
		System.out.println();
		System.out.println();		
		System.out.println("******************************");
		System.out.println("**** switch - Ampelfarben ****");
		System.out.println("******************************");
		System.out.println();
		
		System.out.println(Switching.ampleSwitch("Gelb"));
		
		
		System.out.println();
		System.out.println();
		System.out.println("**************************");
		System.out.println("**** if - Ampelfarben ****");
		System.out.println("**************************");
		System.out.println();
		
		System.out.println(Switching.ampleIf("Magenta"));
	}
	
}
