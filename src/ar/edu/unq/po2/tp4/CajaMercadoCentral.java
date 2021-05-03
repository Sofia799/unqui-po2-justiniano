package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.Iterator;

public class CajaMercadoCentral {

	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void cargarProductos() {
		Producto producto1 = new Producto(1, Double.valueOf("110.00"), 2, TipoProductoEnum.COOPERATIVA);
		Producto producto2 = new Producto(2, Double.valueOf("10.40"), 3, TipoProductoEnum.EMPRESA_TRADICIONAL);
		Producto producto3 = new Producto(3, Double.valueOf("140.5"), 1, TipoProductoEnum.COOPERATIVA);

		añadirProducto(producto1);
		añadirProducto(producto2);
		añadirProducto(producto3);

	}

	public Producto registrarProducto(Producto producto) {
		Producto p = obtenerProducto(producto);
		
		actualizarStock(p);
		obtenerPrecio(p);
		
		return p;

	}
	
	private Producto obtenerPrecio(Producto producto) {
		if (producto.getTipo().equals(TipoProductoEnum.COOPERATIVA)) {
			producto.setPrecio(producto.getPrecio()/1.10);
		}
		return producto;
	}

	private Producto obtenerProducto(Producto producto) {
		Iterator<Producto> it = getProductos().iterator();
		while (it.hasNext()) {
			Producto p = it.next();
			if (p.getCodigo().equals(producto.getCodigo())) {
				return p;
			}

		}
		return null;
	}
	
	private void actualizarStock(Producto producto) {
		Iterator<Producto> it = getProductos().iterator();
		while (it.hasNext()) {
			Producto p = it.next();
			if (p.getCodigo().equals(producto.getCodigo())) {
				p.setStock(p.getStock()-1);
			}

		}
	}

	private void añadirProducto(Producto producto) {
		getProductos().add(producto);
	}

}
