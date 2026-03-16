package ud6.examen.cortes;

public abstract class Gafa implements Promocion{
	private static int numIdentificador = 0;
	private Montura montura;
	private double coste;
	private double precioVenta;
	private String identificador;
	protected TipoGafa tipoGafa;
	
	Gafa(Montura montura, double coste, double precioVenta){
		this.montura = montura;
		this.coste = coste;
		this.precioVenta = precioVenta;
		this.identificador = "Gafa" + numIdentificador;
	}
	

	@Override
	public abstract double aplicaDescuento();
	

	public double getPrecioVenta() {
		return precioVenta;
	}
	

	public double getCoste() {
		return coste;
	}
	

	public TipoGafa getTipoGafa() {
		return tipoGafa;
	}
	

	public Montura getMontura() {
		return montura;
	}
	

	@Override
	public String toString() {
		return "Gafa [montura=" + montura + ", coste=" + coste + ", pecioVenta=" + precioVenta + ", identificador="
				+ identificador + "]";
	}
	
}
