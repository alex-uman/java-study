package list;

import java.util.ArrayList;
import java.io.*;

public class AufgabeWrapperZahlenLaden {

	public static void main(String[] args) {

		printArrayList(loadArrayFromFile("C:\\Locate\\Zahlen.txt"));

	}

	static ArrayList<Integer> loadArrayFromFile(String pathToFile) {

		ArrayList<Integer> zahlen = new ArrayList<>();

		try (BufferedReader in = new BufferedReader(new FileReader(pathToFile))) {

			String line;
			while ((line = in.readLine()) != null) {

				if ((line.substring(0, 1).matches("[0-9]+") || line.substring(0, 1).matches("-"))
						&& line.substring(1).matches("[0-9]+")) {
					zahlen.add(Integer.parseInt(line));

				}
			}

		} catch (IOException e) {
			throw new UncheckedIOException("Kann die Datei nicht lesen", e);
		}

		return zahlen;

	}

	static void printArrayList(ArrayList<Integer> zahlen) {

		for (Integer i : zahlen)
			System.out.printf("%10d%n", i);

	}

}
