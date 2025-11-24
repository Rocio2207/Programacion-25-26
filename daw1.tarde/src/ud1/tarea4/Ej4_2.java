package ud1.tarea4;

import java.util.Scanner;

public class Ej4_2 {
	public static void main(String[] args) {
		Scanner notas = new Scanner (System.in);
		
		System.out.println("Introduce la primera nota");
		float nota1;
		nota1 = notas.nextFloat();
		
		System.out.println("Introduce la segunda nota");
		float nota2;
		nota2 = notas.nextFloat();
		
		float resultado = (nota1 + nota2) / 2;
		System.out.println("La media aritmetica de " + nota1+ " y " + nota2 + " es " + resultado);
		
	}

}
