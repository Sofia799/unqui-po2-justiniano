package ar.edu.unq.po2tpComposite;

import java.util.List;

public class CarroDeCompras {
	List<Product> elements;

	public List<Product> getElements() {
		return elements;
	}

	public void setElements(List<Product> elements) {
		this.elements = elements;
	}

	public int totalRounded() {
		return Math.round(total());

	}

	public float total() {
		float totalPrice = 0;
		for (int i = 0; i < getElements().size(); i++) {
			totalPrice = totalPrice + getElements().get(i).getPrice();
		}

		return totalPrice;

	}

}
