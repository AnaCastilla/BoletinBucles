package ejercicios;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {

		/*
		 * 1. Mostrar un menú al usuario sobre las operaciones que puede realizar 
		 * 2. Permitir que el usuario elija una opción
		 * 3. Se muestra el resultado de la operación elegida
		 * 4. Se le pregunta si quiere seguir o salir 
		 */

		int n1, n2, operation, elec1, elec2;
		final int SUM = 1, SUBTRACT = 2, MULTIPLY = 3, DIVIDE = 4, YES = 5, EXIT = 6;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("¡Bienvenido a esta Calculadora!");

		do {
			//1. Mostrar un menú al usuario sobre las operaciones que puede realizar 
			//2. Permitir que el usuario elija una opción
			System.out.println("¿Qué operación desea hacer?\n1. Suma\n2. Resta\n3. Multiplicar\n4. Dividir");
			elec1 = keyboard.nextByte();
			
			System.out.println("Introduzca 2 números: ");
			n1 = keyboard.nextInt();
			n2 = keyboard.nextInt();

			// 3. Se muestra el resultado de la operación elegida
			if (elec1 == SUM) {
				operation = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + operation);
			} else if (elec1 == SUBTRACT) {
				operation = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + operation);
			} else if (elec1 == MULTIPLY) {
				operation = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + operation);
			} else if (elec1 == DIVIDE) {
				if (n2 == 0) {
					System.out.println("Infinito");
				} else {
					operation = n1 / n2;
					System.out.println(n1 + " / " + n2 + " = " + operation);
				}
			} else {
				System.out.println("Opción incorrecta");
			}
				// 4. Se le pregunta si quiere seguir o salir
				System.out.println("¿Desea realizar otra operación?\n1. Sí (Pulse 5)\n2. No (Pulse 6)");
				elec2 = keyboard.nextInt();
				if (elec2 == EXIT) {
					System.out.println("¡Adiós!");
				} else if (elec2 != YES) {
					System.out.println("ERROR, número introducido no válido");
				}

		} while (elec2 == YES);

		keyboard.close();
	}

}
