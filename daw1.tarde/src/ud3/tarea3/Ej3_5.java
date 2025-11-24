package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [] numeros1 = new int [6];

		for (int i = 0; i < 6; i++) {
			System.out.println("Introduce un número");
			numeros1[i] = sc.nextInt();
		}

		System.out.println("\nTabla 1 ordenada: ");
		Arrays.sort(numeros1);
		for (int i = 0; i < 6; i++) {
			System.out.println(numeros1[i]);
		}

		
		
		int [] numeros2 = new int [6];

		for (int j = 0; j < 6; j++) {
			System.out.println("Introduce un número");
			numeros2[j] = sc.nextInt();
		}

		System.out.println("\nTabla 2 ordenada: ");
		Arrays.sort(numeros2);
		for (int j = 0; j < 6; j++) {
			System.out.println(numeros2[j]);
		}

		int [] numeros3 = new int [12];		
		
		System.out.println("\nTabla 3 combinación de las anterires ordenada: ");
		
		int j = 0;
		int i = 0;
		
		for (int k = 0; k < 12; k++) {
			if 	(i < 6 && j < 6) {
				if (numeros1 [i] < numeros2[j]) {
					numeros3[k] = numeros1[i];
					i++;
				}
				else {
					numeros3[k] = numeros2[j];
						j++;
				}
			}
			
			else {
				if (i < 6) {
					numeros3[k] = numeros1[i];
					i++;
				}
				
				else if (j < 6) {
					numeros3[k] = numeros2[j];
					j++;
				}					
			}
				
		}

		for (int k = 0; k < 12; k++) {
			System.out.println(numeros3[k]);
		}
		
	sc.close();}

	

}
//6,9