package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ColeccionadorDeObjetos {
	//Collection<Object> unaColeccion = new ArrayList<Object>();
	
	public Object getFirstFrom(ArrayList<Object> collection) {
		return collection.get(0);
	}
	
	public void addLast(Object element, LinkedList<Object> collection) {
		collection.add(element);
	}
	
	public Collection<Object> getSubCollection(List<Object> collection , int x , int y) {
		return collection.subList(x,y);
	}
	
	public Boolean containsElement(List<Object> collection, Object element) {
		return collection.contains(element);
	}
}
