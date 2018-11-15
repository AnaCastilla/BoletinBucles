package ejercicios;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir un número 
		 * 2. Calcular la suma de los números de 1 en 1 hasta que exceda el valor de m
		 */

		int m, i = 1, sum = 0;

		Scanner keyboard = new Scanner(System.in);

		do {
			//1. Pedir un número 
			System.out.print("Introduce un número: ");
			m = keyboard.nextInt();
			if (m <= 0) {
				System.out.println("ERROR! El número debe de ser mayor que 0");
			}
		} while (m <= 0);

		keyboard.close();

		//2. Calcular la suma de los números de 1 en 1 hasta que exceda el valor de m
		while (sum <= m) {
			sum += i;
			System.out.print(i + " + ");

			i++;
		}
		System.out.print("= " + sum);

	}

}
