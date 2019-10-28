package list;

class Rennwagen {

	private String name;
	private Motor motor = new Motor();
	private Fahrer fahrer;

	Rennwagen(String name) {
		this.name = name;
	}

	Rennwagen(String name, Motor motor) {
		this(name);
		this.motor = motor;
	}

	Rennwagen(String name, Motor motor, Fahrer fahrer) {
		this(name, motor);
		this.fahrer = fahrer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMotorName(String motor) {
		this.motor = new Motor(motor);
	}

	public void setFahrer(Fahrer fahrer) {
		this.fahrer = fahrer;
	}

	public String getName() {
		return name;
	}

	public Motor getMotor() {
		return motor;
	}

	public Fahrer getFahrer() {
		return fahrer;
	}

	public String toString() {
		return "Rennwagen " + name + (fahrer == null ? "" : ". Fahrer: " + fahrer);
	}

	class Motor {

		private String name;

		Motor(String name) {
			this.name = name;
		}

		Motor() {
			this("Type 1");
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public String toString() {
			return "Motor " + name + " aus dem Rennwagen " + Rennwagen.this.name;
		}

	}

	static class Fahrer {

		private String vorname, nachname;

		Fahrer(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
		}

		public void setVorname(String vorname) {
			this.vorname = vorname;
		}

		public void setNachname(String nachname) {
			this.nachname = nachname;
		}

		public void setName(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
		}

		public String getVorname() {
			return vorname;
		}

		public String getNachname() {
			return nachname;
		}

		public String getName() {
			return (vorname == null || vorname == "" ? "" : vorname + " ") + nachname;
		}

		public String toString() {
			return getName();
		}

	}

}

public class Rennautos {

	public static void main(String[] args) {

		Rennwagen rw = new Rennwagen("Mercedes");
		System.out.println(rw);
		
		Rennwagen.Fahrer f = new Rennwagen.Fahrer("M.", "Schuhmacher");
		rw.setFahrer(f);
		System.out.println(rw);

		Rennwagen.Motor m = rw.getMotor();
		System.out.println(m);

		rw.setMotorName("Type 2");
		m = rw.getMotor();
		System.out.println(m);

	}

}
