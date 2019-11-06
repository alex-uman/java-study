package Exceptions;

public class IsNum {

	public static void main(String[] args) {

		System.out.println(isInteger("10"));
		System.out.println(isInteger("Word"));
		System.out.println(isInteger(""));
		System.out.println(isInteger(null));
		
	}

	static boolean isInteger(String string) {
		try {
			Integer.parseInt(string);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

}
