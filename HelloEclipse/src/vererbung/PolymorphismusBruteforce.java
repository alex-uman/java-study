package vererbung;

import java.util.Arrays;

abstract class Bruteforce{
	
}


public class PolymorphismusBruteforce {

	public static final int COUNT = 4;

	public static void main(String[] args) {

		Safe safe = new Safe(COUNT);

		System.out.println(safe.getPassword());
		System.out.println("----");
		System.out.println();
		System.out.println();

		hack(safe, COUNT);

		System.out.println("End of hacking");

	}

	static void hack(Safe safe, int count) {

		char[] password = initTry(count);

		System.out.println("Hacking...\n");

		for (;;) {

			if (safe.open(password)) {

				System.out.println("Hacked! password is: " + Arrays.toString(password));

				return;

			}

			password = moveNext(password);

		}

	}

	static char[] initTry(int count) {

		char[] password = new char[count];

		for (int i = 0; i < count; i++)

			password[i] = 'a';

		return password;

	}

	static char[] moveNext(char[] password) {

		for (int i = password.length - 1; i >= 0; i--) {

			if (password[i] < 'z') {

				password[i]++;

				return password;
			}

			else {

				password[i] = 'a';

			}

		}

		return password;

	}

}
