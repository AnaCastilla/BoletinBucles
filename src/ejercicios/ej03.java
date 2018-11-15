package ejercicios;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {

		/*
		 * 
		 * 1. Introducir 10 notas (del 0 al 10)
		 * 2. Mostrar cuantas veces aparece cada uno
		 */
		float note, n = 0;
		int very_deficient = 0, insufficient = 0, passed = 0, good = 0, notable = 0, outstanding =0;
		//Declaramos estos contadores para que cada vez que introduzcamos un número, dependiendo
		//de cual sea, se cuente que ha aparecido 1 o x veces
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Introduce 1 nota hasta 10 veces: ");
			note = keyboard.nextFloat();
			if (note < 0 || note > 10) {
				System.out.println("ERROR! La nota debe ser del 1 al 10");
			}
			if (note == 0 || note <= 2) {
				very_deficient++;
			} else if (note == 3 || note == 4) {
				insufficient++;
			} else if (note == 5) {
				passed++;
			} else if (note == 6) {
				good++;
			} else if (note == 7 || note == 8) {
				notable++;
			} else if (note == 9 || note == 10) {
				outstanding++;
			}
			
			n++;
		} while (n < 10); //10 porque se repite 10 veces (introducimos 10 notas)
		
		System.out.println("Muy deficientes: " + very_deficient);
		System.out.println("Insuficientes: " + insufficient);
		System.out.println("Aprobados: " + passed);
		System.out.println("Bien: " + good);
		System.out.println("Notables: " + notable);
		System.out.println("Sobresalientes: " + outstanding);
		keyboard.close();
		
	}

}
