package main;

import javax.swing.text.html.HTML.Tag;

class Datum {

	int d;
	int m;
	int y;

}

public class Calendary {

	public static void main(String[] args) {

		Datum tag1 = new Datum();
		tag1.d = 11;
		tag1.m = 10;
		tag1.y = 2011;

		Datum tag2 = new Datum();
		tag2.d = 21;
		tag2.m = 2;
		tag2.y = 2014;

		System.out.println(checkDays(tag1, tag2));

	}

	static int checkDays(Datum tag1, Datum tag2) {

		if (!checkDatumDMY(tag1) || !checkDatumDMY(tag2))
			return -1;

		if (timeSumme(tag1) == timeSumme(tag2))
			return 0;

		if (timeSumme(tag1) > timeSumme(tag2)) {

			Datum tagX = new Datum();

			tagX = tag2;

			tag2 = tag1;

			tag1 = tagX;

		}

		return 111;

	}

	static int timeSumme(Datum tag) {

//		System.out.println(tag.y * 10000 + tag.m * 100 + tag.d);

		return tag.y * 10000 + tag.m * 100 + tag.d;

	}

	static int jahresTage(Datum tag) {

		return tag.y % 4 == 0 ? 366 : 365;

	}

	static boolean checkDatumDMY(Datum tag) {

		if (tag != null) {

			if (tag.y > 0 && tag.m > 0 && tag.m < 13) {

				switch (tag.m) {
				case 4:
				case 6:
				case 9:
				case 11:

					if (tag.d < 31)

						return true;
				case 2:

					if (jahresTage(tag) == 366)

						if (tag.d < 30)

							return true;

						else if (tag.d < 29)

							return true;

				default:

					if (tag.d < 32)

						return true;

				}

			}

		}

		return false;

	}

}