package ar.edu.unq.po2.tp4.tpInterfaces;

public class ProductoEmpresaTradicional extends Producto {
	public Double getPrecio() {
		return super.getPrecio();
	}

	public ProductoEmpresaTradicional(int codigo, Double precio, int stock) {
		super(codigo, precio, stock);
	}
	
	public ProductoEmpresaTradicional(int codigo) {
		super(codigo);
	}

}
