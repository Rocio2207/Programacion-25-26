package Pruebas;

import java.util.Scanner;

public class Prueba_booleana3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String secreta = "1234";
		
		System.out.println("Introduce tu contraseña"); 
		
		String  contrasenia;
		contrasenia = sc.next();
		
		boolean correcta = (secreta.equals(contrasenia))?true:false;
		
		if (correcta)
			System.out.println("Contraseña correcta");
		else
			System.out.println("Contraseña incorrecta");
		
		sc.close();}
}