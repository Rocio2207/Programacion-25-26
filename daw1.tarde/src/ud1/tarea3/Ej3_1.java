package ud1.tarea3;

import java.util.Scanner;

public class Ej3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el numero 1");
		byte num1;
		num1 = sc.nextByte();
		
		System.out.println("Introduce el numero 2");
		byte num2;
		num2 = sc.nextByte();
		
		byte resultado = (byte) (num1 + num2);
		
		System.out.println(num1 + " + " + num2 + " = " + resultado);
	}

}
