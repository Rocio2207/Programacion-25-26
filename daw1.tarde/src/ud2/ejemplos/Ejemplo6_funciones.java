package ud2.ejemplos;

public class Ejemplo6_funciones {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		double miArea = areaTriangulo(a,b);
		System.out.println("El área es: " + miArea);
		
	}
	
	static double areaTriangulo (int base, int altura) {
		double area = (double) base*altura / 2;
		return area;
	}
	
}
