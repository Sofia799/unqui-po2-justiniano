package ar.edu.unq.po2.tp4.tpInterfaces;

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
		Producto producto1 = new ProductoCooperativa(1, Double.valueOf("110.00"), 2);
		Producto producto2 = new ProductoEmpresaTradicional(2, Double.valueOf("10.40"), 3);
		Producto producto3 = new ProductoCooperativa(3, Double.valueOf("140.5"), 1);

		añadirProducto(producto1);
		añadirProducto(producto2);
		añadirProducto(producto3);

	}

	public Producto registrarProducto(Producto producto) {
		Producto p = obtenerProducto(producto.getCodigo());
		actualizarStock(p);
		//obtenerPrecio(p);

		return p;
	}

	/*
	private Producto obtenerPrecio(Producto producto) {
		if (producto.getTipo().equals(TipoProductoEnum.COOPERATIVA)) {
			producto.setPrecio(producto.getPrecio() / 1.10);
		}
		return producto;
	}
	*/

	/*
	 * private Producto obtenerProducto(Producto producto) { 
	 * 	for (int i = 0; i < getProductos().size(); i++) { 
	 * 		Producto productoAObtener = getProductos().get(i); 
	 * 		if (productoAObtener.getCodigo().equals(producto.getCodigo())) { 
	 * 		return productoAObtener; 
	 * 		}
	 *	} return null; 
	 *}
	 */

	/*
	 * private Producto obtenerProducto(Producto producto) { Iterator<Producto> it =
	 * getProductos().iterator(); while (it.hasNext()) { Producto p = it.next(); if
	 * (p.getCodigo().equals(producto.getCodigo())) { return p; }
	 * 
	 * } return null; }
	 */

	private Producto obtenerProducto(Integer codigo) { 
		Producto producto = productos.stream()
				  .filter(p -> codigo.equals(p.getCodigo()))
				  .findAny().orElse(null);
		return producto;
	 }
	
	private void actualizarStock(Producto producto) {
		
	}

	/*
	private void actualizarStock(Producto producto) {
		Iterator<Producto> it = getProductos().iterator();
		while (it.hasNext()) {
			Producto p = it.next();
			if (p.getCodigo().equals(producto.getCodigo())) {
				p.setStock(p.getStock() - 1);
			}

		}
		
	}
	*/

	private void añadirProducto(Producto producto) {
		getProductos().add(producto);
	}

}
