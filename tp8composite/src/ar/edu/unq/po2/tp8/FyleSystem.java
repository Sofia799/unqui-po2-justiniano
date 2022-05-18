package ar.edu.unq.po2.tp8;

import java.util.List;

public interface FyleSystem {

	/**
	 * Retorna el total ocupado en disco del receptor. Expresado en cantidad de
	 * bytes.
	 */
	public int totalSize();

	/**
	 * Imprime en consola el contenido indicando el nombre del elemento e
	 * indentandolo con tantos espacios como profundidad en la estructura.
	 */
	public void printStructure();

	/**
	 * Elemento mas nuevo
	 */
	public List<FyleSystem> lastModified();

	/**
	 * Elemento mas antiguo
	 */
	public List<FyleSystem> oldestElement();

}
