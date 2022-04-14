package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esDePreciosCuidados) {
		super(nombre, precio, esDePreciosCuidados);
	}

	public Double getPrecio() {
		return super.getPrecio() * 0.9;
	}

}
