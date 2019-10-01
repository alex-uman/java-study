package arrays;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.sql.Date;
import java.util.Arrays;

class Fighter {

	private static int MIN_CHANCE = 5;
	private static int MAX_CHANCE = 10;

	private String name;
	private int chance;

	Fighter(String name) {

		this.name = name;

		chance = MIN_CHANCE + (int) (Math.random() * (MAX_CHANCE - MIN_CHANCE + 1));

	}

	String getName() {

		return name;

	}

	int getCance() {

		return chance;

	}

	public String toString() {

		return name + ", the chance to win:" + chance + "%";

	}

}

class Pool {

	private static int COUNT = 8;

	private String name;
	private Fighter[] fighters;

	private Pool(int count) {

		fighters = new Fighter[count];

//		for (int i = 0; i < this.fighters.length; i++)
//
//			this.fighters[i] = new Fighter("");

		name = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);

	}

	Pool() {

		this(COUNT);

	}

	boolean checkFighter(String name) {

		for (Fighter fighter : fighters)

			if (fighter != null && fighter.getName() == name)

				return true;

		return false;

	}

	void setFighter(Fighter fighter) {

		if (checkFighter(fighter.getName()))

			return;

		for (int i = 0; i < fighters.length; i++) {

			if (fighters[i] == null) {

				fighters[i] = fighter;

				return;

			}

		}

		System.out.println("Die Kämpferliste ist bereits voll!");

	}

	void setFighter(String name) {

		Fighter fighter = new Fighter(name);

		this.setFighter(fighter);

	}

	public String toString() {

		String poolValue = "Die Kämpferliste von " + name + "\n\n";

		for (Fighter fighter : fighters)

			if (fighter != null)

				poolValue += fighter.toString() + '\n';

		return poolValue;
	}

}

public class LetsFight {

	public static void main(String[] args) {

		Pool aPool = new Pool();

		aPool.setFighter("Burke");
		aPool.setFighter("Steinhofer");
		aPool.setFighter("Rumba");
		aPool.setFighter("Valeev");
		aPool.setFighter("Pavlovich");
		aPool.setFighter("Markus");
		aPool.setFighter("Mauerbach");
		aPool.setFighter("Stamm");

		System.out.println(aPool);

		Fighter[][] pairs = new Fighter[2][];

	}

	static Fighter[] copyFighters(Fighter[] oldFighters) {

		Fighter[] newFighters = new Fighter[oldFighters.length];

		for (int i = 0; i < oldFighters.length; i++)

			newFighters[i] = oldFighters[i];

		return newFighters;

	}

	static Fighter[] copyRemainFighters(Fighter[] oldFighters) {

		int count = 0;

		for (Fighter fighter : oldFighters)

			if (fighter != null)

				count++;

		Fighter[] newFighters = new Fighter[count];

		for (int i = 0; i < count; i++)

			newFighters[i] = oldFighters[i];

		return newFighters;

	}

	static Fighter[][] setPairs(Fighter[] fighters) {

		int count = (int) (fighters.length / 2);

		Fighter[] actualFighters = copyFighters(fighters);

		Fighter[][] pairs = new Fighter[2][count];

		for (int j = 0; j < count; j++) {

			for (int i = 0; i < 2; i++) {

				int random = (int) (Math.random() * (count + 1));

				pairs[i][j] = actualFighters[random];

				actualFighters[random] = null;
				
				Fighter[] remainFighters = copyRemainFighters(actualFighters);

				actualFighters = new Fighter[remainFighters.length];

				actualFighters = copyFighters(remainFighters);

			}

		}

		return pairs;

	}

}
