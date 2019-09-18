package Main;

public class Whileing {
	
	static String countWithoutOneWhile (int pointA, int pointB, int value) {
		
		String retValue = ""; 
		
		if(pointA > pointB) {
			
			while (pointA>=pointB) {
			
				if(pointA!=value) retValue = retValue + pointA + " ";
				
				pointA--;
			
			}
			
		}
		
		else {
			
			while(pointA<=pointB) {
				
				if(pointA!=value) retValue = retValue + pointA + " ";
				
				pointA++;
			
			}
			
		}
		
		
		return retValue;
		
	}
	
	
	
	static String countWithoutOneDoWhile (int pointA, int pointB, int value) {
		
		String retValue = ""; 
		
		if(pointA > pointB) {
			
			do {
			
				if(pointA!=value) retValue = retValue + pointA + " ";
				
				pointA--;
			
			} while (pointA>=pointB);
			
		}
		
		else {
			
			do {
				
				if(pointA!=value) retValue = retValue + pointA + " ";
				
				pointA++;
			
			} while (pointA<=pointB);
			
		}
		
		
		return retValue;
		
	}
	
	
	
	static String countXtoYrandomN (int pointA, int pointB, int value) {
		
		
		value = Math.abs(value);
		
		String retValue ="";
		
		
		if(pointA >= pointB) {
			
			while (pointA >= pointB) {
			
				pointA = pointA - 1 - (int)(Math.random()*value);
								
				if(pointA >= pointB) retValue = retValue + pointA + " ";
				
			}
			
		}
		
		else if(pointA <= pointB) {
				
			while (pointA <= pointB) {
				
				pointA = pointA + 1 + (int)(Math.random()*value);
									
				if(pointA <= pointB) retValue = retValue + pointA + " ";
					
			}
				
		}
		
		else retValue = "umnöglich";
			
			
		return retValue;
	
	}
}
