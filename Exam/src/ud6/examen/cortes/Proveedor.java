package ud6.examen.cortes;

public class Proveedor implements Comparable<Proveedor>{
	
	private String CIF;
	private String nombre;
	private String telef;
	
	public Proveedor(String cif, String nombre, String telef) {
		this.CIF = cif;
		this.nombre = nombre;
		this.telef = telef;
	}
		
	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getTelef() {
		return telef;
	}

	public void setTelef(String telef) {
		this.telef = telef;
	}

	@Override
	public String toString() {
		return "Proveedor [CIF=" + CIF + ", nombre=" + nombre + ", telef=" + telef + "]";
	}

	@Override
	public int compareTo(Proveedor o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	
}
