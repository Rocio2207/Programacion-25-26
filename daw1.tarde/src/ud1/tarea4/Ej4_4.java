package ud1.tarea4;

import java.util.Scanner;

public class Ej4_4 {
	public static void main(String[] args) {
		Scanner decimal = new Scanner (System.in);
		
		System.out.println("Introduce un número decimal para que sea redondeado");
		float conDec;
		conDec = decimal.nextFloat();
		
		int sinDec;
		sinDec = (int) conDec;
		
		float dif;
		dif = conDec - sinDec;
		
		int resultado;
		
		if (dif >= 0.5)
			resultado = (int) conDec + 1;
		else
			resultado = sinDec;

		System.out.println(conDec + " se aproxima a " + resultado);
		
		
	}
}
