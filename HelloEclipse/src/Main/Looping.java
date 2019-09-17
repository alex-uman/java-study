package Main;

public class Looping {

	
	static void countrow (int pointA, int pointB) {
		
		int i;
		
		
		System.out.print(pointA);
		
		
		if(pointA > pointB) {
				
			for (i=pointA-1; i>=pointB; i--) {
			
				System.out.print(" " + i);
			
			}
			
		}
		
		else {
			
			for (i=pointA+1; i<=pointB; i++) {
				
				System.out.print(" " + i);
			
			}
			
		}
		
	}
	
	
	static void countwithoutone (int pointA, int pointB, int value) {
		
		int i;
		
		
		
		if(pointA > pointB) {
			
			if(pointA!=value) System.out.print(pointA-- + " ");
			if(pointA!=value) System.out.print(pointA-- + " ");
				
			for (i=pointA; i>=pointB; i--) {
			
				if(i!=value) System.out.print(i + " ");
			
			}
			
		}
		
		else {
			
			if(pointA!=value) System.out.print(pointA++ + " ");
			if(pointA!=value) System.out.print(pointA++ + " ");
			
			for (i=pointA; i<=pointB; i++) {
				
				if(i!=value) System.out.print(i + " ");
			
			}
			
		}
		
	}
	
	
	static void countinterval (int pointA, int pointB, int value) {
		
		int i;
		
		value = Math.abs(value);
		
		
		System.out.print(pointA);
		
		
		if(pointA > pointB) {
				
			for (i=pointA-value; i>=pointB; i=i-value) {
			
				System.out.print(" " + i);
			
			}
			
		}
		
		else {
			
			for (i=pointA+value; i<=pointB; i=i+value) {
				
				System.out.print(" " + i);
			
			}
			
		}
		
	}
	
	
	static void charrow(char charA, char charB) {
		
		int pointA = charA;
		int pointB = charB;
		
		int i;
						
		
		System.out.print((char)pointA);
		
		
		if(pointA > pointB) {
			
			for (i=pointA-1; i>=pointB; i--) {
			
				System.out.print(" " + (char)i);
			
			}
			
		}
		
		else {
			
			for (i=pointA+1; i<=pointB; i++) {
				
				System.out.print(" " + (char)i);
			
			}
			
		}
		
	}
	
	
	static void countdiv (int pointA, int pointB, int value) {
		
		int i;
		
		value = Math.abs(value);
				
		int j=pointA*value+1;
		
		
		if(pointA > pointB) {
			
			for (i=pointA; i>=j; i--) {
				
				if(i%value==0) System.out.print(i);
			
			}
				
			for (i=j-1; i>=pointB; i--) {
			
				if(i%value==0) System.out.print(" " + i);
			
			}
			
		}
		
		else {
			
			for (i=pointA; i<=j; i++) {
				
				if(i%value==0) System.out.print(i);
			
			}
				
			for (i=j+1; i<=pointB; i++) {
				
				if(i%value==0) System.out.print(" " + i);
			
			}
			
		}
		
	}
	
	
	static void arrayrow (int[] row) {
		
		int i;
		
		
		System.out.print(row[0]);
		
		
		for (i=1; i < row.length; i++) {
			
			System.out.print(" " + row[i]);
			
		}
				
	}
		
	
	static void asciipart(int pointA, int pointB, int stringlengtt) {
		
		int i;
		int j;
			
		pointA = Math.abs(pointA);
		pointB = Math.abs(pointB);
		stringlengtt = Math.abs(stringlengtt);
		
		if(stringlengtt==0) stringlengtt=1000;
		
		
		for (i=pointA; i<=pointB;) {
												
			for (j=1; j<stringlengtt; j++) {
							
				System.out.print( "|" + (char)i);
				
				i++;
								
			}
			
			System.out.println("|");						
		}
		
	}

}
