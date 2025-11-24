package ud1.tarea2;

import java.util.Scanner;

public class Ej2_5 {
	public static void main(String[] args) {
		System.out.println("Introduce los grados centigrados");
		Scanner gradosCent = new Scanner (System.in);
		
		int num;
		num = gradosCent.nextInt();
		float calcularFahrenheit = (float) 9*num/5 + 32;
		System.out.println(num + "ºC son " + calcularFahrenheit + "ºF");
		
		gradosCent.close();}
}
