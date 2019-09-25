package objectorientiert;

class Auto {

	static void printAuto(Auto aX) {

		System.out.println((aX.modell == null ? "Dieses Auto" : aX.modell) + " fährt "
				+ (aX.speed == 0 ? "nicht!" : (aX.speed + " Km/St.")));

	}

	String modell;
	int speed;

	void printAuto() {

		System.out.println(
				(modell == null ? "Dieses Auto" : modell) + " fährt " + (speed == 0 ? "nicht!" : (speed + " Km/St.")));

	}

}

public class Autos {

	public static void main(String[] args) {

		Auto ford = new Auto();

		ford.printAuto();

		ford.modell = "Ford Ka";
		ford.speed = 106;

		System.out.println();

		Auto.printAuto(ford);

	}

}
