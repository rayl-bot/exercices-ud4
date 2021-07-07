/*
 * Code by Ra�l Gonz�lez M�ndez
 * Version of the app (date dd/mm/yyyy): 07/07/2021
 * 
 * CONTENT README.txt-->En esta aplicacion tendremos que implementar ciertas mec�nicas para demostrar que tenemos los conocimientos 
 * b�sicos del lenguaje java, en mi caso he optado por a�adir todos los ejercicios en un mismo main separados de forma 
 * modular con ciertas separaciones de prints para indicar que ejercicio se est� ejecutando.<--CONTENT README.txt
 * */

public class Exercice4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --Exercice4--Creations of variable, one variable int.
		int a = 5;
		exercice4(a);
	}

	/*
	 * Escribe un programa Java que declare una variable entera N y as�gnale un
	 * valor. A continuaci�n escribe las instrucciones que realicen los siguientes
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
