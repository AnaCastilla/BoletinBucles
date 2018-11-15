package ejercicios;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir un número entero 
		 * 2. Imprimir el factorial de dicho número
		 */
		int n, factorial = 1, resultFact = 1;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			//1. Pedir un número entero 
			System.out.print("Introduce un número entero: ");
			n = keyboard.nextInt();
			if (n < 0) {
				System.out.println("ERROR, el número tiene que ser mayor que 0");
			}
		} while (n < 0);
		
		System.out.print(n + "! = ");
		//2. Imprimir el factorial de dicho número
		for (int i = 1; i <= n; i++) {
			factorial = i; //se imprime cada número hasta llegar a n
			resultFact *= i;//resultado del factorial
			System.out.print(factorial + " * ");
			if (i == n) {
				System.out.print("= " + resultFact);
			}
		}
		
		keyboard.close();
	}
}
