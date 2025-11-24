package ud1.tarea2;

import java.util.Scanner;

public class Ej2_3 {
	public static void main(String[] args) {
		System.out.println("Introduce el numero 1");
		Scanner numero1 = new Scanner (System.in);
		
			int num1;
			num1 = numero1.nextInt();
		
		System.out.println("Introduce el numero 2");
		Scanner numero2 = new Scanner (System.in);
		
			int num2;
			num2 = numero2.nextInt();
		
		float resultado = (float) num1/num2;
		
		System.out.println(num1 + " / " + num2 + " = " + resultado);
		
		numero1.close();
		numero2.close();}
}
