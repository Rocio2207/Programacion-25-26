package ud3.ejemplos;

public class Cadenas {
	public static void main(String[] args) {
		String cad1 = "Rocío";
		String cad2 = "cortés";
		
		System.out.println(cad1 + " " + cad2);
		
		System.out.println(cad1.length()); //numero de letras de una palabra
		
		for (int i = 1; i < cad1.length(); i++)
			System.out.println("Hola");
		
		System.out.println(cad1.indexOf('o')); //sirve para saber la primera posición de una letra
		System.out.println(cad1.lastIndexOf('o')); //sirve para saber la ultima posición de una letra
		System.out.println(cad1.charAt(0)); //Sirve para saber la  letra a la que corresponde la posición entre paréntesis, en este caso 1
		System.out.println(cad1.substring(0,3)); //Escribe las letras que se encuentran dentro del rango
		System.out.println(cad1.toUpperCase()); //sale en mayusculas
		System.out.println(cad1.toLowerCase()); // sale en minúsculas
		System.out.println(cad1.equals(cad2)); // compara dos textos
		System.out.println(cad1.equalsIgnoreCase(cad2)); // compara sin tener en cuenta las mayúsculas y las minúsculas valor "true" "false"
		System.out.println(cad1.compareToIgnoreCase(cad2)); // compara sin tener en cuenta las mayúsculas y las minúsculas valor "0" (igual) "-1" "1"
		cad2 = cad1.valueOf(3); //convierte un valor numérico en un String
		System.out.println(cad2);
		
		
	}
}
