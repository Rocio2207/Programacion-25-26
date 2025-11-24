package ud3.tarea3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Definir una función que tome como parámetros dos tablas, la primera con 6
//números de una apuesta de la primitiva, y la segunda con los 6 números de
//la combinación ganadora. La función devolverá el número de aciertos.
public class Ej3_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [] apuesta = new char [6];
		int [] numGanador = new int [6];
		
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			numGanador [i] = rand.nextInt(10);
       }
		
		boolean cant = false;
		
		while (!cant) {	
			System.out.println("Introduce el número de tu apuesta: ");
				apuesta = sc.next().toCharArray();
			if (apuesta.length < 6)
				System.out.println("Te faltan números, has de introducir 6 digitos.\n\n");
			else if (apuesta.length > 6)
				System.out.println("Tu apuesta solo puede contener 6 digitos.\n\n");
			cant = (apuesta.length == 6)? true : false;
			}
		
		System.out.println("\n\nEl número ganador es: " + Arrays.toString(numGanador));
		System.out.println("Tu apuesta fue: 	" + Arrays.toString(apuesta));
		System.out.println("Has acertado " +cantAciertos(apuesta,numGanador) + " números.");
		
	sc.close();}
	static int cantAciertos (char [] apuesta, int [] numGanador) {
		int aciertos = 0;
		for(int i = 0; i < 6; i++) {
			int numero = Character.getNumericValue(apuesta[i]);
			if(numero == numGanador[i])
				aciertos++; }
		return aciertos;
	}
}     

//10, 4_1, 4_2