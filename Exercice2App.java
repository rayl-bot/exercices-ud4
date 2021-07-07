/*
 * Code by Raúl González Méndez
 * Version of the app (date dd/mm/yyyy): 07/07/2021
 * 
 * CONTENT README.txt-->En esta aplicacion tendremos que implementar ciertas mecánicas para demostrar que tenemos los conocimientos 
 * básicos del lenguaje java, en mi caso he optado por añadir todos los ejercicios en un mismo main separados de forma 
 * modular con ciertas separaciones de prints para indicar que ejercicio se está ejecutando.<--CONTENT README.txt
 * */

public class Exercice2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --Exercice2--Creations of variables, one variable int and one variable
		// double.
		int num2 = 5;
		double double2 = 4.56;
		char char1 = 'a';
		exercice2(num2, double2, char1);
		// Para mostrar el valor numerico de un char, es necesario pasar a int el valor
		// char, para ello castearemos,
		// el char como int al mostrarse por pantalla.
	}

	/*
	 * Escribe un programa Java que realice lo siguiente: declarar una variable N de
	 * tipo int , una variable A de tipo double y una variable C de tipo char y
	 * asigna a cada una un valor.
	 */

	public static void exercice2(int num1, double num2, char char1) {
		// Show on screen
		System.out.println("EXERCICE 2");
		System.out.println("-------------------------------------");
		System.out.println("Variables: Int: " + num1 + " Double: " + num2 + " Char: " + char1);
		System.out.println("Suma: " + (num1 + num2) + "\nResta: " + (num1 - num2) + "\nValor Numerico: " + (int) char1);
		System.out.println("-------------------------------------");
	}
}
