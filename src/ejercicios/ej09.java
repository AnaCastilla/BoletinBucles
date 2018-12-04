package ejercicios;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {

		int x, n;
		
		Scanner keyboard = new Scanner(System.in);
		
		//1. Introducir una base
		System.out.print("Introduce la base de la potencia: ");
		x = keyboard.nextInt();
		//2. Introducir una potencia
		System.out.print("Introduce el exponente: ");
		n = keyboard.nextInt();
		
		keyboard.close();
		
		//3. Se muestra el resultado
		System.out.println(x + " ^ " + n + " = " + baseExponent(x, n));
	}
	
	public static int baseExponent(int x, int n) {
		int i, solution = 1;
		for (i = 1; i <= n; i++) {
			solution *= x;
		}
		
		return solution;
	}

}
