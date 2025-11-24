package ud3.tarea2;

import java.util.Scanner;

public class Ej2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String pal1, pal2;
		
		
		System.out.println("Introduce la primera palabra:");
		pal1 = sc.next();
		System.out.println("Introduce la segunda palabra:");
		pal2 = sc.next();
		
		if (pal1.length() < pal2.length())
			System.out.println("La palabra más corta es " + pal1);
		else
			System.out.println("La palabra más corta es " + pal2);

	sc.close();}
}
