package Main;

public class Compare {
	
	 static String islarger(int v1, int v2) {
		
		return v1>v2 ? "True":"False";
		
	}
	
	 static String issmaller(int v1, int v2) {
		
		return v1<v2 ? "True":"False";
		
	}
	
	 static String isequal(int v1, int v2) {
		
		return v1==v2 ? "True":"False";
		
	}
	
	 static String comparison(int v1, int v2) {
		
		String s;
		
		if(v1<v2) s = v1+" < "+v2;
		
			else if(v1>v2) s = v1+" > "+v2;
			
				else s = v1+" = "+v2;
		
		
		return s;
		
	}


}
