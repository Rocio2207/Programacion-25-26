package daw1t;

import java.util.Scanner;

public class MayorEdad {
	public static void main(String[] args) {
		System.out.println("Introduce la edad");
		Scanner edad = new Scanner (System.in);
		
		int num;
		num = edad.nextInt();
		
		if (num >= 18) 
			System.out.println("Es mayor de edad");
		
		else if ((num >= 12) && (num <= 16))
		System.out.println("Es adolescente");
		
			else if (num < 3)
				System.out.println("Es un bebe");
				else
					System.out.println("No clasificado");
		
		
		
		
	edad.close();}
}
