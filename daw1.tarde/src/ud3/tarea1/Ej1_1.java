package ud3.tarea1;

import java.util.Scanner;

public class Ej1_1 {
	public static byte eco (byte n) {
		
		if (n > 0) {
			for (int i = 1; i <= n; i++)
				System.out.println("Eco...");}
		else 
			System.out.println("El número debe ser positivo.");
		
		return n;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		byte n;
		
		System.out.println("Introduce el número de veces que quieres que se repita el Eco");
		n = sc.nextByte();
		
		eco(n);
	sc.close();}
	
}
