package ar.edu.unq.po2.tp4.tpInterfaces;

public class ProductoCooperativa extends Producto {
	public ProductoCooperativa(int codigo, Double precio, int stock) {
		super(codigo, precio, stock);
	}

	public ProductoCooperativa(int codigo) {
		super(codigo);
	}

	public Double getPrecio() {
		return super.getPrecio() / 1.10;
	}
}
