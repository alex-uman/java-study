package Date;

import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Calendar {

	public static void main(String[] args) {

		System.out.println();
		printCalendar(4, 2010);

	}

	static void printCalendar(int month, int year) {

		YearMonth yearMonth;

		try {
			yearMonth = YearMonth.of(year, month);
		} catch (DateTimeException e) {
			throw new DateTimeException("Falsche Datumsangabe!");
		}

		int monatslaenge = yearMonth.lengthOfMonth();

		System.out.println("---------------------");
		System.out.println(yearMonth.format(DateTimeFormatter.ofPattern("MMMM y")));
		System.out.println("---------------------");

		for (int i = 1; i <= monatslaenge; i++)
			System.out.printf(" %02d |   %-12s|%n", i, yearMonth.atDay(i).format(DateTimeFormatter.ofPattern("cccc")));

		System.out.println("---------------------");

	}
}
