package ud1.tarea5a;

import java.util.Scanner;

public class Ej5_4 {
	public static void main(String[] args) {
		Scanner numeros = new Scanner (System.in);
		
		System.out.println("Introduce el primer número");
		int num1;
		num1 = numeros.nextInt();
		
		System.out.println("Introduce el segundo número");
		int num2;
		num2 = numeros.nextInt();
		
		float dif1;
		dif1 = num1 % 2;
		
		float dif2;
		dif2 = num2 % 2;
		
		if (dif1 == 0 && dif2 == 0) 
		 System.out.println("Ambos números son pares");
		else if (dif1 != 0 && dif2 != 0)
			System.out.println("Ambos números son impares");
		
		if (dif1 == 0 && dif2 != 0)
			System.out.println("Solo un número es par");
		else if (dif1 != 0 && dif2 == 0)
			System.out.println("Solo un número es par");
	}
	
}
