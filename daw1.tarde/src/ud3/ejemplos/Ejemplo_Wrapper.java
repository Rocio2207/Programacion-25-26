package ud3.ejemplos;

public class Ejemplo_Wrapper {
	public static void main(String[] args) {
		
	
	int natural;
	double decimal;
	boolean continuar;
	
	String texto = "12.2";
	Integer naturalW = 10;
	Double decimalW = 3.14;
	
	
	natural = naturalW.compareTo(16);
	System.out.println(natural);
	
	natural = decimalW.intValue();
	System.out.println(natural);
	}
}
