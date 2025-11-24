package ud1.tarea8a;
import java.util.Scanner;
public class Ej8_2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
   int edad;
   int sumaEdades = 0;
   int contadorAlumnos = 0;
   int mayoresEdad = 0;
   System.out.println("Introduce las edades:");
   while (true) {
       System.out.print("Edad del alumno " + (contadorAlumnos + 1) + ": ");
       edad = sc.nextInt();
       if (edad < 0) {
           break;
       }
       sumaEdades += edad;
       contadorAlumnos++;
       if (edad >= 18) {
           mayoresEdad++;
       }
   }
   if (contadorAlumnos > 0) {
       double media = (double) sumaEdades / contadorAlumnos;
       System.out.println("Resultados");
       System.out.println("Número de alumnos: " + contadorAlumnos);
       System.out.println("Suma de las edades: " + sumaEdades);
       System.out.printf("Edad media: " + media);
       System.out.println("Número de mayores de edad: " + mayoresEdad);
   } else {
       System.out.println("No se introdujeron edades válidas.");
   }
   sc.close();
	}
}
