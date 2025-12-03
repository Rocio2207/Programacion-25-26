package Exam;

import java.util.Scanner;

class DNIInvalidoException extends Exception{
	public DNIInvalidoException (String mensaje) {
		super(mensaje);
	}
}

public class Ej1_examen {
	
	public static String cambiarDigito(String DNI, int posicion, char nuevoValor)  {
		String resultado;
		char cambiar = DNI.charAt(posicion);
		resultado = DNI.replace(cambiar, nuevoValor);
		
		return resultado;
	}
	
	
	
	
	public static void main(String[] args) throw DNIInvalidoException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el DNI (8 números y una letra):");
		String DNI = sc.next().toUpperCase();
		
		boolean valido;
		
		if (DNI.matches("^\\d{8}[a-z]$")) {
			valido = true;
			
			char letra = DNI.charAt(8);
			String mayuscula = letra;
			mayuscula = mayuscula.toUpperCase();
			DNI=DNI.replaceAll("[a-z]", mayuscula);}
		
		else {
			valido = false;
			throw new DNIInvalidoException ("Formato de DNI inválido. Debe ser 8 números y una letra.");}
		
		
		System.out.println("\nDNI válido: " + DNI);
		System.out.println("\nDNI modificado: " + cambiarDigito(DNI, 3, '9'));
		
		
		
		
		
	sc.close();}
	
	
	try {
		
	}catch (DNIInvalidoException e) {
			System.out.println("Error: " + getmensaje.e);
		} catch (Exception e) {
			System.out.println("Error: " + getmensaje.e);
		}
		
	
}
