package ud1.tarea5a;

import java.util.Scanner;

public class Ej5_6 {
	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		
		System.out.println("Introduce el tiempo");
		float tiempo;
		tiempo = numero.nextFloat();
		
		float gravedad = 9.8f;
		
		float velocidad = gravedad * tiempo;
		
		if (tiempo <= 0)
			System.out.println("Tiempo incorrecto");
		else
			System.out.println("La velocidad es " + velocidad);
		
	}
}