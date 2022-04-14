package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		setNombre(nombre);
		setDireccion(direccion);

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public Integer getCantidadDeProductos() {
		return getProductos().size();
	}

	public void agregarProducto(Producto producto) {
		getProductos().add(producto);

	}

	public Double getPrecioTotal() {
		Double precioTotal = 0d;
		for (int i = 0; i < getProductos().size(); i++) {
			precioTotal = precioTotal + getProductos().get(i).getPrecio();
		}
		return precioTotal;
	}

}
