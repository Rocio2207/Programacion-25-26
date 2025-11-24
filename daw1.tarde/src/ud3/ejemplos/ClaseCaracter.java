package ud3.ejemplos;

public class ClaseCaracter {
	public static void main(String[] args) {
		 Character letra = 'p';
		 Character digito = '1';
		 Character operacion = '*';
		 
		 System.out.println("Salida 1: " + Character.isDigit (letra));
		 System.out.println("Salida 2: " + Character.isDigit (digito));
		 
		 System.out.println("Salida 3: " + Character.isLetter (letra));
		 System.out.println("Salida 4: " + Character.isLetter (digito));

		 System.out.println("Salida 5: " + Character.isUpperCase (letra));
		 
		 System.out.println("Salida 6: " + Character.isLetterOrDigit(letra));
		 System.out.println("Salida 1: "  + Character.isLetterOrDigit(operacion));
		 System.out.println("Salida 1: " + Character.getNumericValue('1'));
	}
}
