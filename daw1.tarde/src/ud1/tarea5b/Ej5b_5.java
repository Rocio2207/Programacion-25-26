package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        System.out.println("Introduzca el valor de a");
        double a=sc.nextDouble();
        
        System.out.println("Introduzca el valor de b");
        double b=sc.nextDouble();

        String resultado = ( a == 0) ? "ecuación sin solución" :
        	"x = " + (-b / a);

        System.out.println(resultado);

        sc.close();

    }

}

