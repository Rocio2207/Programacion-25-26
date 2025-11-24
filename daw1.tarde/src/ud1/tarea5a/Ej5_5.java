package ud1.tarea5a;

import java.util.Scanner;

public class Ej5_5 {
	public static void main(String[] args) {
		Scanner numeros = new Scanner (System.in);
		
		System.out.println("Introduce el primer número");
		long num1;
		num1 = numeros.nextLong();
		
		System.out.println("Introduce el segundo número");
		long num2;
		num2 = numeros.nextLong();

		System.out.println("Introduce el tercer número");
		long num3;
		num3 = numeros.nextLong();
		
		if(num1 > num2)
			if(num1 > num3)
				System.out.println(num1 + " es mayor que " + num2 + " y " + num3 );
			else
				System.out.println(num3 + " es mayor que " + num1 + " y " + num2 );
		else
			if(num2 > num3)
				System.out.println(num2 + " es mayor que " + num1 + " y " + num3 );
			else
				System.out.println(num3 + " es mayor que " + num1 + " y " + num2 );

		
		
	}
}