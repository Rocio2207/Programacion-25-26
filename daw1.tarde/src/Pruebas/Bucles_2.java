package Pruebas;

import java.util.Scanner;

public class Bucles_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

			boolean correcta=false;

			String secreta="1234";

			String contrasenia;
			
			int intentos = 3;

			
			int i = 0;
			while (i < 3) {

				System.out.println("Introduce la contraseña");
				contrasenia=sc.next();

				correcta = contrasenia.equals(secreta)?true:false;

				if (correcta)
					System.out.println("Contraseña correcta");
				else {
					intentos--;
					System.out.println("Intentnos restantes: " + intentos);
				}
				
				if (intentos == 0)
					System.out.println("Intentalo más tarde");

				i++;
			}
			
			sc.close();}
}