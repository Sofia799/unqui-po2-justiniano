package ar.edu.unq.po2tpComposite;

public interface FyleSystem {

	/*
	 * retorna el total ocupado del disco receptor. Expresado en cantidad de bytes
	 */

	public int totalSize();

	/*
	 * Imprime en consola el contenido indicando el nombre del elemento e
	 * identandolo con tantos espacios como profundidad en la estructura
	 */

	public void printStructure();

	/*
	 * elemento mas nuevo
	 */

	public FyleSystem lastModified();

	/*
	 * elemento mas antiguo
	 */

	public FyleSystem oldestElement();
	
	/*
	 * ambos retornan un tipo de elemento FyleSystem.
	 * 
	 * 	Para el primer método puede retornar o el directorio con fecha de creacion más nueva de todos los que
	 * haya, o un archivo con última modificacion mas nueva de los que hayan.
	 * 
	 *	Para el segundo método puede retornar el directorio con fecha de creacion mas vieja de todos los que 
	 * hayan, o un archivo con una modificacion mas vieja de todos los que hayan.
	 * 
	 */

}
