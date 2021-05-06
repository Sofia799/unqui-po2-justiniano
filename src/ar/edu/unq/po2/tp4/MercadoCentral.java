package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class MercadoCentral {
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public MercadoCentral() {
		super();
		setProductos(new ArrayList<Producto>());
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void cargarProductos() {
		Producto producto1 = new ProductoCooperativa(1, Double.valueOf("110.00"), 2);
		Producto producto2 = new ProductoEmpresaTradicional(2, Double.valueOf("10.40"), 3);
		Producto producto3 = new ProductoCooperativa(3, Double.valueOf("140.5"), 1);

		añadirProducto(producto1);
		añadirProducto(producto2);
		añadirProducto(producto3);

	}

	private void añadirProducto(Producto producto) {
		getProductos().add(producto);
	}
}
