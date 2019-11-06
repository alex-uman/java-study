package Exceptions;

public class TryCatch {

	public static void main(String[] args) {

//		mayBeException();

		tryUntil();

	}

	static void mayBeException() {

		if ((int) (Math.random() * 2) == 0)
			throw new NullPointerException("Just because!");

	}

	static void tryUntil() {

		try {
			mayBeException();
			System.out.println("Erfolg!");
		} catch (Exception e) {
			System.out.println("Exception!");
			tryUntil();
		}

	}

}
