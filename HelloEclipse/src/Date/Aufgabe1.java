package Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aufgabe1 {

	public static void main(String[] args) {

//		for (int i = 1890; i < 2021; i += 2)
//			System.out.println(i + " " + (i % 4 == 0) + " " + LocalDate.of(i, 1, 1).isLeapYear());

		String t = LocalDateTime.now().format(DateTimeFormatter.ofPattern(".M.yy"));
		System.out.println(t);

	}

}
