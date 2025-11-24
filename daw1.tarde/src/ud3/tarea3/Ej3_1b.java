package ud3.tarea3;

import java.util.Scanner;

public class Ej3_1b {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		String [] nombres = new String [5];

		for (int i=0;i <5;i++) {
			System.out.println(" Introduce los numeros ["+i+"]: ");
			nombres [i]=sc.next();

		}

		// escribo todos por consola
		System.out.println("\nArray introducido:");
		for (int i=0;i<nombres.length;i++)
			if (nombres[i].contains("s"))
			System.out.println(nombres[i]);
		
	sc.close();}

	}
