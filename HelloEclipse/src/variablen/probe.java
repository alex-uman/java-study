package variablen;

public class probe {

	public static void main(String[] args) {
		
//		m1:
//			
//		for(int i=0;i<10;i++) {
//			
//			for(int j=0;j<3;j++) {
//				
//				if(i>j) {
//					
//					System.out.println("x"); continue m1;
//					
//				}
//				
//				System.out.println(j);
//				
//			}
//			
//			System.out.println("fin "+i);
//			
//		}
//		
//		System.out.println("ultima fin");
		
		
		
//		int i=1;
//		
//		switch (i) {
//		
//		case 1:
//			System.out.println(i);
//			
//		case 2:
//			System.out.println(i);
//		
//		}

		int day=2;
		
//		if(day<6 && day>0) System.out.println("3.A");
//		
//		else if (day==6||day==7) System.out.println("3.W");
//		
//		else System.out.println("3.???");
		
		
		switch (day) {
		
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: System.out.println("3.A"); break;
		case 6: 
		case 7: System.out.println("3.W"); break;
		default: System.out.println("3.???");
			
		}
		
		
	}

}
