package ud1.tarea3;
import java.util.Scanner;

public class Ej3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el numero 1");
		double num1;
		num1 = sc.nextDouble();
		
		System.out.println("Introduce el numero 2");
		double num2;
		num2 = sc.nextDouble();
		
		double resultado = (double) num1 / num2;
		
		System.out.println(num1 + " / " + num2 + " = " + resultado);
	}

}
