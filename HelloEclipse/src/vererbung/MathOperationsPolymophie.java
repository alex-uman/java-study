package vererbung;

abstract class IntOperation {

	abstract int execute(int x);

	abstract String operation();

}

class AddOne extends IntOperation {

	int execute(int x) {

		return ++x;

	}

	String operation() {

		return " + 1";

	}

}

class SubtraktOne extends IntOperation {

	int execute(int x) {

		return --x;

	}

	String operation() {

		return " - 1";

	}

}

class Square extends IntOperation {

	int execute(int x) {

		return x * x;

	}

	String operation() {

		return "²";

	}

}

class Negate extends IntOperation {

	int execute(int x) {

		return -x;

	}

	String operation() {

		return " * (-1)";

	}

}

public class MathOperationsPolymophie {

	public static void main(String[] args) {

		IntOperation[] op = new IntOperation[4];

		op[0] = new AddOne();
		op[1] = new SubtraktOne();
		op[2] = new Square();
		op[3] = new Negate();

		int x = 3;

		int y;

		for (IntOperation operation : op) {

			y = x;

			x = operation.execute(x);

			System.out.println(y + operation.operation() + " = " + x);

		}

	}

}
