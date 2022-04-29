package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class Caja {

	private Map<ProductoCooperativa, Integer> productos = new HashMap<ProductoCooperativa, Integer>();

	public Map<Double, Integer> registrarProducto(ProductoCooperativa producto) {
		Double montoAPagar = 0.0;
		return null;

	}

	public void agregar(ProductoCooperativa producto, Integer stock) {
		getProductos().put(producto, stock);

	}

	public Map<ProductoCooperativa, Integer> getProductos() {
		return productos;
	}

}
