package ejercicios;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir un número entre 0 y 10 por teclado
		 * 2. Mostrar la tabla de multiplicar de dicho número 
		 */
		int num, mult, i=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			//1. Pedir un número entre 0 y 10 por teclado
			System.out.print("Introduce un número entre 0 y 10: ");
			num = keyboard.nextInt();
		} while (num < 0 || num > 10);
		
		System.out.println("TABLA DE MULTIPLICAR DEL " + num);
		//2. Mostrar la tabla de multiplicar de dicho número 
		while (i <= 10) {
			mult = num * i;
			System.out.println(num + " x " + i + " = " + mult);
			i++;
		}
		
		keyboard.close();
	}

}
