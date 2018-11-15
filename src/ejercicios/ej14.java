package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {

		/*
		 * 1. Se piden 2 números, 1 inferior al otro
		 * 2. Se introducen el número de intentos
		 * * Pensar en un número que la máquina tendrá que adivinar *
		 * 3. Cuando diga un número, responderle mediante teclado si ese número es mayor, menor o igual al que yo he pensado 
		 * 4. Si acierta en ese número de intentos, ha ganado, sino no
		 */
		
		int n1, n2, nTry, getRandom, numEnt, i;
		boolean guessed = false;
		final int MAYOR = 1, MENOR = 2, NUMGUESSED = 3;
		
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();

		
		//1. Se piden 2 números, 1 inferior al otro
		do {
			System.out.println("Introduce 2 números, el primero inferior al otro: ");
			n1 = keyboard.nextInt();
			n2 = keyboard.nextInt();
			if (n1 > n2) {
				System.out.println("ERROR! n1 tiene que ser menor que n2");
			}
		} while (n1 > n2);
		
		//2. Se introducen el número de intentos
		do {	
			System.out.println("Introduce un número de intentos: ");
			nTry = keyboard.nextInt();
			if (nTry < 1) {
				System.out.println("El número de intentos no puede ser ni negativo ni 0");
			}
		} while (nTry < 1);
		
		System.out.println("¡Empecemos el juego de adivinanzas!");
		// Cuando diga un número, responderle mediante teclado si ese número es mayor, menor o igual al que yo he pensado  	 
		for (i = 1; i <= nTry && !guessed; i++) {
			System.out.println("Pienso en un número...");
			getRandom = rnd.nextInt(n2 - n1 + 1) + n1;
			System.out.println("Número " + getRandom + "! Es mayor, menor o he acertado?\n1. Mayor\n2. Menor\n3. Has acertado");
			numEnt = keyboard.nextInt();
			if (numEnt == MAYOR) {
				System.out.println("El número es mayor! Número de intentos: " + (nTry - i));
			} else if (numEnt == MENOR) {
				System.out.println("El número es menor! Número de intentos: " + (nTry - i));
			// 5. Si acierta en ese número de intentos, ha ganado, sino no
			} else if (numEnt == NUMGUESSED){
				System.out.println("¡He acertado! :)");
				guessed = true;
			}
			if (i == nTry && guessed == false) {
				System.out.println("Se me han acabado el número de intentos, he perdido :(");
			}
		}
		
		keyboard.close();
	}

}
