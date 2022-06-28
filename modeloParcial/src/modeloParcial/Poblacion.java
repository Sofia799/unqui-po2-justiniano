package modeloParcial;

import java.util.ArrayList;
import java.util.List;

public class Poblacion implements Consumidor{
	
	private int factor;
	private List<Consumidor> consumidores;
	
	public Poblacion(int factor) {
		this.factor = factor;
		this.consumidores = new ArrayList<Consumidor>();
	}

	@Override
	public Integer consumoO2() {
		return (this.sumaConsumoComponentes() * this.cantidadBacteriasInmediatas()) / this.factor;
	}

	private int cantidadBacteriasInmediatas() {
		int cantidad = 0;
		for (int i = 0; i < this.consumidores.size(); i++) {
			Consumidor consumidor = this.consumidores.get(i);
			cantidad = cantidad + unoSiEsInmediata(consumidor);
		}
		return cantidad;
	}

	private int unoSiEsInmediata(Consumidor consumidor) {
		if (consumidor.esInmediata()) {
			return 1;
		}
		return 0;
	}

	private int sumaConsumoComponentes() {
		int sumaTotal = 0;
		for (int i = 0; i < this.consumidores.size(); i++) {
			Consumidor consumidor = this.consumidores.get(i);
			sumaTotal = sumaTotal + consumidor.consumoO2();
		}
		return sumaTotal;
	}
	
	public void addConsumidor(Consumidor consumidor) {
		this.consumidores.add(consumidor);
	}

	@Override
	public boolean esInmediata() {
		return false;
	}
	
	

}
