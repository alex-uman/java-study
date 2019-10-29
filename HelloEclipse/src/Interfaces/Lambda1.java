package Interfaces;

public class Lambda1 {

	interface Combiner {
		int combine(int a, int b);
	}

	static class Adder implements Combiner {
		public int combine(int a, int b) {
			return a + b;
		}
	}

	public static void main(String[] args) {

		Combiner c1 = new Adder();

		System.out.println(c1.combine(2, 3));

		Combiner c2 = (i1, i2) -> i1 + i2;

		System.out.println(c2.combine(2, 3));

		Combiner c3 = (i1, i2) -> i1 - i2;

		System.out.println(c3.combine(2, 3));
	}

}
