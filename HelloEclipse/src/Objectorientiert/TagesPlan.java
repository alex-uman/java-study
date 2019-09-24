package Objectorientiert;

class Task {

	String description = "Nix zu tun - sei glücklich!";
	boolean done = false;

}

class DayList {

	Task[] todoList = new Task[24];

	String date = "Noch kein Datum gesetzt!";

}

public class TagesPlan {

	public static void main(String[] args) {

		DayList myList = new DayList();

		setList(myList);

		System.out.println("Datum der Liste prüfen:");
		System.out.println();

		checkDate(myList);

		System.out.println();
		System.out.println();
		System.out.println("Aufgaben prüfen:");
		System.out.println();

		showList(myList);

		System.out.println();
		System.out.println();
		System.out.println("Datum für die Liste setzen und wieder prüfen:");
		System.out.println();

		setDate(myList, "12.03.2017");

		checkDate(myList);

		System.out.println();
		System.out.println();
		System.out.println("Aufgabe prüfen:");
		System.out.println();

		checkTaskStatus(myList, 6);

		System.out.println();
		System.out.println();
		System.out.println("Aufgabe setzen und prüfen:");
		System.out.println();

		addTask(myList, 6, "Aufstehen vergessen");
		checkTaskStatus(myList, 6);

		System.out.println();
		System.out.println();
		System.out.println("Aufgabe korrigieren, Status ändern und die Liste ausgeben:");
		System.out.println();

		editTask(myList, 6, "Aufstehen NICHT vergessen!");
		setTaskStatus(myList, 6, true);
		showList(myList);

	}

	static void setList(DayList aList) {

		for (int i = 0; i < 24; i++)

			aList.todoList[i] = new Task();

	}

	static void addTask(DayList aList, int hour, String taskToDo) {

		if (aList.todoList[hour].description != "Nix zu tun - sei glücklich!") {

			System.out.println("Die Aufgabe für " + hour + " Uhr ist bereits erteilt!");

			return;

		}

		aList.todoList[hour].description = taskToDo;

	}

	static void removeTask(DayList aList, int hour) {

		aList.todoList[hour].description = "Nix zu tun - sei glücklich!";

		aList.todoList[hour].done = false;

	}

	static void editTask(DayList aList, int hour, String taskToDo) {

		if (aList.todoList[hour].description == "Nix zu tun - sei glücklich!") {

			System.out.println("Die Aufgabe für " + hour + " gibt es noch nicht!");

			return;

		}

		aList.todoList[hour].description = taskToDo;

	}

	static void setTaskStatus(DayList aList, int hour, boolean done) {

		if (aList.todoList[hour].description == "Nix zu tun - sei glücklich!") {

			System.out.println("Die Aufgabe für " + hour + " gibt es noch nicht!");

			return;

		}

		aList.todoList[hour].done = done;

	}

	static void checkTaskStatus(DayList aList, int hour) {

		if (aList.todoList[hour].description == "Nix zu tun - sei glücklich!") {

			System.out.println("Die Aufgabe für " + hour + " Uhr gibt es noch nicht!");

			return;

		}

		System.out.println("Die Aufgabe '" + aList.todoList[hour].description + "' für " + hour + " Uhr ist "
				+ (aList.todoList[hour].done ? "fertig!" : "noch nicht fertig!"));

	}

	static void setDate(DayList aList, String date) {

		aList.date = date;

	}

	static void checkDate(DayList aList) {

		if (aList.date == "Noch kein Datum gesetzt!") {

			System.out.println("Es ist kein Datum für diese Aufgabenliste gesetzt!");

			return;

		}

		System.out.println("Es ist die Aufgabenliste für " + aList.date);

	}

	static void showList(DayList aList) {

		if (aList.date != "Noch kein Datum gesetzt!") {
			System.out.println("Die Aufgabeliste für den " + aList.date);
			System.out.println("------------------------------------");
		}

		else {

			System.out.println("Die Aufgabeliste für diesen Tag");
			System.out.println("--------------------------------");
		}

		for (int i = 0; i < 24; i++) {

			if (aList.todoList[i].description == "Nix zu tun - sei glücklich!")

				System.out.println("Die Aufgabe für " + i + " Uhr gibt es nicht");

			else {

				System.out.println("Die Aufgabe '" + aList.todoList[i].description + "' für " + i + " Uhr ist "
						+ (aList.todoList[i].done ? "fertig!" : "noch nicht fertig!"));

			}

		}

	}

}