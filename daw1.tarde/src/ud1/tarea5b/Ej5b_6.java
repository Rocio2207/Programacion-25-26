package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la primera nota");
		float nota1;
		nota1 = sc.nextFloat();
		
		System.out.println("Introduce la segunda nota");
		float nota2;
		nota2 = sc.nextFloat();
		
		System.out.println("Introduce la tercera nota");
		float nota3;
		nota3 = sc.nextFloat();
		
		int resultado = (int) (nota1 + nota2 + nota3) / 3;
		System.out.println("La media aritmetica de " + nota1+ " ," + nota2 + " y " + nota3 + " es " + resultado);
	
		sc.close();	
		}

}
