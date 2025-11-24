package ud3.tarea3;

import java.util.Scanner;

public class Ej3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int cantidad;
		
		
		System.out.println("¿Cuantos números desea introducir?");
		cantidad = sc.nextInt();
		
		int [] numeros = new int [cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce un numero entero: ");
			numeros [i] = sc.nextInt();
		}
		
		System.out.println("Para alante");
		for(double elemento:numeros)
			System.out.println(elemento);
		
		System.out.println("Para atrás");
		for (int i = numeros.length - 1; i >= 0; i--)
			System.out.println(numeros[i]);
		
		
	sc.close();}
}

//3 y 4