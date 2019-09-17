package variablen;

public class probe {

	public static void main(String[] args) {
		
		double a = 0x9D;
		//System.out.println(a);

		double var1 = 1;
		double var2 = var1++;
		//System.out.println(var2);
		
		int x = 1;
		
		x = x++ + 0;
		
		String c = "cd";
		
		String s = false ? "yes":"no";
		
		double q = true ? var1:var2;
		
		System.out.println(q);
		

	}

}
