package Pruebas;

import java.util.Scanner;

public class Swich2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mes;

		System.out.println("Introduce el número de mes actual");
		mes = sc.nextLine().toLowerCase();

		switch (mes) {
			case "diciembre", "enero", "febrero":
				System.out.println("Es invierno");
				break;
				
			case "marzo", "abril", "mayo":
				System.out.println("Es primavera");
				break;

			case "junio", "julio", "agosto":
				System.out.println("Es verano");
				break;

			case "septiembre", "octubre", "noviembre":
				System.out.println("Es Otoño");
				break;
		
			default:
				System.out.println("El valor debe estar entre enero y diciembre");

			sc.close();
		}
	}
}
