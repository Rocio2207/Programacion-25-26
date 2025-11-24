package ud1.tarea5a;

import java.util.Scanner;

public class Ej5_2 {
	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		
		System.out.println("Introduce el número 12");
		int num;
		num = numero.nextInt();
		
		if (num == 12)
			System.out.println("Buen trabajo");
		else
			System.out.println("Número incorrecto");

	}
}