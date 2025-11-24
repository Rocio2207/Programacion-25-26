package Repaso_exam_1_clase;

import java.util.Scanner;

public class Ej4_cajero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int capacidad = 80; //No cambia, es un valor fijo = final
		int aportaciones = 0;
		int cantidad;
		int total = 0;
		boolean lleno = false;
		int resto = 80;
		String tipoOperacion;
		
		
				
		do {
			System.out.println("¿Qué tipo de operación desea realizar (retirada/ingreso)?");
			tipoOperacion = sc.nextLine().toLowerCase();
			
			lleno = (total >= capacidad) ? true:false;
			
			switch(tipoOperacion) {
			
				case "ingreso":
					System.out.println("Introduce una cantidad de dinero");
					cantidad = sc.nextInt();
					if (cantidad < resto) {
						resto = resto - cantidad;
						aportaciones++;
						total = total + cantidad;
						System.out.println("Has hecho " + aportaciones + " transacciones, haciendo un total de " + total + "€, te quedan " + resto + "€ hasta llegar a 80€.");}
					else if (cantidad == resto) {
						resto = resto - cantidad;
						aportaciones++;
						total = total + cantidad;
						System.out.println("Hucha llena!!!! con " + aportaciones + " ingresos");}
			
					else  
						System.out.println("El cajero no tiene tanta capacidad, introduce menos dinero");
					break;
					
				case "retirada":
					System.out.println("Introduce una cantidad de dinero");
					cantidad = sc.nextInt();
					if (cantidad < resto) {
						resto = resto + cantidad;
						aportaciones++;
						total = total - cantidad;
						System.out.println("Has hecho " + aportaciones + " transacciónes, por lo que tienes un total de " + total + "€, te quedan " + resto + "€ hasta llegar a 80€.");}
					else if (cantidad == resto) {
						resto = resto + cantidad;
						aportaciones++;
						total = total - cantidad;
						System.out.println("Tu cuenta esta vacía!!!! y has hecho " + aportaciones + " transacciones");}
			
					else  
						System.out.println("No tienes tanto dinero en la cuenta, intenta retirar menos dinero");
					break;}
			
			
		}while(!lleno);
		
		
		
		
	sc.close();}
}