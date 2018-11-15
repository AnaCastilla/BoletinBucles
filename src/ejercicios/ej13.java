package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {

		/*
		 * 1. Se piden 2 números, 1 inferior al otro
		 * 2. Se introducen el número de intentos
		 * 3. Obtener 1 random entre 1 y 100 que el usuario tendrá que adivinar en ese número de intentos
		 * 4. Cuando introduzca un número, el programa dirá si el número es mayor, menor o igual
		 * 	  que el que ha obtenido. 
		 * 5. Si acierta en ese número de intentos, ha ganado, sino no
		 */
		
		int n1, n2, nTry, getRandom, numEnt, i;
		boolean guessed = false;
		
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
		
		
		//3. Obtener 1 random entre 1 y 100 que el usuario tendrá que adivinar en ese número de intentos
		System.out.println("Déjame pensar en un número...");
		getRandom = rnd.nextInt(n2 - n1 + 1) + n1;
		
		
		System.out.println("¡Empecemos el juego de adivinanzas!");
		/*
		 * 4. Cuando introduzca un número, el programa dirá si el número es mayor, menor o igual
		 * 	  que el que ha obtenido. 
		 */
		for (i = 1; i <= nTry && !guessed; i++) {
			System.out.println("Introduce un número: ");
			numEnt = keyboard.nextInt();
			if (numEnt < getRandom) {
				System.out.println("El número es mayor! Número de intentos: " + (nTry - i));
			} else if (numEnt > getRandom) {
				System.out.println("El número es menor! Número de intentos: " + (nTry - i));
			// 5. Si acierta en ese número de intentos, ha ganado, sino no
			} else {
				System.out.println("¡Has acertado! Enhorabuena :)");
				guessed = true;
			}
			if (i == nTry) {
				System.out.println("Se te han acabado el número de intentos, has perdido :(");
				guessed = false;
			}
		}
		
		keyboard.close();
	}

}
