package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3_6 {

    public static int[] sinRepetidos(int t[]) {
        if (t == null || t.length == 0) return new int[0];

        int[] temporal = new int[t.length];
        int contador = 0;

        for (int i = 0; i < t.length; i++) {
            boolean existe = false;
            // Comprobamos si ya lo hemos guardado
            for (int j = 0; j < contador; j++) {
                if (temporal[j] == t[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                temporal[contador] = t[i];
                contador++;
            }
        }
        return Arrays.copyOf(temporal, contador);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedimos el tamaño
        System.out.print("¿Cuántos números vas a introducir?: ");
        int n = sc.nextInt();
        int[] entrada = new int[n];

        // 2. Rellenamos la tabla
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            entrada[i] = sc.nextInt();
        }

        // 3. Llamamos a la función y mostramos
        int[] resultado = sinRepetidos(entrada);
        System.out.println("\nTabla original: " + Arrays.toString(entrada));
        System.out.println("Tabla sin repetidos: " + Arrays.toString(resultado));

        sc.close();
    }
}




//1211353
//1235
