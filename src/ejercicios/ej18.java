package ejercicios;

import java.util.Scanner;

public class ej18 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir un número entero positivo n
		 * 2. Dibujar un rombo de asteriscos con base y altura n
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
		
		primeraMitad(n);
		segundaMitad(n);
	}

		//2. Dibujar un rombo de asteriscos con base y altura n
	
		//FUNCIÓN PARA LA PRIMERA MITAD DEL ROMBO
		public static void primeraMitad(int n) {
		for (int i = 1; i <= n; i++) { //bucle para las filas de la primera mitad del rombo
			
			for (int j = 1; j <= n; j++) { //bucle para los espacios de la primera mitad del rombo
				if (i + j <= n) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
		
		//FUNCIÓN PARA LA SEGUNDA MITAD DEL ROMBO
		public static void segundaMitad(int n) {
		for (int i = n - 1; i > 0; i--) {  //bucle para las filas de la segunda mitad del rombo
			
			for (int j = 1; j <= n; j++) { //bucle para los espacios de la segunda mitad del rombo
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