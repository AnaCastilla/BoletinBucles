package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir 2 números por teclado que serán los extremos del rango
		 * 2. Se generan 15 números aleatorios entre dicho rango
		 */
		
		int num1, num2, randomNum;
		
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();

		//1. Pedir 2 números por teclado que serán los extremos del rango
		do {
		System.out.println("Introduce 2 números: ");
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		
		if (num1 > num2) {
			System.out.println("ERROR! n1 tiene que ser menor que n2");
		}
		} while(num1 > num2);
		
		//2. Se generan 15 números aleatorios entre dicho rango
		System.out.println("Números aleatorios entre " + num1 + " y " + num2 + ":");
		for (int i = 1; i <= 15; i++) {
			randomNum = rnd.nextInt((num2 - num1) + 1) + num1;
			System.out.println(randomNum);
		}
		
		keyboard.close();
		
	}

}
