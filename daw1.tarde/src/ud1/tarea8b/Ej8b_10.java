package ud1.tarea8b;

import java.util.Scanner;

public class Ej8b_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la altura deseada");
		int alt = sc.nextInt();
		
		for (int i = 1; i <= alt; i++) {
			for(int j = 1; j <= alt; j++) {
				if (j == 1)	
					System.out.print("*");
				else if (j == alt)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			
			for (int k = 1; k < 1 && k < (alt -1); k++) {
				if  (k == 1)
					System.out.print(" ");
				else 
					System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	sc.close();}
}