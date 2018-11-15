package ejercicios;

import java.util.Scanner;

public class ej22 {

	public static void main(String[] args) {

		int fila, columna, fila_user, columna_user;
		final int CASILLAS = 8;

		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Introduzca la casilla que desee");
			System.out.println("Fila: ");
			fila_user = keyboard.nextInt();
			System.out.println("Columna: ");
			columna_user = keyboard.nextInt();
		} while (fila_user >= CASILLAS && columna_user >= CASILLAS);

		System.out.println("   1 2 3 4 5 6 7 8");

		// Para crear el número de filas
		for (fila = 1; fila <= CASILLAS; fila++) {
			System.out.print(fila + " "); // Para imprimir las filas con su
											// respectivo número de fila del 1
											// al 8

			// Para crear el número de columnas
			for (columna = 1; columna <= CASILLAS; columna++) {

				if (fila % 2 == 1 && columna % 2 == 1 || fila % 2 == 0 && columna % 2 == 0) { // Para pintar las
																								// casillas en blanco se
																								// tiene que cumplir una
																								// de estas condiciones.
																								// si no, se pinta en
																								// negro

					System.out.print(Colores.FONDO_BLANCO + "  " + Colores.RESET);
				} else if (fila == fila_user && columna == columna_user) {
					System.out.print(Colores.FONDO_ROJO + " *" + Colores.RESET);

				} else if (fila_user - columna_user == fila - columna || fila_user + columna_user == fila + columna) {
					System.out.print(Colores.FONDO_ROJO + "  " + Colores.RESET);
				} else {
					System.out.print(Colores.FONDO_NEGRO + "  " + Colores.RESET);

				}

			}
			System.out.println();
		}

		keyboard.close();

	}
}
