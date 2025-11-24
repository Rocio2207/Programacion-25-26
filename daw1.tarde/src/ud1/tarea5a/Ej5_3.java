package ud1.tarea5a;

import java.util.Scanner;

public class Ej5_3 {
	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		int num;
		num = numero.nextInt();
		
		int impar;
		
		float dif;
		dif = (float) num / 2;
		
		int division; 
		division = (int) num / 2;
		
		
		if (dif == division)
			System.out.println("Es par");
		else
			System.out.println("Es impar");
		

	}
}