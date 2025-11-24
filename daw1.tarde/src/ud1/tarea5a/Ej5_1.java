package ud1.tarea5a;

import java.util.Scanner;

public class Ej5_1 {
	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		
		System.out.println("Introduce el número");
		int num;
		num = numero.nextInt();
		
		if (num > 0)
			System.out.println(num + " es positivo");
		else
			System.out.println(num + " es negativo");

	}
}