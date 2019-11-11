package Enum;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class EnumSHunderassen {

	enum Hunderasse {

		DACKEL(0.5)
//		{
//			public String getRasse() {
//				return "Dackel";
//			}
//		}
		, COLLIE(1)
//		{
//			public String getRasse() {
//				return "Collie";
//			}
//		}
		, DOGGE(1.5);

		private double size;

		Hunderasse(double size) {
			this.size = size;
		}

//		public String getRasse() {
//			return "Dogge";
//		}

		public String toString() {
//			return getRasse() + ", max. Größe: " + size;
			return name().charAt(0) + name().substring(1).toLowerCase() + ", max. Größe: " + size;
		}

	}

	
	
	
	
	public static void main(String[] args) {

		System.out.println(Hunderasse.DACKEL);
		System.out.println(Hunderasse.COLLIE);
		System.out.println(Hunderasse.DOGGE);

	}
}
