package arrays;

public class ArraysTask {

	public static void main(String[] args) {

//		boolean[] bl = new boolean[200];
//
//		for (boolean i : bl)
//			System.out.print(i + " ");
//
//		System.out.println();
//		System.out.println();
//
//		for (int i = 1; i < 201; i += 2)
//			bl[i] = true;
//
//		for (boolean i : bl)
//			System.out.print(i + " ");
//
//		double[] mathConst = new double[2];
//
//		mathConst[0] = Math.PI;
//		mathConst[1] = Math.E;
//
//		for (double i : mathConst)
//			System.out.println(i);

		int[] a2 = { 1, 2, 3, 4 };
		int[] a1 = { 12, 13, 14 };

		int[] a3 = add(a1, a2);

		for (int i : a1)

			System.out.print(i + " ");

		System.out.println();
		System.out.println();

		for (int i : a2)

			System.out.print(i + " ");

		System.out.println();
		System.out.println();

		for (int i : a3)

			System.out.print(i + " ");

	}

	static int[] add(int[] a1, int[] a2) {

		int c1 = a1.length;
		int c2 = a2.length;

		if (c1 < c2) {

			int[] a = new int[c2];

			for (int i = 0; i < c2; i++)

				a[i] = a2[i];

			for (int i = 0; i < c1; i++)

				a[i] += a1[i];

			return a;

		}

		int[] a = new int[c1];

		for (int i = 0; i < c1; i++)

			a[i] = a1[i];

		for (int i = 0; i < c2; i++)

			a[i] += a2[i];

		return a;

	}

}
