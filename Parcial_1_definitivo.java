package parcial_1;

import java.util.Scanner;

public class Parcial_1_definitivo {

	final static Scanner ingreso = new Scanner(System.in);

	public static void main(String[] args) {
		
		final String JUGADOR_1 = "Ana";
		final String JUGADOR_2 = "Bartolo";
		final int RONDAS_MIN = 1;
		final int RONDAS_MAX = 5;
		int cantRondas;
		int contRondas = 0;
		int ptsJug1 = 0;
		int ptsJug2 = 0;
		
		String jugada1;
		String jugada2;
		String jugada1aux;
		String jugada2aux;
		
		final String PIEDRA = "1";
		final String PAPEL = "2";
		final String TIJERA = "3";
		
		boolean ganaJug1;
		boolean ganaJug2;
		boolean empate;
		
		//Cantidad de rondas
		System.out.println("Indique la cantidad de rondas que se jugarán (Entre 1 y 5)");
		cantRondas = Integer.parseInt(ingreso.nextLine());
		while (cantRondas < RONDAS_MIN || cantRondas > RONDAS_MAX) {
			System.out.println("El número seleccionado es inválido. Ingrese una opción válida");
			cantRondas = Integer.parseInt(ingreso.nextLine());
		}
		
		do {		
			//Jugador 1
			System.out.println("Elija una jugada, " + JUGADOR_1 + ": 1. Piedra 2. Papel 3. Tijera");
			jugada1 = ingreso.nextLine();
			
			while (!((jugada1.equals(PIEDRA)) || (jugada1.equals(PAPEL)) || (jugada1.equals(TIJERA)))) {
				System.out.println("La opción ingresada es inválida. Elija de nuevo: 1. Piedra 2. Piedra 3. Tijera");
				jugada1 = ingreso.nextLine();
			}
			
			//Jugador 2
			System.out.println("Elija una jugada, " + JUGADOR_2 + ": 1. Piedra 2. Papel 3. Tijera");
			jugada2 = ingreso.nextLine();
			
			while (!((jugada2.equals(PIEDRA)) || (jugada2.equals(PAPEL)) || (jugada2.equals(TIJERA)))) {
				System.out.println("La opción ingresada es inválida. Elija de nuevo: 1. Piedra 2. Piedra 3. Tijera");
				jugada2 = ingreso.nextLine();
			}
			//Retomo valor de la jugada 2
			switch (jugada1) {
			case PIEDRA:
				jugada1aux = "piedra";
				break;
			case PAPEL:
				jugada1aux = "papel";
				break;
			case TIJERA:
				jugada1aux = "tijera";
				break;
			default:
				jugada1aux ="tijera";
				break;
			}
			
			//Retomo valor de la jugada 2
			switch (jugada2) {
			case PIEDRA:
				jugada2aux = "piedra";
				break;
			case PAPEL:
				jugada2aux = "papel";
				break;
			case TIJERA:
				jugada2aux = "tijera";
				break;
			default:
				jugada2aux ="tijera";
				break;
			}
			
			//Muestro la jugada
			System.out.println(JUGADOR_1 + " juega..." + jugada1aux);
			System.out.println(JUGADOR_2 + " juega..." + jugada2aux);
			
			//Resultados
			ganaJug1 = ((jugada1.equals(PIEDRA) && jugada2.equals(TIJERA)) || (jugada1.equals(PAPEL) && jugada2.equals(PIEDRA)) || (jugada1.equals(TIJERA) && jugada2.equals(PAPEL)));
			ganaJug2 = ((jugada1.equals(PIEDRA) && jugada2.equals(PAPEL)) || (jugada1.equals(PAPEL) && jugada2.equals(TIJERA)) || (jugada1.equals(TIJERA) && jugada2.equals(PIEDRA)));
			empate =  ((jugada1.equals(PIEDRA) && jugada2.equals(PIEDRA)) || (jugada1.equals(PAPEL) && jugada2.equals(PAPEL)) || (jugada1.equals(TIJERA) && jugada2.equals(TIJERA)));
			
			//Asigno puntajes
			if (ganaJug1) {
				System.out.println("La ganadora es Ana");
				ptsJug1++;
			} else {
				if (ganaJug2) {
					System.out.println("El ganador es Bartolo");
					ptsJug2++;
				} else {
					System.out.println("Hay empate");
				}
			}
			contRondas++;
			
		} while (contRondas != cantRondas);
	
		System.out.println("El jugador " + JUGADOR_1 + " ha obtenido " + ptsJug1 + " puntos");
		System.out.println("El jugador " + JUGADOR_2 + " ha obtenido " + ptsJug2 + " puntos");
		
	}

}