package ud3.tarea1;

import java.util.Scanner;

public class Ej1_3 {
	
	public static double Area (double r, double h){
		final double pi = Math.PI;
		double areaCilindro = 2 * pi * r * (h + r);
		
		return areaCilindro;
	}
	
	public static double Volumen (double r, double h){
		double pi = Math.PI;
		double volumenCilindro = pi * r * r * h;
		
		return volumenCilindro;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		byte op = 1 | 2;
		double r;
		double h;
		
		System.out.println("¿Qué operación quieres hacer? ('1' area / '2' volumen)");
		op = sc.nextByte();
		
		System.out.println("Introduce el radio:");
		r = sc.nextDouble();
		
		System.out.println("Introduce el altura:");
		h = sc.nextDouble();
		
		switch(op){
			case 1:
				System.out.println("El área es:" + Area(r,h)); 
				break;
			case 2:
				System.out.println("El volumen es:" + Volumen (r,h)); 
				break;
		}
		sc.close();}
	
}
