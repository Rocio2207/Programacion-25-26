package ud3.ejemplos;

import java.util.Scanner;

public class Utilidades {
	
 static double suma(double a, double b) {
	 return a + b;
 }
	
 static double divide(double a, double b) throws DivPorCeroException {
	 if (b == 0) {
         throw new DivPorCeroException("No se puede dividir entre cero.");
     }
	 	 return a/b;
 }
 
 static double resta (double a, double b) throws NegativoException {
	 if (b > a) {
		 throw new NegativoException ("No puede dar un resultado negativo");
	 }
	 return a - b;
 }
 
 static double multiplica (double a, double b) {
	 return a * b;}
 
 static Character validacion (char op) throws signoInvalido  {
	 if(Character.isLetterOrDigit(op)) {
		 throw new signoInvalido ("Eso no es un signo");
	 }
	 return op;
		 
 }
 
 static double calcular(double a, double b, char op) throws DivPorCeroException, NegativoException, signoInvalido {
     switch (op) {
         case '+': return suma(a,b);
         case '-': return resta (a,b); //Implementar la función resta
         case '*': return multiplica (a,b); //Implementar la función producto
         case '/':return divide(a,b);
         default:
             throw new signoInvalido("Operación desconocida.");
     }
 }
 
}

