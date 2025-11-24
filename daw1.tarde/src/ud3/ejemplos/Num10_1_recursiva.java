package ud3.ejemplos;

public class Num10_1_recursiva {
	public static int contar(int contador) {
        if (contador == 0) {
            return 0;
            
            
        }
        System.out.println(contador);
        return contar(contador - 1);
        
    }

    public static void main(String[] args) {
        contar(10);
    }
}
