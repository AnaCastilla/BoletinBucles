package ejercicios;

import java.util.Scanner;

public class ej20 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir un número positivo n que será el número de filas
		 * 2. Pintar tantas filas como se haya introducido
		 * 3. Qué pintar en cada fila
		 * 	3.1. Pintar tantos espacios como número de filas menos la fila en la que estoy
		 * 	3.2. Pintar números: 
		 * 		3.2.1. Pintar la 1era mitad de la izquierda: pinto desde 1  hasta el número de fila en la que estoy 
		 * 		3.2.2. Pintar la 2a mitad de la derecha: pintar desde el número de fila en la que estoy -1 hasta 1
		 */

		int n, i;

		Scanner keyboard = new Scanner(System.in);

		do {
			// 1. Introducir un número positivo n que será la base y altura de la pirámide
			System.out.println("Introduce un número entero positivo del 0 al 10: ");
			n = keyboard.nextInt();
			if (n < 0 || n >= 10) {
				System.out.println("ERROR! El número debe ser positivo o mayor que 10");
			}
		} while (n < 0 || n >= 10);

		keyboard.close();
		
		//2. Pintar tantas filas como se haya introducido
		for (int fila = 1; fila <= n; fila++) { // bucle para las filas
			//3. Qué pintar en cada fila
			//	3.1. Pintar tantos espacios como número de filas menos la fila en la que estoy
			for (i = 1; i <= n - fila; i++) { // bucle para los espacios
					System.out.print(" ");
				
			}
			/*
			 *	3.2. Pintar números: 
			 *		3.2.1. Pintar la 1era mitad de la izquierda: pinto desde 1  hasta el número de filas
			 */
			for (i = 1; i <= fila; i++) {
					System.out.print(i);
			}
			// 3.2.2. Pintar la 2a mitad de la derecha: pintar desde el número de fila en la que estoy -1 hasta 1
			for (i = fila - 1; i >= 1; i--) {
				System.out.print(i);
			}

				System.out.println(); //Como la fila ha terminado, pinto un salto de linea 
			}
	}

}
