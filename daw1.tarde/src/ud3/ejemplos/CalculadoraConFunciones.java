package ud3.ejemplos;

import java.util.Scanner;

//Excepción personalizada
class DivPorCeroException extends Exception {
public DivPorCeroException(String mensaje) {
   super(mensaje); 
}
}

class NegativoException extends Exception {
public NegativoException(String mensaje) {
   super(mensaje); 
}
}

class signoInvalido extends Exception{
	public signoInvalido (String mensaje) {
		super (mensaje);
	}
}

public class CalculadoraConFunciones {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce el primer número: ");
     double num1 = sc.nextDouble();

     System.out.print("Introduce el segundo número: ");
     double num2 = sc.nextDouble();

     System.out.print("Elige operación (+, -, *, /): ");
     char operacion = sc.next().charAt(0);
     
     

     try {     
         Utilidades.validacion(operacion);
    	 double resultado = Utilidades.calcular(num1, num2, operacion);
         System.out.println("Resultado: " + resultado);
     } catch (signoInvalido e) {
         System.out.println("Error: " + e.getMessage());
     } catch (DivPorCeroException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (NegativoException e) {
         System.out.println("Error: " + e.getMessage());
     }  catch (Exception e) {
         System.out.println("Operación no válida.");
     }

     sc.close();
 }

}

//Para mañana comprobar si se ha introducido un número

