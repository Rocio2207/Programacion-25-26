package Pruebas;

import java.util.Scanner;

public class Swich1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mes;

		System.out.println("Introduce el número de mes actual");
		mes = sc.nextInt();

		switch (mes) {
			case 1,2,12:
				System.out.println("Es invierno");
				break;
				
			case 3,4,5:
				System.out.println("Es primavera");
				break;

			case 6,7,8:
				System.out.println("Es verano");
				break;

			case 9,10,11:
				System.out.println("Es Otoño");
				break;
		
			default:
				System.out.println("El valor debe estar entre 1 y 12");

			sc.close();
		}
	}
}