/*
 * Code by Ra�l Gonz�lez M�ndez
 * Version of the app (date dd/mm/yyyy): 07/07/2021
 * 
 * CONTENT README.txt-->En esta aplicacion tendremos que implementar ciertas mec�nicas para demostrar que tenemos los conocimientos 
 * b�sicos del lenguaje java, en mi caso he optado por a�adir todos los ejercicios en un mismo main separados de forma 
 * modular con ciertas separaciones de prints para indicar que ejercicio se est� ejecutando.<--CONTENT README.txt
 * */

public class Exercice1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --Exercice1--Creations of variables, I have decide to use one variable int
		// and one variable double.
		int num1 = 15;
		double double1 = 4.56;
		exercice1(num1, double1);

	}

	/*
	 * Declara dos variables num�ricas (con el valor que desees), muestra por
	 * consola la suma, resta, multiplicaci�n, divisi�n y m�dulo (resto de la
	 * divisi�n).
	 */

	public static void exercice1(int num1, double num2) {
		// Show on screen
		System.out.println("EXERCICE 1");
		System.out.println("-------------------------------------");
		System.out.println("Suma: " + (num1 + num2) + "\nResta: " + (num1 - num2) + "\nMultiplication: " + (num1 * num2)
				+ "\nDivide: " + (num1 / num2) + "\nModule: " + (num1 % num2));
		System.out.println("-------------------------------------");

	}

}
