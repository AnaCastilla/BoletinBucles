package ejercicios;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir un número entero positivo
		 * 2. Calcular dicho número con sus cifras en orden inverso
		 * 3. Mostrar el resultado en una variable
		 */
		
		int n;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			//1. Introducir un número entero positivo
			System.out.println("Introduce un número entero positivo: ");
			n = keyboard.nextInt();
			if (n < 0) {
				System.out.println("ERROR! El número debe ser positivo");
			}
		} while (n < 0);
		
		System.out.println(reverse(n));
		
		keyboard.close();
		
		
	}
	
	public static int reverse (int n) {
		int reverse = 0, operating;
		// 2. Calcular dicho número con sus cifras en orden inverso
		operating = n; //guardamos n en una variable nueva
		do {
			reverse = reverse * 10 + operating % 10;  //en esta variable se van guardando los restos de la operacion div/10 por cada repetición del bucle
			operating = operating / 10;

		} while (operating != 0);
		return reverse;			
	}

}
