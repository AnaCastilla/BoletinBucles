package ejercicios;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir un número entero positivo
		 * 2. Calcular dicho número con sus cifras en orden inverso
		 * 3. Mostrar el resultado en una variable
		 */
		
		int n, result, div;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			//1. Introducir un número entero positivo
			System.out.println("Introduce un número entero positivo: ");
			n = keyboard.nextInt();
			if (n < 0) {
				System.out.println("ERROR! El número debe ser positivo");
			}
		} while (n < 0);
		
		keyboard.close();
		
		// 2. Calcular dicho número con sus cifras en orden inverso
		div = n; //guardamos n en una variable nueva 
		while(div > 0) {
			result = div % 10; //en esta variable se van guardando los restos de la operacion div/10 por cada repetición
								//del bucle y se van mostrando
			System.out.print(result);
			div = div / 10;		
		}
	}

}
