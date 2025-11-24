package Pruebas;

import java.util.Scanner;

public class Bucles_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

			boolean correcta=false;

			String secreta="1234";

			String contrasenia;

			

			do {

				System.out.println("Introduce la contraseña");

				contrasenia=sc.next();

				correcta = contrasenia.equals(secreta)?true:false;

				if (correcta)

					System.out.println("Contraseña correcta");


			} while (!correcta);

	  sc.close();}
}
