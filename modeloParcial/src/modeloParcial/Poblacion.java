package modeloParcial;

import java.util.ArrayList;
import java.util.List;

public class Poblacion implements Consumidor{
	
	private double factor;
	private List<Consumidor> consumidores;
	
	public Poblacion(double factor) {
		this.factor = factor;
		this.consumidores = new ArrayList<Consumidor>();
	}

	@Override
	public double consumoO2() {
		return (this.sumaConsumoComponentes() * this.cantidadBacteriasInmediatas()) / this.factor;
	}

	private double cantidadBacteriasInmediatas() {
		double cantidad = 0;
		for (int i = 0; i < this.consumidores.size(); i++) {
			Consumidor consumidor = this.consumidores.get(i);
			cantidad = cantidad + unoSiEsInmediata(consumidor);
		}
		return cantidad;
	}

	private double unoSiEsInmediata(Consumidor consumidor) {
		if (consumidor.esInmediata()) {
			return 1;
		}
		return 0;
	}

	private double sumaConsumoComponentes() {
		double sumaTotal = 0;
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
