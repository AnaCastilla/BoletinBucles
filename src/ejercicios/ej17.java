package ejercicios;

import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir un número entero positivo n
		 * 2. Dibujar una pirámide de asteriscos con base y altura n
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
		
		keyboard.close();
		
		//2. Dibujar una pirámide de asteriscos con base y altura n
		for (int i = 1; i <= n; i++) { //bucle para las filas
			
			for (int j = 1; j <= n; j++) { //bucle para los espacios 
				if (i + j <= n) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
