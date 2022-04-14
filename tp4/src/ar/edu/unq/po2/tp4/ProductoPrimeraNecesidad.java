package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private Double descuento;

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esDePreciosCuidados) {
		super(nombre, precio, esDePreciosCuidados);
	}

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esDePreciosCuidados, Double descuento) {
		super(nombre, precio, esDePreciosCuidados);
		setDescuento(descuento);
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getPrecio() {
		return super.getPrecio() * getDescuento();
	}

}
