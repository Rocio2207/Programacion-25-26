package ud3.tarea2;

import java.util.Scanner;

public class Ej2_3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String frase;
	int num;
	char caracter;
	
	System.out.println("Introduce una frase y te diremos si el caracter de la posición central es un espacio o no");
	frase = sc.nextLine().toLowerCase();
	
	num = frase.length()/2;
	caracter = frase.charAt(num);
	
	
	if (caracter == ' ')
		System.out.println("El caracter de la posicion central es un espacio.");
	else
		System.out.println("El caracter de la posicion central (" + caracter + ") no es un espacio.");
	
	sc.close();}
}
