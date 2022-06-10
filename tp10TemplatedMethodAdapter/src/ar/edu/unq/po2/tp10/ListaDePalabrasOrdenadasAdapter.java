package ar.edu.unq.po2.tp10;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel{
	
	ListaDePalabrasOrdenadas listaPalabrasOrdenadas;
	
	public ListaDePalabrasOrdenadasAdapter() {
		this.listaPalabrasOrdenadas = new ListaDePalabrasOrdenadas(); 
	}
	
	@Override
	public void addElement(Object e) {
		listaPalabrasOrdenadas.agregarPalabra((String) e);
	}

	@Override
	public Object getElementAt(int i) {
		return listaPalabrasOrdenadas.getPalabraDePosicion(i);
	}

	@Override
	public int getSize() {
		return listaPalabrasOrdenadas.cantidadDePalabras();
	}

}
