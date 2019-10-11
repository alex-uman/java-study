package vererbung;

public class Safe {

	private char[] password;

	public Safe(char[] password) {

		setPassword(password);

	}

	public Safe(int length) {

		setRandomPassword(length);

	}

	private void setPassword(char[] password) {

		this.password = new char[password.length];

		for (int i = 0; i < password.length; i++)

			this.password[i] = password[i];

	}

	private void setRandomPassword(int length) {

		this.password = new char[length];

		for (int i = 0; i < length; i++)

			this.password[i] = (char) (int) ((Math.random() * (('z' - 'a') + 1)) + 'a');

	}

	public char[] getPassword() {

		return password;

	}

	public boolean open(char[] passwordToTry) {

		if (passwordToTry.length < password.length)

			return false;

		for (int i = 0; i < password.length; i++)

			if (passwordToTry[i] == ' ' || password[i] != passwordToTry[i])

				return false;

		return true;

	}
}
