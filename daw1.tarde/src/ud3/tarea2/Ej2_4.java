package ud3.tarea2;

import java.util.Scanner;

public class Ej2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		int espacios = 0;

		System.out.println("Escribe la frase ");
		frase =sc.nextLine();

		 for (int i=0; i< frase.length();i++) {
			 if (frase.charAt(i)== ' ') {
				 espacios++; }
		     }

		 System.out.println("La frase tiene " + espacios + " espacios en blanco.");

	sc.close();}
}
