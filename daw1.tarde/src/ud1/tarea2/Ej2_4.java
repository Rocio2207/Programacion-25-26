package ud1.tarea2;

import java.util.Scanner;

public class Ej2_4 {
	public static void main(String[] args) {
		System.out.println("Introduce las millas");
		Scanner millas = new Scanner (System.in);
		
		int num;
		num = millas.nextInt();
		int metrosMilla = 1609;
		int resultado = num * metrosMilla;
	
	System.out.println(num + " millas equivalen a " + resultado + " metros");
	millas.close();}
}
