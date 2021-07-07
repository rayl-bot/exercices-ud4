/*
 * Code by Ra�l Gonz�lez M�ndez
 * Version of the app (date dd/mm/yyyy): 07/07/2021
 * 
 * CONTENT README.txt-->En esta aplicacion tendremos que implementar ciertas mec�nicas para demostrar que tenemos los conocimientos 
 * b�sicos del lenguaje java, en mi caso he optado por a�adir todos los ejercicios en un mismo main separados de forma 
 * modular con ciertas separaciones de prints para indicar que ejercicio se est� ejecutando.<--CONTENT README.txt
 * */

public class Exercice5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// --Exercice5--Creations of variables, 4 variables int.
		int A = 1, B = 2, C = 3, D = 4;
		exercice5(A, B, C, D);
	}

	/*
	 * Programa java que declare cuatro variables enteras A, B, C y D y as�gnale un
	 * valor a cada una. A continuaci�n realiza las instrucciones
	 */

	public static void exercice5(int A, int B, int C, int D) {
		// Show on screen before operate
		System.out.println("EXERCICE 5");
		System.out.println("-------------------------------------");
		System.out.println("Valores iniciales de A,B,C,D: " + A + " " + B + " " + C + " " + D);
		B = C;
		C = A;
		A = D;
		D = B;
		// Show on screen after operate
		System.out.println("Valores finales de A,B,C,D: " + A + " " + B + " " + C + " " + D);
		System.out.println("---------------FINAL-----------------");
	}

}
