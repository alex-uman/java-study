package Main;

public class Looping {

	
	static void countRow (int pointA, int pointB) {
				
		
		System.out.print(pointA);
		
		
		if(pointA > pointB) {
			
			for (int i=pointA-1; i>=pointB; i--) {
			
				System.out.print(" " + i);
			
			}
			
		}
		
		else {
			
			for (int i=pointA+1; i<=pointB; i++) {
				
				System.out.print(" " + i);
			
			}
			
		}
		
	}
	
	
	static void countWithoutOne (int pointA, int pointB, int value) {
		
		
		if(pointA > pointB) {
			
			if(pointA!=value) System.out.print(pointA-- + " ");
			if(pointA!=value) System.out.print(pointA-- + " ");
			
			
			for (int i=pointA; i>=pointB; i--) {
			
				if(i!=value) System.out.print(i + " ");
			
			}
			
		}
		
		else {
			
			if(pointA!=value) System.out.print(pointA++ + " ");
			if(pointA!=value) System.out.print(pointA++ + " ");
			
			for (int i=pointA; i<=pointB; i++) {
				
				if(i!=value) System.out.print(i + " ");
			
			}
			
		}
		
	}
	
	
	static void countInterval (int pointA, int pointB, int value) {
				
		
		value = Math.abs(value);
		
		
		System.out.print(pointA);
		
		
		if(pointA > pointB) {
			
			for (int i=pointA-value; i>=pointB; i=i-value) {
			
				System.out.print(" " + i);
			
			}
			
		}
		
		else {
			
			for (int i=pointA+value; i<=pointB; i=i+value) {
								
				System.out.print(" " + i);
			
			}
			
		}
		
	}
	
	
	static void charRow(char charA, char charB) {
		
		
		System.out.print((char)charA);
		
		
			int pointA = charA;
			int pointB = charB;
		
			
		if(pointA > pointB) {
			
			for (int i=pointA-1; i>=pointB; i--) {
			
				System.out.print(" " + (char)i);
			
			}
			
		}
		
		else {
			
			for (int i=pointA+1; i<=pointB; i++) {
				
				System.out.print(" " + (char)i);
			
			}
			
		}
		
	}
	
	
	static void countDiv (int pointA, int pointB, int value) {
				
		value = Math.abs(value);
			
		
		if(pointA > pointB) {
			
			
			int j=pointA*value+1;
			
			for (int i=pointA; i>=j; i--) {
				
				if(i%value==0) System.out.print(i);
			
			}
				
			for (int i=j-1; i>=pointB; i--) {
			
				if(i%value==0) System.out.print(" " + i);
			
			}
			
		}
		
		else {


			int j=pointA*value+1;
			
			for (int i=pointA; i<=j; i++) {
				
				if(i%value==0) System.out.print(i);
			
			}
				
			for (int i=j+1; i<=pointB; i++) {
				
				if(i%value==0) System.out.print(" " + i);
			
			}
			
		}
		
	}
	
	
	static void arrayRow (int[] row) {
		
		
		System.out.print(row[0]);
		
		
		for (int i=1; i < row.length; i++) {
			
			System.out.print(" " + row[i]);
			
		}
				
	}
		
	
	static void asciiPart(int pointA, int pointB, int stringlength) {
		
		pointA = Math.abs(pointA);
		pointB = Math.abs(pointB);
		stringlength = Math.abs(stringlength);
		
		if(stringlength==0) stringlength=1000;
		
		
		for (int i=pointA; i<=pointB;) {
			
			for (int j=1; j<stringlength; j++) {
				
				System.out.print( "|" + (char)i++);
				
			}
						
			System.out.println("|");
			
		}
		
	}

}
