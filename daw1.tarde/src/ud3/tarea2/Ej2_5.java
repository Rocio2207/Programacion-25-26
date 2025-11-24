package ud3.tarea2;

import java.util.Scanner;

public class Ej2_5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre completo:");
        String nombreCompleto = sc.nextLine(); 

        String resultado = "";

        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";


        for (int i = 0; i < nombreCompleto.length(); i++) {


            char caracterActual = nombreCompleto.charAt(i);



            if (vocales.indexOf(caracterActual) == -1) {

                resultado = resultado + caracterActual;
            }

        }

        sc.close();

        System.out.println("\nNombre sin vocales:");
        System.out.println(resultado);
    
		
		
	}
}
