package ud1.tarea3;

import java.util.Scanner;

public class Ej3_4 {
	public static void main(String[] args) {
		System.out.println("Introduce las millas");
		Scanner millas = new Scanner (System.in);
		
		float num;
		num = millas.nextFloat();
		float metrosMilla = 1609;
		float resultado = num * metrosMilla;
	
	System.out.println(num + " millas equivalen a " + resultado + " metros");
	}
}
