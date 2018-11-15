package ejercicios;

import java.util.Random;

public class ej04 {

	public static void main(String[] args) {

		int dice;
		
		Random rnd = new Random();
		
		/*
		 * Lanzamos un dado 20 veces que dará 20 resultados aleatorios por
		 * cada lanzamiento (del 1 al 6: las caras del dado)
		 */
		System.out.println("Se lanza el dado...");
		for (int i = 1; i <= 20; i++) {
			dice = rnd.nextInt(6)+1;
			System.out.println("Lanzamiento " + i + ": " + dice);
		}

	}

}
