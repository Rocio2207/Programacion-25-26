package ud2.ejemplos;

public class Ejemplo5_funciones {
	public static void main(String[] args) {
		
		String nick = "Rocío";
		
		saluda("ES", nick);
		saluda("EN", nick);
		saluda("DE", nick);
	}
	
	static void saluda (String idioma, String nombre) {
		
		switch(idioma) {
			case "ES":
				System.out.println("Hola " + nombre + " ¿cómo estas?");
				break;
			case "EN":
				System.out.println("Hello " + nombre + " how are you?");
				break;
			case "DE":
				System.out.println("Hi " + nombre + " wie geht is dir?");
				break;
			default:
				System.out.println("Idioma no válido");
		}
	}
	
	
	
	
}
