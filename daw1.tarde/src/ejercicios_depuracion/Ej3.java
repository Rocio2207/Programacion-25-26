package ejercicios_depuracion;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el número");
		num = sc.nextInt();
		
		if (esPrimo(num)) {
			System.out.println("Il número " + num + " es primo");
		}else {
			System.out.println("Il número " + num + " no es primo");
		}
	}
}
