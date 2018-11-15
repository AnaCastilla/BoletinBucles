package ejercicios;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir 2 números 
		 * 2. Crear un bucle que recorra desde n1 hasta n2. Por cada repetición del bucle
		 * se va guardando en una variable, dependiendo de si es par o impar, dicho número más
		 * n1 + 1 debido al incremento al repetirse el bucle 
		 * 3. Mostrar la suma de los pares e impares
		 * 
		 */

		int n1, n2, pairSum = 0, impairSum = 0;

		Scanner keyboard = new Scanner(System.in);

		do {
			//1. Pedir 2 números 
			System.out.println("Introduce 2 números: ");
			n1 = keyboard.nextInt();
			n2 = keyboard.nextInt();
			if (n1 > n2) {
				System.out.println("ERROR! n1 tiene que ser menor que n2");
			}

		} while (n1 > n2);

		/* 2. Crear un bucle que recorra desde n1 hasta n2. Por cada repetición del bucle
		 * se va guardando en una variable, dependiendo de si es par o impar, dicho número más
		 * n1 + 1 debido al incremento al repetirse el bucle 
		 */ 
		while (n1 <= n2) {
			if (n1 % 2 == 0) {
				System.out.println(n1);
				pairSum = pairSum + n1;
			} else {
				System.out.println(n1);
				impairSum = impairSum + n1;
			}
			n1++;
		}
		//3. Mostrar la suma de los pares e impares
		System.out.println("Suma de los pares: " + pairSum);
		System.out.println("Suma de los impares: " + impairSum);
	
		keyboard.close();
	}

}
