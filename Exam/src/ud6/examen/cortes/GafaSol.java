package ud6.examen.cortes;

public class GafaSol extends Gafa implements Comparable<GafaSol>{
	private LenteSinGraduar lenteI;
	private LenteSinGraduar lenteD;
	private Proveedor proveedor;
	
	GafaSol(Montura montura, LenteSinGraduar I, LenteSinGraduar D, double coste, double precioVenta, Proveedor prov){
		super(montura, coste, precioVenta);
		this.lenteI = I;
		this.lenteD = D;
		this.tipoGafa = TipoGafa.SOL;
		this.proveedor = prov;
	}
	

	@Override
	public double aplicaDescuento() {
		double precio = getPrecioVenta() - (getPrecioVenta() * 0.1);
		return precio;
	}
	

	public Proveedor getProveedor() {
		return proveedor;
	}
	

	public LenteSinGraduar getLenteI() {
		return lenteI;
	}
	

	public LenteSinGraduar getLenteD() {
		return lenteD;
	}
	

	@Override
	public int compareTo(GafaSol o) {
		return this.proveedor.getNombre().compareTo(o.getProveedor().getNombre());
	}
	

	@Override
	public String toString() {
		return "GafaSol [lenteI=" + lenteI + ", lenteD=" + lenteD + ", proveedor=" + proveedor + ", toString()="
				+ super.toString() + "]";
	}

}

