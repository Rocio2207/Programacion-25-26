package ud1.tarea8b;

import java.util.Scanner;

public class Ej8b_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la altura de la pirámide:");
		int altura = sc.nextInt();
		System.out.println("Introduce el carácter con el que desea dibujar la pirámide:");
		char simbolo = sc.next().charAt(0);
		
		
		for (int i = 1; i <= altura; i++) {
			
			for (int j = 1; j <= (altura-i); j++) {
				System.out.print(" ");
				}
			
			for (int k = 1; k <= (i * 2 - 1); k++) {
				System.out.print(simbolo);
			}
			
			System.out.println();
			
		}
		
		sc.close();}
}