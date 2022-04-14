package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad {
	private Double precio;

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esDePreciosCuidados) {
		Producto producto = new Producto(nombre, precio, esDePreciosCuidados);
		setPrecio(producto.getPrecio());
	
	}

	public Double getPrecio() {
		return precio * 0.9;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/*
	public Double precioProductoPrimeraCalidad() {
		return getPrecio() * 0.9;
	}
	*/

}
