package Pruebas;

import java.util.Scanner;

public class Prueba_boolean2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu edad");
		byte edad;
		edad = sc.nextByte();
		
		boolean pasa = (edad >= 18) ? true : false;
		
		System.out.println("Introduce la ciudad en que naciste");
		String ciudad;
		ciudad = sc.next();
		
		boolean sevillano = (ciudad.equals("Sevilla")) ? true : false;
		
		if (pasa && sevillano)
			System.out.println("Adelante, puedes pasar");
		else
			System.out.println("No puedes pasar ");
		
		sc.close();}
}