package ud3.ejemplos;

public class Num1_10_Recursiva {
	public static int contar(int contador) {
        if (contador > 10) {
            return 10;
            
        }
        System.out.println(contador);
        return contar(contador + 1);
        
    }

    public static void main(String[] args) {
        contar(1);
    }
}
