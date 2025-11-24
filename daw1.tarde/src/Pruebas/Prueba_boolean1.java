package Pruebas;

import java.util.Scanner;

public class Prueba_boolean1 {
	public static void main(String[] args) {
		Scanner num = new Scanner (System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad;
		edad = num.nextInt();
		
		boolean pasa = (edad >= 18) ? true : false;
		
		if (pasa)
			System.out.println("Adelante, puedes pasar");
		else
			System.out.println("No puedes pasar, no tienes la edad necesria");
		
		num.close();}
}