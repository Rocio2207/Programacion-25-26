package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_3 {
	public static void main(String[] args) {
		Scanner letras = new Scanner (System.in);
		
		System.out.println("Introduce un numero del 1 al 7");
		int num;
		num = letras.nextInt();
		
		if(num == 1)
			System.out.println("Hoy es Lunes");
		if(num == 2)
			System.out.println("Hoy es Martes");
		if(num == 3)
			System.out.println("Hoy es Miércoles");
		if(num == 4)
			System.out.println("Hoy es Jueves");
		if(num == 5)
			System.out.println("Hoy es Viernes");
		if(num == 6)
			System.out.println("Hoy es Sábado");
		if(num == 7)
			System.out.println("Hoy es Domingo");
		
	}
}