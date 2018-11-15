package ejercicios;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir un numero por teclado
		 * 2. Calcular el primer elemento de la serie Fibonacci que sea >= n teniendo en cuenta que:
		 * 			a0 = 0         a1 = 1      an = an-1 + an-2
		 * 3. Imprimir el resultado
		 */
		
		int num, fib = 0, n = 0, n1 = 1, n2 = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			// 1. Pedir un numero por teclado
			System.out.println("Introduce un número: ");
			num = keyboard.nextInt();
			if (num < 0) {
				System.out.println("ERROR! El número tiene que ser mayor que 0");
			}
		} while (num < 0);
		
		keyboard.close();
		
		/*
		 * 2. Calcular el primer elemento de la serie Fibonacci que sea >= n teniendo en cuenta que:
		 * 			a0 = 0         a1 = 1      an = an-1 + an-2
		 */
		System.out.println("Serie Fibonacci: ");
		while(fib <= num) {
			n = n1 + n2;
			
			fib = n;
			
			n2 = n1;
			n1 = n;
			num++;
			System.out.print(fib + " ");
		}
		
		System.out.println("\nEl número que buscas es: " + fib);
	}

}
