/*
 * Code by Raúl González Méndez
 * Version of the app (date dd/mm/yyyy): 07/07/2021
 * 
 * CONTENT README.txt-->En esta aplicacion tendremos que implementar ciertas mecánicas para demostrar que tenemos los conocimientos 
 * básicos del lenguaje java, en mi caso he optado por añadir todos los ejercicios en un mismo main separados de forma 
 * modular con ciertas separaciones de prints para indicar que ejercicio se está ejecutando.<--CONTENT README.txt
 * */

public class Exercice4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --Exercice4--Creations of variable, one variable int.
		int a = 5;
		exercice4(a);
	}

	/*
	 * Escribe un programa Java que declare una variable entera N y asígnale un
	 * valor. A continuación escribe las instrucciones que realicen los siguientes
	 */

	public static void exercice4(int a) {
		// Show on screen
		System.out.println("EXERCICE 4");
		System.out.println("-------------------------------------");
		System.out.println("Valor inicial de a: " + a);
		System.out.println("a + 77 = " + (a += 77));
		System.out.println("a - 3= " + (a -= 3));
		System.out.println("a * 2= " + (a *= 2));
		System.out.println("-------------------------------------");
	}

}
