package main;

public class MainIfFor {

	public static void main(String[] args) {


		System.out.println(Compare.isLarger(1,2));
		System.out.println(Compare.isSmaller(1,2));
		System.out.println(Compare.isEqual(1,2));
		
		System.out.println();
		
		System.out.println(Compare.comparison(1,2));
		
		System.out.println();
		System.out.println();
		
		Looping.asciiPart(28, 756, 50);
		
	
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		
		Looping.countRow(0, 9);
		
		System.out.println();
		System.out.println();
				
		Looping.countWithoutOne(0, 9, 1);
		
		System.out.println();
		System.out.println();
				
		Looping.countInterval(-4, 50, -2);
		
		System.out.println();
		System.out.println();
				
		Looping.charRow('a', 'z');
		
		System.out.println();
		System.out.println();
				
		Looping.charRow('Z', 'A');
		
		System.out.println();
		System.out.println();
		
		Looping.countDiv(1, 100, -5);
		
		System.out.println();
		System.out.println();
		
		int[] myarray ={3,1,2,3,2,1,2,1,1};
		Looping.arrayRow(myarray);
		
		System.out.println();
				
	}

}
