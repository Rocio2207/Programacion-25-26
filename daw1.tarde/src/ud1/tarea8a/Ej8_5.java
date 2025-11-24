package ud1.tarea8a;

import java.util.Scanner;

public class Ej8_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vamos a crear un rango:");
		System.out.println("Introduce el valor mínimo del rango que deseas crear:");
		int min = sc.nextInt();
		System.out.println("Introduce el valor máximo del rango que deseas crear:");
		int max = sc.nextInt();
		
		boolean dentro = false;
		int num;
		System.out.println("Introduce un número dentro del rango: (" + min +  "-" + max + ")" );
		
		do {
			
			num = sc.nextInt();
			
			dentro = (num < max && num > min) ? true : false;
		
			if (dentro)
				System.out.println("Correcto, ese número esta dentro del rango.");
			else
				System.out.println("Incorrecto, inténtelo de nuevo:");
		}while(!dentro);
			
		sc.close();
		
		}
		
	}
