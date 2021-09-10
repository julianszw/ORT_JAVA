package thp_parcial1;

import java.util.Scanner;

public class THP_parcial_resolucion_definitiva {

	final static Scanner ingreso = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//Datos a ingresar
		int piso;
		int depto;
		int perros;
		int gatos;
				
		// Datos a mostrar
		int deptosEncuestados = 0;
		int gatoMasAlto = 0;
		int algunaMascota = 0;
		double porcMascotas;
		int soloUnaMascota = 0;
		int rangoPiso;
			
		//Constantes
		final int PISO_MIN = 1;
		final int PISO_MAX = 30;
		final int DEPTOS_MIN = 1;
		final int DEPTOS_RANGO1_MAX = 4;
		final int DEPTOS_RANGO2_MAX= 3;
		final int DEPTOS_RANGO3_MAX= 2;
		final int PERROS_MIN = 0;
		final int GATOS_MIN = 0;
		final int FIN = 0;
		
		//Ingreso el piso
		System.out.println("Ingrese el piso en el que vive");
		piso = Integer.parseInt(ingreso.nextLine());
		if (piso >= 1 && piso <=10) {
			rangoPiso = 1;
		} else {
			if (piso >= 11 && piso <=20) {
				rangoPiso = 2;
			} else {
				if (piso >= 21 && piso <=30) {
					rangoPiso = 3;
				} else {
					rangoPiso = 0;
				}
			}
		}
		
		
				
