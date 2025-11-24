package ud1.tarea4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ej4_5 {
	public static void main(String[] args) {
		//Obtener hora y fecha actual
		LocalDateTime ahora = LocalDateTime.now();
		
		//Formatear la salida
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String fechaHoraFormateada = ahora.format(formato);
		
		//Mostrar resultado
		System.out.println("Fecha y hora actual: " + fechaHoraFormateada);
		
	}

}
