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

	Fighter[] getFighterPool() {

		return this.fighters;

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

		Fighter[] fighterPool = copyFighters(aPool.getFighterPool());

		pairs = setPairs(fighterPool);

		printPairs(pairs);

		fighterPool = fightRound(pairs);

		pairs = setPairs(fighterPool);

		printPairs(pairs);

		fighterPool = fightRound(pairs);

		pairs = setPairs(fighterPool);

		printPairs(pairs);

		fighterPool = fightRound(pairs);

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

		int j = 0;

		for (int i = 0; i < oldFighters.length; i++)

			if (oldFighters[i] != null)

				newFighters[j++] = oldFighters[i];

		return newFighters;

	}

	static Fighter[][] setPairs(Fighter[] actualFighters) {

		int pairCount = (int) (actualFighters.length / 2);

		int count = actualFighters.length;

		Fighter[][] pairs = new Fighter[2][pairCount];

		for (int j = 0; j < pairCount; j++) {

			for (int i = 0; i < 2; i++) {

				int random = (int) (Math.random() * count);

				pairs[i][j] = actualFighters[random];

				actualFighters[random] = null;

				actualFighters = copyRemainFighters(actualFighters);

				count--;

			}

		}

		return pairs;

	}

	static void printPairs(Fighter[][] pairs) {

		String pairsString = "Es sind die folgenden Kampfpaare ermittelt worden:" + "\n\n";

		for (int j = 0; j < pairs[0].length; j++)

			pairsString += (j + 1) + ". Paar: " + pairs[0][j].getName() + " vs " + pairs[1][j].getName() + '\n';

		System.out.println(pairsString);

	}

	static Fighter[] fightRound(Fighter[][] pairs) {

		for (int j = 0; j < pairs[0].length; j++)

			fight(pairs, j);

		Fighter[] remainFighters = new Fighter[pairs[0].length];

		for (int j = 0; j < pairs[0].length; j++)

			if (pairs[0][j] == null)

				remainFighters[j] = pairs[1][j];

			else

				remainFighters[j] = pairs[0][j];

		return remainFighters;

	}

	static void fight(Fighter[][] pair, int pairNumber) {

		int random;

		System.out.println(pair[0][pairNumber].getName() + " vs " + pair[1][pairNumber].getName() + "\n\nKampf!\n");

		for (;;) {

			random = (int) (Math.random() * 101);

			if (random > pair[0][pairNumber].getCance())

				System.out.println(pair[0][pairNumber].getName() + " schlägt, aber ohne Erfolg");

			else {

				System.out.println(pair[0][pairNumber].getName() + " gewinnt mit einem KO!\n");

				pair[1][pairNumber] = null;

				return;

			}

			random = (int) (Math.random() * 101);

			if (random > pair[1][pairNumber].getCance())

				System.out.println(pair[1][pairNumber].getName() + " schlägt, aber ohne Erfolg");

			else {

				System.out.println(pair[1][pairNumber].getName() + " gewinnt mit einem KO!\n");

				pair[0][pairNumber] = null;

				return;

			}

		}

	}

}
