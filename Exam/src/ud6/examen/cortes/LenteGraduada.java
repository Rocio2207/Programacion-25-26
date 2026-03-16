package ud6.examen.cortes;

public class LenteGraduada {
	private TipoProblema problema;
	private double gradoCorreccion;
	private Character posicionLente;
	
	LenteGraduada(Character posicion, TipoProblema problema, double grado){
		this.posicionLente = Character.toUpperCase(posicion);
		this.problema = problema;
		this.gradoCorreccion = grado;
	}
	
	public void dimeTipoLente() {
		System.out.println("Lente graduada");
	}

	@Override
	public String toString() {
		return "LenteGraduada [problema=" + problema + ", gradoCorreccion=" + gradoCorreccion + ", posicionLente="
				+ posicionLente + "]";
	}
	
}
