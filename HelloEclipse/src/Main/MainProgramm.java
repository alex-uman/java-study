package Main;

public class MainProgramm {

	public static void main(String[] args) {


		System.out.println(Compare.islarger(1,2));
		System.out.println(Compare.issmaller(1,2));
		System.out.println(Compare.isequal(1,2));
		
		System.out.println();
		
		System.out.println(Compare.comparison(1,2));
		
		System.out.println();
		System.out.println();
		
		Looping.asciipart(28, 756, 50);
		
	
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		
		Looping.countrow(0, 9);
		
		System.out.println();
		System.out.println();
				
		Looping.countwithoutone(0, 9, 1);
		
		System.out.println();
		System.out.println();
				
		Looping.countinterval(-4, 50, -2);
		
		System.out.println();
		System.out.println();
				
		Looping.charrow('a', 'z');
		
		System.out.println();
		System.out.println();
				
		Looping.charrow('Z', 'A');
		
		System.out.println();
		System.out.println();
		
		Looping.countdiv(1, 100, -5);
		
		System.out.println();
		System.out.println();
		
		int[] myarray ={3,1,2,3,2,1,2,1,1};
		Looping.arrayrow(myarray);
		
		System.out.println();
		System.out.println();
				
	}

}
