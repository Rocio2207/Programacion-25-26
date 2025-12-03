package Exam;

import java.util.Scanner;

public class Ej2_examen {
	static void rellenaEncuesta(String[][]encuesta) {
		Scanner sc = new Scanner(System.in);
		
		boolean fin = false;
		int i = 0;
		int numEncuestas = 0;
		
		do {
			
			System.out.println("Introduce código postal (o 'fin' para terminar): ");
			encuesta[i][0]=sc.next();
			
			if (encuesta[i][0].equals("fin")) {
				fin = true;}
			else {	
				System.out.println("Introduce edad: ");
				encuesta[i][1]=sc.next();
			
				System.out.println("Introduce sexo (M/F): ");
				encuesta[i][2]=sc.next();}
			
			fin = (encuesta[i][0].equals("fin") || numEncuestas >= 500)? true:false;
			
			numEncuestas++;
			i++;
					
					
		}while(!fin);
	sc.close();}
	
	
	
	static void muestraResultados (String[][]encuesta) {
		
		System.out.println("\n--- Resultados de la encuesta ---");
		
		for (int i = 0; i < encuesta.length; i++) {
			System.out.println("Código Postal: " + encuesta[i][0] + ", Edad: " + encuesta[i][1] + ", Sexo: " + encuesta[i][2]);
		}
		
		System.out.println();
	}
	
	
	static int calculaMediaEdad( String[][] encuesta, char sexo, int codigoPostal) {
		
		int edades = 0;
		int contador = 0;
		
		for (int i = 0; i<encuesta.length; i++) {
			int temp = Integer.valueOf(encuesta[i][0]);
			if(temp == codigoPostal) {
				int letra = encuesta[i][3].charAt(0);
				if(letra == sexo) {
					int edad = Integer.valueOf(encuesta[i][2]);
					edades += edad;
					contador++;
				}
			}
		}
			
		int media = edades/contador;
		
		
	
	return media;}
	
	public static void main(String[] args) {
		String [][] encuesta = new String [500][3];
		Scanner sc = new Scanner(System.in);
		
		rellenaEncuesta(encuesta);
		muestraResultados(encuesta);
		
		System.out.println("Introduce código postal para calcular media: ");
		int codPostal = sc.nextInt();
		System.out.println("Introduce sexo (M/F): ");
		char sexo = sc.next().charAt(0);
		
		System.out.println("La media de edad asociada al CP " + codPostal + " y sexo " + sexo + " es: " + calculaMediaEdad(encuesta,sexo,codPostal));
		
	sc.close();}
	
	
}
