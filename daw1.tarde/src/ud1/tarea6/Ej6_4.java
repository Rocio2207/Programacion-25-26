package ud1.tarea6;

import java.util.Scanner;

public class Ej6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el primer número");
		byte num1;
		num1 = sc.nextByte();
		
		System.out.println("Introduce el segundo número");
		byte num2;
		num2 = sc.nextByte();
		
		byte menor = 0;
		
		int comparacion = (num1 < num2) ? -1 : 1;
		
		switch (comparacion) {
			case -1:
				menor = num1;
				break;
				
			case 1:
				menor = num2;
				break;
		}
		
		System.out.println("El menor es " + menor);
		sc.close();
	}
}