		//Si el piso no es 0, tomo el resto de los datos
		if (piso != FIN) {
			while ((piso < PISO_MIN || piso > PISO_MAX)) {
				System.out.println("El piso indicado es inválido. Ingrese un número entre 1 y 30");
				piso = Integer.parseInt(ingreso.nextLine()); 
			}
			if (piso >= 1 && piso <=10) {
				rangoPiso = 1;
			} else {
				if (piso >= 11 && piso <=20) {
					rangoPiso = 2;
				} else {
					if (piso >= 21 && piso <=30) {
						rangoPiso = 3;
					} else {
						rangoPiso = 0;
					}
				}
			}
			
			
			
			//Ingreso y valido el depto
			System.out.println("Ingrese el departamento en el que vive");
			depto = Integer.parseInt(ingreso.nextLine());
		
				//Deptos 1-10
			if ((rangoPiso ==1) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO1_MAX)) {
				do {
					System.out.println("El departamento indicado es incorrecto. Seleccione un número entre 1 y 4");
					depto = Integer.parseInt(ingreso.nextLine());
				} while ((rangoPiso ==1) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO1_MAX));
				
			}
				//Deptos 11-20
			if ((rangoPiso == 2) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO2_MAX)) {
				do {
					System.out.println("El departamento indicado es incorrecto. Seleccione un número entre 1 y 3");
					depto = Integer.parseInt(ingreso.nextLine());
				} while ((rangoPiso == 2) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO2_MAX));
				
			}
				//Deptos 21-30
			if ((rangoPiso == 3) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO3_MAX)) {
				do {
					System.out.println("El departamento indicado es incorrecto. Seleccione un número entre 1 y 2");
					depto = Integer.parseInt(ingreso.nextLine());
				} while ((rangoPiso == 3) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO3_MAX));
				
			}
			
			//Ingreso la cantidad de perros
			System.out.println("¿Cuántos perros tiene en su departamento?");
			perros = Integer.parseInt(ingreso.nextLine());
			if (perros < PERROS_MIN) {
				do {
					System.out.println("El número ingresado no es válido. Vuelva a indicar la cantidad de perros");
					perros = Integer.parseInt(ingreso.nextLine());
				} while (perros < PERROS_MIN);
			}
			
			//Ingreso la cantidad de gatos
			System.out.println("¿Cuántos gatos tiene en su departamento?");
			gatos = Integer.parseInt(ingreso.nextLine());
			if (gatos < GATOS_MIN) {
				do {
					System.out.println("El número ingresado no es válido. Vuelva a indicar la cantidad de gatos");
					gatos = Integer.parseInt(ingreso.nextLine());
				} while (gatos < GATOS_MIN);
			}
			
			//Valores para mostrar	
			deptosEncuestados++;
			
			
			if (perros > PERROS_MIN || gatos > GATOS_MIN) {
				algunaMascota++;				
			}
			
			porcMascotas = (algunaMascota*100)/deptosEncuestados;
			
			if ((perros > PERROS_MIN && gatos == 0) || (gatos > GATOS_MIN && perros == 0)) {
				soloUnaMascota++;
			}
			
			if (piso >= gatoMasAlto && gatos > GATOS_MIN) {
				gatoMasAlto = depto;
			}
			
				
		}
		
		
		//Si el piso es 0, no llego a completar ninguna encuesta
		if (piso == 0) {
			System.out.println("No se encuestaron departamentos");
		//Si el primer ingreso fue válido, inicio un ciclo para realizar encuestas  	
		} else {
			//Encuesto departamentos hasta que el usuario ingrese la salida
			while (piso != FIN) {
				//Ingreso el piso
				System.out.println("Ingrese el piso en el que vive");
				piso = Integer.parseInt(ingreso.nextLine());
				

				if (piso != FIN) {
						
					//Valido el piso
					while ((piso < PISO_MIN || piso > PISO_MAX) && piso !=0) {
						System.out.println("El piso indicado es inválido. Ingrese un número entre 1 y 30");
						piso = Integer.parseInt(ingreso.nextLine()); 
					}
					if (piso >= 1 && piso <=10) {
						rangoPiso = 1;
					} else {
						if (piso >= 11 && piso <=20) {
							rangoPiso = 2;
						} else {
							if (piso >= 21 && piso <=30) {
								rangoPiso = 3;
							} else {
								rangoPiso = 0;
							}
						}
					}
					
					
					
					
					//Ingreso y valido el depto
					System.out.println("Ingrese el departamento en el que vive");
					depto = Integer.parseInt(ingreso.nextLine());
						//Deptos 1-10
					if ((rangoPiso == 1) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO1_MAX)) {
						do {
							System.out.println("El departamento indicado es incorrecto. Seleccione un número entre 1 y 4");
							depto = Integer.parseInt(ingreso.nextLine());
						} while ((rangoPiso == 1) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO1_MAX));
						
					}
						//Deptos 11-20
					if ((rangoPiso == 2) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO2_MAX)) {
						do {
							System.out.println("El departamento indicado es incorrecto. Seleccione un número entre 1 y 3");
							depto = Integer.parseInt(ingreso.nextLine());
						} while ((rangoPiso == 2) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO2_MAX));
						
					}
					
						//Deptos 21-30
					if ((rangoPiso == 3) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO3_MAX)) {
						do {
							System.out.println("El departamento indicado es incorrecto. Seleccione un número entre 1 y 2");
							depto = Integer.parseInt(ingreso.nextLine());
						} while ((rangoPiso == 3) && (depto < DEPTOS_MIN || depto > DEPTOS_RANGO3_MAX));
						
					}
					
					//Ingreso y valido la cantidad de perros
					System.out.println("¿Cuántos perros tiene en su departamento?");
					perros = Integer.parseInt(ingreso.nextLine());
					if (perros < PERROS_MIN) {
						do {
							System.out.println("El número ingresado no es válido. Vuelva a indicar la cantidad de perros");
							perros = Integer.parseInt(ingreso.nextLine());
						} while (perros < PERROS_MIN);
					}
					
					//Ingreso y valido la cantidad de gatos
					System.out.println("¿Cuántos gatos tiene en su departamento?");
					gatos = Integer.parseInt(ingreso.nextLine());
					if (gatos < GATOS_MIN) {
						do {
							System.out.println("El número ingresado no es válido. Vuelva a indicar la cantidad de gatos");
							gatos = Integer.parseInt(ingreso.nextLine());
						} while (gatos < GATOS_MIN);
					}
					
					// Actualizo valores en los datos a mostrar
					deptosEncuestados++;
					
					
					if (perros > PERROS_MIN || gatos > GATOS_MIN) {
						algunaMascota++;
					}
					
					if ((perros > PERROS_MIN && gatos == 0) || (gatos > GATOS_MIN && perros == 0)) {
						soloUnaMascota++;
					}
					
					if (piso >= gatoMasAlto && gatos > GATOS_MIN) {
						gatoMasAlto = piso;
					}
					
				}
			}
			
			porcMascotas = (algunaMascota*100)/deptosEncuestados;

			//Muestro por pantalla los datos solicitados
			System.out.println("Departamentos encuestados: " + deptosEncuestados);
			System.out.println("Porcentaje de departamentos con mascotas: " + porcMascotas + "%");
			System.out.println("Departamentos con solo perro o gato: " + soloUnaMascota);
			System.out.println("El gato que vive más arriba: " + gatoMasAlto);
				
			}	

	}

}