package Repaso_exam_1_clase;

import java.util.Scanner;

public class Ej3_hucha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int capacidad = 80; //No cambia, es un valor fijo = final
		int aportaciones = 0;
		int cantidad;
		int total = 0;
		boolean lleno = false;
		int resto = 80;
		
		System.out.println("Introduce una cantidad de dinero");
				
		do {
			
			cantidad = sc.nextInt();
						
			lleno = (total >= capacidad) ? true:false;
			
			if (cantidad < resto) {
				resto = resto - cantidad;
				aportaciones++;
				total = total + cantidad;
				System.out.println("Has hecho " + aportaciones + " ingresos, haciendo un total de " + total + "€, todavía puedes introducir " + resto + "€ más.");}
			else if (cantidad == resto) {
				resto = resto - cantidad;
				aportaciones++;
				total = total + cantidad;
				System.out.println("Hucha llena!!!! con " + aportaciones + " ingresos");}
			
			else  
				System.out.println("No tienes tanta capacidad, introduce menos dinero");
			
			
		}while(!lleno);
		
		System.out.println("Hucha llena");
		
		
	sc.close();}
}