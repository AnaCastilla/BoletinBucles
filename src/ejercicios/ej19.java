package ejercicios;

import java.util.Scanner;

public class ej19 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir un número positivo n que será la base y altura de la pirámide
		 * 2. Imprimir la pirámide, el cual contiene 1 número o más de 1 correlativos por cada fila
		 */

		int n;

		Scanner keyboard = new Scanner(System.in);

		do {
			// 1. Introducir un número positivo n que será la base y altura de la pirámide
			System.out.println("Introduce un número entero positivo: ");
			n = keyboard.nextInt();
			if (n < 0) {
				System.out.println("ERROR! El número debe ser positivo");
			}
		} while (n < 0);

		keyboard.close();

		//2. Imprimir la pirámide, el cual contiene 1 número o más de 1 correlativos por cada fila
		for (int i = 1; i <= n; i++) { // bucle para las filas

			for (int j = 1; j <= n; j++) { // bucle para los espacios
				if (i + j <= n) {
					System.out.print(" ");
				}
			}
			for (int k = 1; k <= i; k++) { //bucle para los números
					System.out.printf("%d ", k);
			}

				System.out.println();
			}
		}
	}

