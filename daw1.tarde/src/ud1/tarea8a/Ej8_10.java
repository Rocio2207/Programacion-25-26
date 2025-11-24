package ud1.tarea8a;

import java.util.Scanner;

public class Ej8_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		boolean cumple = false;
		int i;
		
		
		do{	
		System.out.println("Introduce un numero del entre el 1 y el 10");	
			num = sc.nextInt();
			cumple = (num > 0 && num < 11) ? true : false;
			
			
			if (cumple) {
				for(i = 0; i < 10; i++)
				System.out.println(num + " x " + i + " = " + (num * i));
				}
				
			else
				System.out.println("El numero introducido no cumple las condiciones indicadas.");
		}while(!cumple);
		
		
	sc.close();}
}
