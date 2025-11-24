package Pruebas;

import java.util.Scanner;

public class Swich3_letras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Introduce una letra");
		letra = sc.next().toLowerCase().charAt(0);
		
		switch(letra) {
			case 'a','e','i','o','u':
				System.out.println("Es una vocal");
				break;
				
			case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z':
				System.out.println("Es una consonante");
				break;
			
			default:
				System.out.println("El caracter introducido no es una letra");
			
			sc.close();
		}
	}
}

