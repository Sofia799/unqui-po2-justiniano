package ar.edu.unq.po2.tp4.tpInterfaces;

public abstract class Producto {
	private Integer codigo;
	private Double precio;
	private Integer stock;
	//private TipoProductoEnum tipo;

	public Producto() {
		super();
	}

	public Producto(Integer codigo) {
		this.codigo = codigo;
	}
	

	public Producto(Integer codigo, Double precio, Integer stock) {
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
	}
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	
}
