package ud1.tarea8a;

import java.util.Scanner;

public class Ej8_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la medida del lado del triángulo rectangulo.");
		int n = sc.nextInt();
		int i;
		int j;
		
		for (i = n; i >= 1; i--) {
           for (j = 1; j <= i; j++)  {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	sc.close();}
}
