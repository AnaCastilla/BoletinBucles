package ejercicios;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {

		int x, n, i, solution = 1;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce la base de la potencia: ");
		x = keyboard.nextInt();
		System.out.print("Introduce el exponente: ");
		n = keyboard.nextInt();
		
		keyboard.close();
		
		for (i = 1; i <= n; i++) {
			solution *= x;
		}
		
		System.out.println(x + " ^ " + n + " = " + solution);
	}

}
