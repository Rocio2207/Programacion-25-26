package ud1.tarea8b;

import java.util.Scanner;

public class Ej8b_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean correcto = false;
		int intentos = 4;
		
		
		do {
			System.out.println("Introduce la combinación de 4 digitos de la caja fuerte:");
			
			String num = sc.nextLine();
			char dig1 = num.charAt(0);
			char dig2 = num.charAt(1);
			char dig3 = num.charAt(2);
			char dig4 = num.charAt(3);
			
			correcto = (dig1 == '1' && dig2 == '2' && dig3 == '3' && dig4 == '4') ? true : false;
			
			if (correcto)
				System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
			else {
				intentos = intentos - 1;
				System.out.println("Combinación incorrecta.");}
		}while(!correcto && intentos > 0);
		
		
	sc.close();}
}