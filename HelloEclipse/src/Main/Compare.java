package Main;

public class Compare {
	
	 static String isLarger(int v1, int v2) {
		
		return v1>v2 ? "True":"False";
		
	}
	
	 static String isSmaller(int v1, int v2) {
		
		return v1<v2 ? "True":"False";
		
	}
	
	 static String isEqual(int v1, int v2) {
		
		return v1==v2 ? "True":"False";
		
	}
	
	 static String comparison(int v1, int v2) {
		
		 
		if(v1<v2) return v1+" < "+v2;
		
		else if(v1>v2) return v1+" > "+v2;
			
			else return v1+" = "+v2;
		
	 }

}
