package ud6.examen.cortes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Optica {
	private Map<TipoGafa, List<Gafa>> mapa;
	private String nombre;
	private String CIF;
	
	Optica(String nombre, String CIF){
		this.nombre = nombre;
		this.CIF = CIF;
		this.mapa = new HashMap<TipoGafa, List<Gafa>>();
	}
	
	
	
	public int cuantasGafas() {
		int stockTotal = 0;
		for(TipoGafa tipo : mapa.keySet()) {
			stockTotal += mapa.get(tipo).size();
		}
		
		return stockTotal;
	}
	
	
	
	public void addGafa(TipoGafa tipo, Gafa g) {
		if(g.getTipoGafa() == tipo) {
			if(!mapa.containsKey(tipo)) {
				mapa.put(tipo, new ArrayList<Gafa>());
			}
			
			mapa.get(tipo).add(g);
			
		}
		else {
			System.out.println("Error, gafas no insertadas. No puedes insetar unas gafas " + g.getTipoGafa() + " en el tipo gafas " + tipo);
		}
	}
	
	
	
	public void delGafas(Gafa g) {
		if(mapa.containsKey(g.getTipoGafa())) {
			if(mapa.get(g.getTipoGafa()).contains(g)) {
				mapa.get(g.getTipoGafa()).remove(g);
			}
		}
		else {
			System.out.println("No se pueden eliminar gafas que no se encuentran en el stock");
		}
	}
	
	
	
	public double damePrecioGafa(Gafa g) {
		double precio = g.aplicaDescuento();
		if(precio >= g.getCoste()) {
			return precio;
		}
		else {
			return g.getCoste();
		}
	}
	
	
	
	/*public void gafasByProveedor() {
		if(mapa.containsKey(TipoGafa.SOL)) {
			List<GafaSol> gafasSol = new ArrayList<GafaSol>(mapa.get(TipoGafa.SOL));
			Arrays.sort(gafasSol);
			System.out.println(gafasSol);
			
		}
	}*/
	
	
	
	public void costeGafasByTipo(TipoGafa tipo) {
		double total = 0;
		
		if(mapa.containsKey(tipo)) {
			for(Gafa g : mapa.get(tipo)) {
				total += g.getCoste();
			}
		}
		
		System.out.println(total);
	}

}
