package ud3.tarea3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ej3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Introduce la cantidad de números de digitos de la clave secreta: ");
		int n = sc.nextInt();
		
		int [] secreta = new int [n];
		
		for (int i = 0; i < n; i++) {
            secreta[i] = rand.nextInt(5) + 1; 
        }
		
		System.out.println("La clave secreta es: (" + Arrays.toString(secreta) + ")\n\n\n\n\n\n\n\n");
		
		boolean acertada = false;
		
		System.out.println("Intente acertar la contraseña");
		do {
			char [] intento = new char[n];
			
			intento = sc.next().toCharArray();
			int conincide = 0;
			
			for (int i = 0; i < n; i++) {
				int numero = Character.getNumericValue(intento[i]);
				if (numero == secreta[i]) {
					System.out.println(numero + " es igual");
					conincide ++;
				}
				if (numero > secreta[i])
					System.out.println(numero + " es mayor que el número de la clave secreta");
				if (numero < secreta[i])
					System.out.println(numero + " es menor que el número de la clave secreta");
			}
			
			acertada = (conincide == n) ? true:false;
			
			if (!acertada)
				System.out.println("\n\nIntentalo de nuevo");
			
		}while(!acertada);
		
		System.out.println("Contraseña acertada, has abierto la camara secreta.");
		
	sc.close();}
	
}
