package ud1.tarea5a;

import java.util.Scanner;

public class Ej5_3_bien_hecho {
	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		int num;
		num = numero.nextInt();
		
		float dif;
		dif = num % 2;
		
		
		if (dif == 0)
			System.out.println("Es par");
		else
			System.out.println("Es impar");
		

	}
}