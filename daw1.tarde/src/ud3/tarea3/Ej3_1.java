package ud3.tarea3;

import java.util.Scanner;

public class Ej3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] numeros = new double [5];
				
		for(int i = 0; i < 5; i++) {
			System.out.println("Introduce un numero decimal en la posición:" + i);
			numeros[i] = sc.nextDouble();
		}
		
		System.out.println("Los numero introducidos son: ");
		for (int i = 0; i < numeros.length;i++) {
			System.out.println(numeros[i]);
		}
			
		
		
	sc.close();}

}
