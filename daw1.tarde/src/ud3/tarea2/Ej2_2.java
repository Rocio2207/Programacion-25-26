package ud3.tarea2;

import java.util.Scanner;

public class Ej2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String palabra;
		boolean cumple = false;
		String frase = "";
		
		while (!cumple) {
			System.out.println("Introduce una palabra: ");
			palabra = sc.next();
			
			cumple = (palabra.equalsIgnoreCase("fin")) ? true : false;
			if (!cumple)
				frase = frase + " " + palabra;
			else 
				System.out.println();
			}
		
		
		System.out.println("Tu frase completa es: ");
		System.out.println(frase); 
			
		sc.close();}
}