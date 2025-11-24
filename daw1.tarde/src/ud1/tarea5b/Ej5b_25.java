package ud1.tarea5b;
import java.util.Scanner;
public class Ej5b_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
       double precioComida = 0;
       double precioBebida = 0;
       String comida, bebida;
       System.out.print("¿Qué has tomado de comer? (palmera / donut / pitufo): ");
       comida = sc.nextLine().toLowerCase();
       switch (comida) {
           case "palmera":
               precioComida = 1.40;
               break;
           case "donut":
               precioComida = 1.00;
               break;
           case "pitufo":
               System.out.print("¿Con qué era el pitufo? (aceite / tortilla): ");
               String tipoPitufo = sc.nextLine().toLowerCase();
               if (tipoPitufo.equals("aceite")) {
                   precioComida = 1.20;
               } else if (tipoPitufo.equals("tortilla")) {
                   precioComida = 1.60;
               } else {
                   System.out.println("Opción de pitufo no válida.");
                   sc.close();
                 
               }
               break;
           default:
               System.out.println("Opción de comida no válida.");
               sc.close();
             
       }
       System.out.print("¿Qué has tomado de beber? (zumo / café): ");
       bebida = sc.nextLine().toLowerCase();
       if (bebida.equals("zumo")) {
           precioBebida = 1.50;
       } else if (bebida.equals("café") || bebida.equals("cafe")) {
           precioBebida = 1.20;
       } else {
           System.out.println("Opción de bebida no válida.");
           sc.close();
       }
       double total = precioComida + precioBebida;
       System.out.printf("%nHas tomado %s y %s.%n", comida, bebida);
       System.out.printf("Precio total: %.2f €%n", total);
       sc.close();
   }
}


