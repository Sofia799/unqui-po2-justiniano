package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private Boolean esDePreciosCuidados;

	public Producto(String nombre, Double precio) {
		setNombre(nombre);
		setPrecio(precio);
		setEsDePreciosCuidados(false);
	}

	public Producto(String nombre, Double precio, Boolean esDePreciosCuidados) {
		setNombre(nombre);
		setPrecio(precio);
		setEsDePreciosCuidados(esDePreciosCuidados);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setEsDePreciosCuidados(Boolean esDePreciosCuidados) {
		this.esDePreciosCuidados = esDePreciosCuidados;
	}

	public Boolean esPrecioCuidado() {
		return esDePreciosCuidados;
	}

	public void aumentarPrecio(Double precio) {
		setPrecio(getPrecio() + precio);

	}

}
