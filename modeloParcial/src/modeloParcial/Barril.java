package modeloParcial;

import java.util.ArrayList;
import java.util.List;

public class Barril {
	
	private Integer codigo;
	private Integer año;
	private List<Consumidor> consumidores;
	
	public Barril(int codigo, int año) {
		this.codigo = codigo;
		this.año = año;
		this.consumidores = new ArrayList<Consumidor>();
	}
	
	public Integer getConsumo() {
		int consumo = 0;
		for (int i = 0; i < this.consumidores.size(); i++) {
			Consumidor consumidor = this.consumidores.get(i);
			consumo = consumo + consumidor.consumoO2();
		}
		return consumo;
	}
	
	public void añadir(Consumidor consumidor) {
		this.consumidores.add(consumidor);
	}

}
