package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {

		/*
		 * 1. El programa debe adivinar el tipo que hemos pensado:
		 * 	- Un número del 0 al 9
		 * 	- Una vocal minúscula
		 * 	- Una consonante minúscula (sin contar la ñ)
		 * 2. Tiene 2 intentos para averiguar eso, si no lo averigua se acaba el juego y pierde, si lo averigua
		 * 	  se continúa con la segunda parte del juego
		 * 3. El programa debe adivinar la letra o el número que hemos pensado, teniendo cierto número de intentos para cada caso:
		 * 	- Para el número: 3 intentos
		 *  - La vocal minúscula: 2 intentos
		 *  - La consonante minúscula: 5 intentos
		 * 4. Si es consonante, ayudar al programa diciéndole si es mayor o menor según el orden alfabético 
		 * 5. Si sobrepasa el número de intentos, pierde, si no, gana
		 */
		
		int randomPart1, randomNum, repeat = 1, randomVowel, randomConsonant;
		String elec;
		boolean exit = false;
		final int NTRYPART1 = 2, NUM = 1, MINUSVOCAL = 2, MINUSCONS = 3, NTRYNUM = 3, NTRYMINUSVOC = 2, NTRYMINUSCONS = 5;
		final String YES = "s", NO = "n", VOWELS = "aeiou", CONSONANTS = "bcdfghijklmnpqrstvwxyz";
		
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("Juego de adivinanza");
		System.out.println("-----PARTE 1-----\nTengo que adivinar en qué tipo has pensado...");
		System.out.println("1. Un número del 0 al 9\n2. Una vocal minúscula\n3. Una consonante minúscula (sin contar la ñ)");
		
		do {
			randomPart1 = rnd.nextInt(3)+1;
			System.out.println("He elegido la opción (" + randomPart1 + "), ¿he acertado? s/n");
			elec = keyboard.nextLine();
			
			if (elec.equals(YES)) {
				exit = true;
				System.out.println("Pasemos a la siguiente parte...");
				if (randomPart1 == NUM) {
					repeat = 1;
					do {
						randomNum = rnd.nextInt(9)+1;
						System.out.println("He elegido el número (" + randomNum + "), ¿he acertado? s/n" );
						elec = keyboard.nextLine();
						if (elec.equals(YES)) {
							exit = true;
							System.out.println("¡Gané!");
						} else if (elec.equals(NO)) {
							System.out.println("Número de intentos: " + (NTRYNUM-repeat));
							repeat ++;
							exit = false;
						} else {
							System.out.println("Respuesta incorrecta");
							exit = false;
						}
					} while (repeat <= NTRYNUM && !exit);
				} else if (randomPart1 == MINUSVOCAL) {
					repeat = 1;
					do {
					randomVowel = rnd.nextInt(5); //5 porque hay 5 vocales
					System.out.println("He elegido la vocal (" + VOWELS.charAt(randomVowel) + "), ¿he acertado? s/n"); 
					elec = keyboard.nextLine();
						if (elec.equals(YES)) {
							System.out.println("¡Gané!");
						} else if (elec.equals(NO)) {
							System.out.println("Número de intentos: " + (NTRYMINUSVOC-repeat));
							repeat ++;
							exit = false;
						} else {
							System.out.println("Respuesta incorrecta");
							exit = false;
						}
					} while (repeat <= NTRYMINUSVOC && !exit);
				} else if (randomPart1 == MINUSCONS){
					repeat = 1;
					do {
					randomConsonant = rnd.nextInt(22); //22 porque hay 22 letras en el abecedario quitando la ñ y las vocales
					System.out.println("He elegido la consonante (" + CONSONANTS.charAt(randomConsonant) + "), ¿he acertado? s/n");
					elec = keyboard.nextLine();
						if (elec.equals(YES)) {
							System.out.println("¡Gané!");
							exit = true;
						} else if (elec.equals(NO)) {
							System.out.println("Número de intentos: " + (NTRYMINUSCONS-repeat));
							repeat ++;
							exit = false;
						} else {
							System.out.println("Respuesta incorrecta");
							exit = false;
						}
					} while (repeat <= NTRYMINUSCONS && !exit);
				}
			} else if (elec.equals(NO)) {
				System.out.println("Número de intentos: " + (NTRYPART1-repeat));
				repeat++;
			
			} else {
				System.out.println("Respuesta incorrecta");
			}
			
			if (repeat > NTRYPART1) {
				System.out.println("Se acabó el juego");
			}
			
		} while (repeat <= NTRYPART1 && !exit);
		
		keyboard.close();
	}

}
