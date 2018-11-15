package ejercicios;

public class ej21 {

	public static void main(String[] args) {

		final String RESET = "\u001B[0m";
		final String FONDO_NEGRO = "\u001B[40m";
		final String FONDO_BLANCO = "\u001B[47m";
		final int CASILLAS = 8;
		int fila, columna;
		
		System.out.println("   1 2 3 4 5 6 7 8 ");
		for (fila = 1; fila <= CASILLAS; fila++) {
			System.out.print(fila + " ");
			
			for (columna = 1; columna <= CASILLAS; columna++) {
				
				if (fila % 2 == 1 && columna % 2 == 1 || fila % 2 == 0 && columna % 2 == 0) {
					System.out.print(FONDO_BLANCO + "  " + RESET);
				} else {
					System.out.print(FONDO_NEGRO + "  " + RESET);
				}
			}
			System.out.println();
		}
		
	}

}
