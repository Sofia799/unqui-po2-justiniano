package ar.edu.unq.po2.tp8;

import java.util.List;

public class CarroDeCompras {
	
	private List<Product> products; 
	
	private void setElements(List<Product> productos) {
		this.products = productos;
	}

	public List<Product> getElements() {
		return this.products;
	}
	
	public Integer totalRounded() {
		return 0;
	}
	
	public Double total() {
		return 0.0;
	}

}
