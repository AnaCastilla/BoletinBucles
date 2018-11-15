package ejercicios;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir por teclado 2 números positivos 
		 * 2. Calcular el producto de ambos usando sumas
		 */

		int num1, num2, product = 0, i = 1;

		Scanner keyboard = new Scanner(System.in);

		do {
			// 1. Introducir por teclado 2 números positivos
			System.out.println("Introduce 2 números positivos:  ");
			num1 = keyboard.nextInt();
			num2 = keyboard.nextInt();
		} while (num1 < 0 || num2 < 0);
		
		keyboard.close();
		
		//2. Calcular el producto de ambos usando sumas
		while (i <= num2) {
			product += num1;
			System.out.println(product);
			i++;
		}
		
		
		
	}

}
