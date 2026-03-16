package ud6.examen.cortes;

public class GafaGraduada extends Gafa{
	private LenteGraduada lenteI;
	private LenteGraduada lenteD;
	
	
	GafaGraduada(Montura montura, LenteGraduada I, LenteGraduada D, double coste, double precioVenta){
		super(montura, coste, precioVenta);
		this.lenteI = I;
		this.lenteD = D;
		this.tipoGafa = TipoGafa.GRADUADA;
	}
	

	@Override
	public double aplicaDescuento() {
		double precio = getPrecioVenta() - (getPrecioVenta() * 0.2);
		return precio;
		
	}
	
	

}
