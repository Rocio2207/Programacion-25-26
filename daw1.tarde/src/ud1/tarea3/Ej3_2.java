package ud1.tarea3;

import java.util.Scanner;

public class Ej3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu año de nacimiento");
		short num1;
		num1 = sc.nextShort();
		
		System.out.println("Introduce el numero 2");
		short num2;
		num2 = sc.nextShort();
		
		short resultado = (short) (num2 - num1);
		
		System.out.println("Tu edad es " + resultado + " años");
	}

}
