package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el número 1");
		int a;
		a = sc.nextInt();
		
		System.out.println("Introduce el número 2");
		int b;
		b = sc.nextInt();
		
		System.out.println("Introduce el número 3");
		int c;
		c = sc.nextInt();
		
		int menor, medio, mayor;
		
		if (a <= b && a < c) {
			mayor = a;
			if(b > c)
				medio = b;
				menor = c;
			
			
		}
		System.out.println("El mayor es: " );		
	}
}