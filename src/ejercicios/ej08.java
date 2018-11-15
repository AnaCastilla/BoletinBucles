package ejercicios;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir 2 números
		 * 2. Mostrar los valores de cada 1 cada vez que se repita el bucle
		 * 	2.1. Para a: el doble de su valor inicial que irá aumentando en 1 hasta que a > b (sus valores iniciales)
		 * 	2.2. Para b: la mitad de su valor inicial que irá disminuyendo en 1 
		 */
		
		int a, b, i = 0, j = 0;
		
		Scanner keyboard = new Scanner(System.in);
	
		do {
			//1. Pedir 2 números 
			System.out.println("Introduce 2 números enteros: ");
			a = keyboard.nextInt();
			b = keyboard.nextInt();
			if (a > b || a == b) {
				System.out.println("ERROR! a tiene que ser menor que b");
			}

		} while (a > b || a == b);
		keyboard.close();
		
		/*
		 * 2. Mostrar los valores de cada 1 cada vez que se repita el bucle
		 * 	2.1. Para a: el doble de su valor inicial que irá aumentando en 1 hasta que a > b (sus valores iniciales)
		 * 	2.2. Para b: la mitad de su valor inicial que irá disminuyendo en 1 
		 */
		for (i = a, j = b; i <= j; i*=2, j/=2) {
			System.out.printf("a: %d\n", i);
			System.out.printf("b: %d\n", j);
		}
	}

}
