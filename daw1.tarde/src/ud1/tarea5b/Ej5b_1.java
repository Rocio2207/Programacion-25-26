package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_1 {
	public static void main(String[] args) {
		Scanner letras = new Scanner (System.in);
		
		System.out.println("Introduce el dia de la semana");
		
		String dia;
		dia = letras.nextLine();
		
		if(dia.equals("Lunes") || dia.equals("lunes"))
			System.out.println("Hoy es " + dia + " y a primera hora toca programación");
		if (dia.equals("Martes") || dia.equals("martes"))
			System.out.println("Hoy es " + dia + " y a primera hora toca entornos de desarrollo");
		if (dia.equals("Miercoles") || dia.equals("miercoles")   || dia.equals("Miércoles") || dia.equals("miércoles"))
			System.out.println("Hoy es " + dia + " y a primera hora toca IP");
		if (dia.equals( "Jueves") || dia.equals("jueves"))
			System.out.println("Hoy es " + dia + " y a primera hora toca bases de datos");
		if (dia.equals("Viernes") || dia.equals("viernes"))
			System.out.println("Hoy es " + dia + " y a primera hora toca sostenibilidad");
		
	}
}