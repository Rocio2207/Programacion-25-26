package ud3.tarea3;

import java.util.Scanner;

public class Ej3_3 {

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	int positivos = 0;
	int cantp = 0;
	int negativos = 0;
	int cantn = 0;
	int cant0 = 0;
	
	System.out.println("Proporciona la cantidad de números que de desea introducir: ");
	int n = sc.nextInt();
	
	int [] numeros = new int [n];
	
	for (int i = 0; i < n; i++) {
		System.out.println("Introduce el numero " + i + ":");
		numeros[i] = sc.nextInt();
		
		if (numeros[i] > 0) {
			positivos += numeros[i];
			cantp++;
		}
		else if (numeros[i] < 0) {
			negativos += numeros[i];
			cantn++;
		}
		else {
			cant0++;
		}
		
	}
	
	double mediaNeg = (negativos < 0)? (double)negativos/cantn : 0; 
	double mediaPos = (positivos > 0)? (double)positivos/cantp : 0; 
	
	System.out.println("\n\nLa media de los numeros positivos es: " + mediaPos);
	System.out.println("La media de los numeros negativos es: " + mediaNeg);
	System.out.println("La cantidad  es: " + cant0);
	

	sc.close();}

}