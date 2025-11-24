package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horas;
		int horasOrd = 40;
		int precOrd = 12;
		
		int precExtra = 16;
		int sueldo;
		
		System.out.println("Introduce las horas trabajadas durante la semana");
		horas = sc.nextInt();
		int horasExtra = horas - 40;
		
		if (horas <= 40)
			sueldo = horas * precOrd;
			
		else 
			sueldo = (horasOrd * precOrd) + (horasExtra * precExtra);
		
		System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
	}
}