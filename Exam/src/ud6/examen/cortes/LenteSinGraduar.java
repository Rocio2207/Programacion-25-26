package ud6.examen.cortes;

public class LenteSinGraduar{
	private ColorLente color;
	private Character posicionLente;
	
	LenteSinGraduar(Character posicion, ColorLente color){
		this.posicionLente = Character.toUpperCase(posicion);
		this.color = color;
	}
	
	
	public void dimeTipoLente() {
		System.out.println("Lente graduada");
	}
	

	@Override
	public String toString() {
		return "LenteSinGraduar [color=" + color + ", posicionLente=" + posicionLente + "]";
	}
	
}
