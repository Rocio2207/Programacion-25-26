package ud3.tarea1;

import java.util.Scanner;

public class Ej1_2 {

	public static short numComprendido (short num1, short num2) {
		
		if(num2 > num1) {
			for (int i = num1 + 1; i < num2; i++)
				System.out.print(i + " ");}
		else {
			for (int j = num2 + 1; j < num1; j++)
				System.out.print(j + " ");}
		
		return num1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		short num1;
		short num2;
		
		System.out.println("Introduce el primer número:");
		num1 = sc.nextShort();
		
		System.out.println("Introduce el segundo número:");
		num2 = sc.nextShort();
		
		numComprendido(num1, num2);
		
	sc.close();}
	
}
