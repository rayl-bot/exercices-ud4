/*
 * Code by Raúl González Méndez
 * Version of the app (date dd/mm/yyyy): 07/07/2021
 * 
 * CONTENT README.txt-->En esta aplicacion tendremos que implementar ciertas mecánicas para demostrar que tenemos los conocimientos 
 * básicos del lenguaje java, en mi caso he optado por añadir todos los ejercicios en un mismo main separados de forma 
 * modular con ciertas separaciones de prints para indicar que ejercicio se está ejecutando.<--CONTENT README.txt
 * */

public class Exercice3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// --Exercice3--Creations of variables, two variables int and two variables
		// double.
		int val1 = 2, val2 = 3;
		double dob1 = 1.5, dob2 = 2.5;
		exercice3(val1, val2, dob1, dob2);
	}

	/*
	 * Escribe un programa Java que realice lo siguiente: declarar dos variables X e
	 * Y de tipo int , dos variables N y M de tipo double y asigna a cada una un
	 * valor. A continuación muestra por
	 */

	public static void exercice3(int val1, int val2, double dob1, double dob2) {
		// Show on screen
		System.out.println("EXERCICE 3");
		System.out.println("-------------------------------------");
		System.out.println("Variables: Int1: " + val1 + " Int2: " + val2 + " Double1: " + dob1 + " Double2: " + dob2);
		System.out.println("Int1+Int2: " + (val1 + val2) + "\nInt1-Int2: " + (val1 - val2) + "\nInt1*Int2: "
				+ (val1 * val2) + "\nInt1/Int2: " + (val1 / val2) + "\nInt1%Int2: " + (val1 % val2));
		System.out.println("Double1+Double2: " + (dob1 + dob2) + "\nDouble1-Double2: " + (dob1 - dob2)
				+ "\nDouble1*Double2: " + (dob1 * dob2) + "\nDouble1/Double2: " + (dob1 / dob2) + "\nDouble1%Double2: "
				+ (dob1 % dob2));
		System.out.println("Int1+Double1: " + (val1 + dob1) + "\nInt2/Double2: " + (val2 - dob2) + "\nInt2%Double2: "
				+ (val2 % dob2));
		System.out.println("Variables x 2: Int1: " + val1 * 2 + " Int2: " + val2 * 2 + " Double1: " + dob1 * 2
				+ " Double2: " + dob2 * 2);
		System.out.println("Suma Total: " + (val1 + val2 + dob1 + dob2));
		System.out.println("Producto Total: " + (val1 * val2 * dob1 * dob2));
		System.out.println("-------------------------------------");
	}

}
