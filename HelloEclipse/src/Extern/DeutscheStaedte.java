package Extern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;

import java.util.ArrayList;
import java.util.List;
import java.net.MalformedURLException;

import java.time.LocalDate;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class Stadt {
	private String name, bundesland;
	private int einwohnerzahl = 0;

	Stadt(String name, String bundesland, int einwohnerzahl) {
		this.name = name;
		this.bundesland = bundesland;
		this.einwohnerzahl = einwohnerzahl;
	}

	public String getName() {
		return name;
	}

	public String getBundesland() {
		return bundesland;
	}

	public int getEinwohnerzahl() {
		return einwohnerzahl;
	}

	public String toString() {
		return "Stadt: " + name + ", Bundesland: " + bundesland + " Einwohnerzahl: " + einwohnerzahl;
	}

}

public class DeutscheStaedte {

	public static void main(String[] args) throws IOException {

		LocalDate d = LocalDate.EPOCH;

		d = LocalDate.of(1108, 02, 29);

		System.out.println(d);

		String s = null;

		System.out.println(s);

		s = "Java";

		System.out.println(s);

		s += " ist toll";

		System.out.println(s);

		s = new String();

		System.out.println(s);

		ArrayList<Stadt> staedte = new ArrayList<>();

		String line = getCities("https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland");

		System.out.println(line);

		printList(staedte);

		System.out.flush();
	}

	static String getCities(String url) throws IOException {

		String line = null;
		Document doc;

		java.net.URL html = new java.net.URL(url);
		InputStream is = html.openStream();
		Reader r = new InputStreamReader(is);
		try (BufferedReader in = new BufferedReader(r)) {

			StringBuilder sb = new StringBuilder();

			while ((line = in.readLine()) != null) {
				sb.append(line).append("\n");
			}

			doc = Jsoup.parse(url);

		} catch (IOException e) {
			throw new UncheckedIOException("Kann die Quelle nicht lesen", e);
		}

		System.out.println(line);

//		System.out.println(doc);

//		Elements table = doc.getElementsByTag("table");

		Elements allePTags = doc.getElementsByTag("name");
//		System.out.println(allePTags);

//		System.out.println(table);

		return line;
	}

	static void printList(List list) {
		list.forEach(i -> System.out.println(i));
	}

}
